package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;

public class ArtigosDesportivosDAO
{
	Conecta conecta= new Conecta();
	
	int ID_art;
	String Descricao_art;
	String Genero_art;
	int ID_esporte;
	Double Preco_art;
	String Tamanho_art;
	String Cor_art;
	int ID_marca;
	
/////////////////////////////////////////////////////////////////////////////////	

	// (1) INSERT
		 public void armazenaNovosDados()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 
			 try 
			 {
				 // Preparo a insercao
				 conecta._pst = conecta._con.prepareStatement("INSERT INTO Artigos_desportivos(ID_Art,Descricao_art,Genero_art,ID_esporte,Preco_art,Tamanho_art,Cor_art,ID_marca) VALUES(?,?,?,?,?,?,?,?)");
				 // Cada numero indica a posicao que o valor sera inserido nas ? acima
				 conecta._pst.setInt(1, ID_art);
				 conecta._pst.setString(2, Descricao_art);
				 conecta._pst.setString(3, Genero_art);
				 conecta._pst.setInt(4, ID_esporte);
				 conecta._pst.setDouble(5, Preco_art);
				 conecta._pst.setString(6, Tamanho_art);
				 conecta._pst.setString(7, Cor_art);
				 conecta._pst.setInt(8, ID_marca);

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
		 public List<ArtigosDesportivos> selecionaTodos() //MUDAR
		 {
			 // Lista que recebera todos os registros desta tabela
			 List<ArtigosDesportivos> listaArtigos = new ArrayList<>();
			 try 
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 // O metodo createStatement() cria um objeto Statement que permite enviar comandos
				 //SQL para o banco.
				 conecta._st = conecta._con.createStatement();
				 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
				 conecta._rs = conecta._st.executeQuery("SELECT * FROM Artigos_desportivos");
				 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
				 while (conecta._rs.next()) 
				 {
					 // A cada nova interacao, cria um novo objeto Livro
					 ArtigosDesportivos art = new ArtigosDesportivos();
					 art.setID_art(conecta._rs.getInt(1));
					 art.setDescricao_art(conecta._rs.getString(2));
					 art.setGenero_art(conecta._rs.getString(3));
					 art.setID_esporte(conecta._rs.getInt(4));
					 art.setPreco_art(conecta._rs.getDouble(5));
					 art.setTamanho_art(conecta._rs.getString(6));
					 art.setCor_art(conecta._rs.getString(7));
					 art.setID_marca(conecta._rs.getInt(8));
					 
					 // Adiciono na lista
					 listaArtigos.add(art);
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
			 return listaArtigos;
		 }
		 
		// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
		 public List<ArtigosDesportivos> selecionaPorDescricao()
		 {
			 // Lista que recebera todos os registros desta tabela
			 List<ArtigosDesportivos> listaArtigos = new ArrayList<>();
			 try 
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 // Preparo a consulta
				 conecta._pst =  conecta._con.prepareStatement("SELECT * FROM Artigos_desportivos WHERE ID_Art in (SELECT ID_Art from Artigos_desportivos where Descricao_art like ?)");
				 // Indico que o primeiro ? significa o nome digitado pelo usuario
				 conecta._pst.setString(1,"%"+Descricao_art+"%");
				 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
				 conecta._rs =  conecta._pst.executeQuery();
				 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
				 
				 while ( conecta._rs.next()) 
				 {
					// A cada nova interacao, cria um novo objeto Administrador
					 ArtigosDesportivos art= new ArtigosDesportivos();
					 art.setID_art(conecta._rs.getInt(1));
					 art.setDescricao_art(conecta._rs.getString(2));
					 art.setGenero_art(conecta._rs.getString(3));
					 art.setID_esporte(conecta._rs.getInt(4));
					 art.setPreco_art(conecta._rs.getDouble(5));
					 art.setTamanho_art(conecta._rs.getString(6));
					 art.setCor_art(conecta._rs.getString(7));
					 art.setID_marca(conecta._rs.getInt(8));


					 listaArtigos.add(art);
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
			 return listaArtigos;
		 }
		 
		// (3) UPDATE
		 public void update()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 try 
			 {
				 // Preparo a atualizacao
				 conecta._pst = conecta._con.prepareStatement("UPDATE Artigos_desportivos SET Descricao_art = ?,Genero_art = ?,ID_esporte =?, Preco_art =?, Tamanho_art=?, Cor_art=?, ID_marca=? WHERE ID_art = ?");
				
				 
				 conecta._pst.setString(1, Descricao_art);
				 conecta._pst.setString(2, Genero_art);
				 conecta._pst.setInt(3, ID_esporte);
				 conecta._pst.setDouble(4, Preco_art);
				 conecta._pst.setString(5, Tamanho_art);
				 conecta._pst.setString(6, Cor_art);
				 conecta._pst.setInt(7, ID_marca);
				 conecta._pst.setInt(8, ID_art);
				 
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
				 conecta._pst = conecta._con.prepareStatement("DELETE FROM Artigos_desportivos WHERE ID_Art = ?");
				 conecta._pst.setInt(1, ID_art);
				 
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


		
		 
		 ///////////////////////////////////////////////////////////////////////
		 public int getID_art() {
				return ID_art;
			}


			public void setID_art(int iD_art) {
				ID_art = iD_art;
			}


			public String getDescricao_art() {
				return Descricao_art;
			}


			public void setDescricao_art(String descricao_art) {
				Descricao_art = descricao_art;
			}


			public String getGenero_art() {
				return Genero_art;
			}


			public void setGenero_art(String genero_art) {
				Genero_art = genero_art;
			}


			public int getID_esporte() {
				return ID_esporte;
			}


			public void setID_esporte(int iD_esporte) {
				ID_esporte = iD_esporte;
			}


			public Double getPreco_art() {
				return Preco_art;
			}


			public void setPreco_art(Double preco_art) {
				Preco_art = preco_art;
			}


			public String getTamanho_art() {
				return Tamanho_art;
			}


			public void setTamanho_art(String tamanho_art) {
				Tamanho_art = tamanho_art;
			}


			public String getCor_art() {
				return Cor_art;
			}


			public void setCor_art(String cor_art) {
				Cor_art = cor_art;
			}


			public int getID_marca() {
				return ID_marca;
			}


			public void setID_marca(int iD_marca) {
				ID_marca = iD_marca;
			}
		 
}
