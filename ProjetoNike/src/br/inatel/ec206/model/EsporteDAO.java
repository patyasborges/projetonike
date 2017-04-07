package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;

public class EsporteDAO 
{
	Conecta conecta = new Conecta();
	
	int ID_Esporte;
	String Nome_Esporte;
	
	/////////////////////////////////////////////////////////////
	
	// (1) INSERT
			 public void armazenaNovosDados()
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 
				 try 
				 {
					 // Preparo a insercao
					 conecta._pst = conecta._con.prepareStatement("INSERT INTO Esportes(ID_Esporte,Nome_Esporte) VALUES(?,?)");
					 // Cada numero indica a posicao que o valor sera inserido nas ? acima
					 conecta._pst.setInt(1, ID_Esporte);
					 conecta._pst.setString(2, Nome_Esporte);

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
			 public List<Esporte> selecionaTodos() //MUDAR
			 {
				 // Lista que recebera todos os registros desta tabela
				 List<Esporte> listaEsporte = new ArrayList<>();
				 try 
				 {
					 // Conecto com o Banco
					 conecta.conectaBanco();
					 // O metodo createStatement() cria um objeto Statement que permite enviar comandos
					 //SQL para o banco.
					 conecta._st = conecta._con.createStatement();
					 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
					 conecta._rs = conecta._st.executeQuery("SELECT * FROM Esportes");
					 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
					 while (conecta._rs.next()) 
					 {
						 // A cada nova interacao, cria um novo objeto Livro
						 Esporte esp = new Esporte();
						 esp.setID_Esporte(conecta._rs.getInt(1));
						 esp.setNome_Esporte(conecta._rs.getString(2));
						 
						 // Adiciono na lista
						 listaEsporte.add(esp);
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
				 return listaEsporte;
			 }
			 
			// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
			 public List<Esporte> selecionaPorNome()
			 {
				 // Lista que recebera todos os registros desta tabela
				 List<Esporte> listaEsporte = new ArrayList<>();
				 try 
				 {
					 // Conecto com o Banco
					 conecta.conectaBanco();
					 // Preparo a consulta
					 conecta._pst =  conecta._con.prepareStatement("SELECT * FROM Esportes WHERE ID_Esporte in (SELECT ID_Esporte from esportes where Nome_Esporte like ?)");
					 // Indico que o primeiro ? significa o nome digitado pelo usuario
					 conecta._pst.setString(1,"%"+Nome_Esporte+"%");
					 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
					 conecta._rs =  conecta._pst.executeQuery();
					 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
					 
					 while ( conecta._rs.next()) 
					 {
						// A cada nova interacao, cria um novo objeto Administrador
						 Esporte esp = new Esporte();
						 esp.setID_Esporte(conecta._rs.getInt(1));
						 esp.setNome_Esporte(conecta._rs.getString(2));

						 listaEsporte.add(esp);
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
				 return listaEsporte;
			 }
			 
			// (3) UPDATE
			 public void update()
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 try 
				 {
					 // Preparo a atualizacao
					 conecta._pst = conecta._con.prepareStatement("UPDATE Esportes SET Nome_Esporte = ?, WHERE ID_Esporte = ?");
					
					 conecta._pst.setString(1, Nome_Esporte);
					 conecta._pst.setInt(2, ID_Esporte);
					 //System.out.println(ID_usu); 
					 
					 // Executo a atualizacao
					 conecta._pst.executeUpdate();
					 //System.out.println("Sucesso! ;)");
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
					 conecta._pst = conecta._con.prepareStatement("DELETE FROM Esportes WHERE ID_Esporte = ?");
					 conecta._pst.setInt(1, ID_Esporte);
					 
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
	///////////////////////////////////////////////////////


			public int getID_Esporte() {
				return ID_Esporte;
			}


			public void setID_Esporte(int iD_Esporte) {
				ID_Esporte = iD_Esporte;
			}


			public String getNome_Esporte() {
				return Nome_Esporte;
			}


			public void setNome_Esporte(String nome_Esporte) {
				Nome_Esporte = nome_Esporte;
			}

			 
}
