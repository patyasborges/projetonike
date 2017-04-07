package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;
import br.inatel.ec206.model.Usuario;

public class UsuarioDAO 
{
	Conecta conecta = new Conecta();
	
	//--------------------------------------------------------------------
	int ID_usu;
	
	String Nome_usu;
	String Data_nascimento_usu;
	String email_usu;
	int Tipo_usu;

		 //---------------------------------------------------------------------
	
	// (1) INSERT
		 public void armazenaNovosDados()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 
			 try 
			 {
				 // Preparo a insercao
				 conecta._pst = conecta._con.prepareStatement("INSERT INTO usuario(ID_usu,Nome_usu,Data_nascimento_usu,email_usu,Tipo_usu) VALUES(?,?,?,?,?)");
				 // Cada numero indica a posicao que o valor sera inserido nas ? acima
				 conecta._pst.setInt(1, ID_usu);
				 conecta._pst.setString(2, Nome_usu);
				 conecta._pst.setString(3, Data_nascimento_usu);
				 conecta._pst.setString(4, email_usu);
				 conecta._pst.setInt(5, Tipo_usu);



				 // Executo a pesquisa
				 conecta._pst.executeUpdate();
				 System.out.println("Sucesso! ;)");
			 } 
			 catch (SQLException ex) 
			 {
				 System.out.println("erro aqui");
				 System.out.println("Erro: Conexão Banco! :(");
			 }
			 finally
			 {
				 // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
				 try
				 {
					 if (conecta._rs != null) 
					 {
						 conecta._rs.close();
					 }
					 if (conecta._pst != null) 
					 {
						 conecta._pst.close();
					 }
					 if (conecta._con != null) 
					 {
						 conecta._con.close();
					 }
				 } catch (SQLException ex) 
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			 }
		}


		// (2.1) SELECT ALL: Seleciona todos os registros desta tabela.
		 public List<Usuario> selecionaTodos() //MUDAR
		 {
			 // Lista que recebera todos os registros desta tabela
			 List<Usuario> listaUsuario = new ArrayList<>();
			 try 
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 // O metodo createStatement() cria um objeto Statement que permite enviar comandos
				 //SQL para o banco.
				 conecta._st = conecta._con.createStatement();
				 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
				 conecta._rs = conecta._st.executeQuery("SELECT * FROM usuario");
				 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
				 while (conecta._rs.next()) 
				 {
					 // A cada nova interacao, cria um novo objeto Livro
					 Usuario usu = new Usuario();
					 usu.setID_usu(conecta._rs.getInt(1));				 
					 usu.setNome_usu(conecta._rs.getString(2));				 
					 usu.setData_nascimento_usu(conecta._rs.getString(3));		
					 usu.setEmail_usu(conecta._rs.getString(4));
					 usu.setTipo_usu(conecta._rs.getInt(5));
					 
					 // Adiciono na lista
					 listaUsuario.add(usu);
				 }
				 System.out.println("Sucesso! ;)");
			 } 
			 catch (SQLException ex) 
			 {
				 System.out.println("Erro: Conexão Banco! :(");
			 }
			 finally
			 {
				 // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
				 try
				 {
					 if (conecta._rs != null)
					 {
						 conecta._rs.close();
					 }
					 if (conecta._st != null)
					 {
						 conecta._st.close();
					 }
					 if (conecta._con != null) 
					 {
						 conecta._con.close();
					 }
				 } 
				 catch (SQLException ex) 
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			 }
			 return listaUsuario;
		 }
		 
		// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
		 public List<Usuario> selecionaPorNome()
		 {
			 // Lista que recebera todos os registros desta tabela
			 List<Usuario> listaUsuario = new ArrayList<>();
			 try 
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 // Preparo a consulta
				 conecta._pst =  conecta._con.prepareStatement("SELECT * FROM Usuario WHERE ID_usu in (SELECT ID_usu from Usuario where Nome_usu like ?)");
				 // Indico que o primeiro ? significa o nome digitado pelo usuario
				 conecta._pst.setString(1,"%"+Nome_usu+"%");
				 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
				 conecta._rs =  conecta._pst.executeQuery();
				 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
				 
				 while ( conecta._rs.next()) 
				 {
					// A cada nova interacao, cria um novo objeto Administrador
					 Usuario usu = new Usuario();
					 usu.setID_usu(conecta._rs.getInt(1));
					 usu.setNome_usu(conecta._rs.getString(2));
					 usu.setData_nascimento_usu(conecta._rs.getString(3));
					 usu.setEmail_usu(conecta._rs.getString(4));
					 usu.setTipo_usu(conecta._rs.getInt(5));


					 listaUsuario.add(usu);
				 }
				 System.out.println("Sucesso! ;)");
			 } 
			 catch (SQLException ex) 
			 {
				 System.out.println("Erro: Conexão Banco! :(");
			 } 
			 finally
			 {
				 // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
				 try
				 {
					 if ( conecta._rs != null) 
					 {
						 conecta._rs.close();
					 }
					 if ( conecta._st != null) 
					 {
						 conecta._st.close();
					 }
					 if ( conecta._con != null) 
					 {
						 conecta._con.close();
					 }
				 } 
				 catch (SQLException ex) 
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			 }
			 return listaUsuario;
		 }
		 
		// (3) UPDATE
		 public void update()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 try 
			 {
				 // Preparo a atualizacao
				 conecta._pst = conecta._con.prepareStatement("UPDATE Usuario SET Nome_usu = ?,Data_nascimento_usu = ?,email_usu = ?,Tipo_usu= ? WHERE ID_usu = ?");
				
				 conecta._pst.setString(1, Nome_usu);
				 conecta._pst.setString(2, Data_nascimento_usu);
				 conecta._pst.setString(3, email_usu);
				 conecta._pst.setInt(4, Tipo_usu);
				 conecta._pst.setInt(5, ID_usu);

				 
				 // Executo a atualizacao
				 conecta._pst.executeUpdate();
				 System.out.println("Sucesso! ;)");
			 } 
			 catch (SQLException ex)
			 {
				 System.out.println("Erro: Conexão Banco! :(");
			 } 
			 finally
			 {
				 // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
				 try
				 {
					 if (conecta._rs != null) 
					 {
						 conecta._rs.close();
					 }
					 if (conecta._pst != null) 
					 {
						 conecta._pst.close();
					 }
					 if (conecta._con != null)
					 {
						 conecta._con.close();
					 }
				 } 
				 catch (SQLException ex)
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			 }
		}
		 
		// (4) DELETE
		 public void delete()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 try
			 {
				 // Preparo a exclusao
				 conecta._pst = conecta._con.prepareStatement("DELETE FROM Usuario WHERE ID_usu = ?");
				 conecta._pst.setInt(1, ID_usu);
				 
				 // Executo a exclusao
				 conecta._pst.executeUpdate();
				 System.out.println("Sucesso! ;)");
			 }
			 catch (SQLException ex) 
			 {
				 System.out.println("Erro: Conexão Banco! :(");
			 }
			 finally
			 {
				 // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
				 try
				 {
					 if (conecta._rs != null)
					 {
						 conecta._rs.close();
					 }
					 if (conecta._pst != null)
					 {
						 conecta._pst.close();
					 }
					 if (conecta._con != null)
					 {
						 conecta._con.close();
					 }
				 }
				 catch (SQLException ex)
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			}
		}
		 
		 
		 /////////////////////////////////////////////
		 
		 public int getID_usu() {
				return ID_usu;
			}


			public void setID_usu(int iD_usu) {
				ID_usu = iD_usu;
			}


			public String getNome_usu() {
				return Nome_usu;
			}


			public void setNome_usu(String nome_usu) {
				Nome_usu = nome_usu;
			}


			public String getData_nascimento_usu() {
				return Data_nascimento_usu;
			}


			public void setData_nascimento_usu(String data_nascimento_usu) {
				Data_nascimento_usu = data_nascimento_usu;
			}


			public String getEmail_usu() {
				return email_usu;
			}


			public void setEmail_usu(String email_usu) {
				this.email_usu = email_usu;
			}


			public int getTipo_usu() {
				return Tipo_usu;
			}


			public void setTipo_usu(int tipo_usu) {
				Tipo_usu = tipo_usu;
			}


}
