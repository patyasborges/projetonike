package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;

public class MarcasDAO
{
	Conecta conecta= new Conecta();
	
	int ID_marca;
	String Nome_marca;
	
	////////////////////////////////////////////////////////////////////////////////////
	
	
	// (1) INSERT
	 public void armazenaNovosDados()
	 {
		 // Conecto com o Banco
		 conecta.conectaBanco();
		 
		 try 
		 {
			 // Preparo a insercao
			 conecta._pst = conecta._con.prepareStatement("INSERT INTO Marcas(ID_marca,Nome_marca) VALUES(?,?)");
			 // Cada numero indica a posicao que o valor sera inserido nas ? acima
			 conecta._pst.setInt(1, ID_marca);
			 conecta._pst.setString(2, Nome_marca);

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
	 public List<Marcas> selecionaTodos() //MUDAR
	 {
		 // Lista que recebera todos os registros desta tabela
		 List<Marcas> listaMarcas = new ArrayList<>();
		 try 
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 // O metodo createStatement() cria um objeto Statement que permite enviar comandos
			 //SQL para o banco.
			 conecta._st = conecta._con.createStatement();
			 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
			 conecta._rs = conecta._st.executeQuery("SELECT * FROM Marcas");
			 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
			 while (conecta._rs.next()) 
			 {
				 // A cada nova interacao, cria um novo objeto Livro
				 Marcas marca = new Marcas();
				 marca.setID_marca(conecta._rs.getInt(1));
				 marca.setNome_marca(conecta._rs.getString(2));
				 
				 // Adiciono na lista
				 listaMarcas.add(marca);
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
		 return listaMarcas;
	 }
	 
	// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
	 public List<Marcas> selecionaPorNome()
	 {
		 // Lista que recebera todos os registros desta tabela
		 List<Marcas> listaMarca = new ArrayList<>();
		 try 
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 // Preparo a consulta
			 conecta._pst =  conecta._con.prepareStatement("SELECT * FROM Marcas WHERE ID_marca in (SELECT ID_marca from Marcas where Nome_marca like ?)");
			 // Indico que o primeiro ? significa o nome digitado pelo usuario
			 conecta._pst.setString(1,"%"+Nome_marca+"%");
			 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
			 conecta._rs =  conecta._pst.executeQuery();
			 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
			 
			 while ( conecta._rs.next()) 
			 {
				// A cada nova interacao, cria um novo objeto Administrador
				 Marcas marca = new Marcas();
				 marca.setID_marca(conecta._rs.getInt(1));
				 marca.setNome_marca(conecta._rs.getString(2));

				 listaMarca.add(marca);
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
		 return listaMarca;
	 }
	 
	// (3) UPDATE
	 public void update()
	 {
		 // Conecto com o Banco
		 conecta.conectaBanco();
		 try 
		 {
			 // Preparo a atualizacao
			 conecta._pst = conecta._con.prepareStatement("UPDATE Marcas SET Nome_marca = ?, WHERE ID_marca = ?");
			
			 conecta._pst.setString(1, Nome_marca);
			 conecta._pst.setInt(2, ID_marca);
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
			 conecta._pst = conecta._con.prepareStatement("DELETE FROM Marcas WHERE ID_marca = ?");
			 conecta._pst.setInt(1, ID_marca);
			 
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


	 ///////////////////////////////////////////////////////////////////////////
	 
		public int getID_marca() {
			return ID_marca;
		}


		public void setID_marca(int iD_marca) {
			ID_marca = iD_marca;
		}


		public String getNome_marca() {
			return Nome_marca;
		}


		public void setNome_marca(String nome_marca) {
			Nome_marca = nome_marca;
		}
}
