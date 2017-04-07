package br.inatel.ec206.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.controller.Conecta;
import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.Vestuario;

public class VestuarioDAO 
{
	Conecta conecta = new Conecta();
	
//------------------------------------------------------------------------
	int ID_vest;
	String Descricao_vest;
	String Genero_vest;
	int ID_esporte;
	double Preco_vest;
	String Tamanho_vest;
	String Cor_vest;
	int ID_marca;
	
//------------------------------------------------------------------------
	
	
	// (1) INSERT
			 public void armazenaNovosDados()
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 
				 try 
				 {
					 // Preparo a insercao
					 conecta._pst = conecta._con.prepareStatement("INSERT INTO vestuario(ID_vest, Descricao_vest, Genero_vest, ID_Esporte, Preco_vest, Tamanho_vest, Cor_vest, ID_marca) VALUES(?,?,?,?,?,?,?,?)");
					 // Cada numero indica a posicao que o valor sera inserido nas ? acima
					 conecta._pst.setInt(1, ID_vest);
					 conecta._pst.setString(2, Descricao_vest);
					 conecta._pst.setString(3, Genero_vest);
					 conecta._pst.setInt(4, ID_esporte);
					 conecta._pst.setDouble(5, Preco_vest);
					 conecta._pst.setString(6, Tamanho_vest);
					 conecta._pst.setString(7, Cor_vest);
					 conecta._pst.setInt(8, ID_marca);
			

					 // Executo a pesquisa
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
					 } catch (SQLException ex) 
					 {
						 System.out.println("Erro: Conexão não pode ser fechada! :(");
					 }
				 }
			}

			// (2.1) SELECT ALL: Seleciona todos os registros desta tabela.
			 public List<Vestuario> selecionaTodos() //MUDAR
			 {
				 // Lista que recebera todos os registros desta tabela
				 List<Vestuario> listaVest = new ArrayList<>();
				 try 
				 {
					 // Conecto com o Banco
					 conecta.conectaBanco();
					 // O metodo createStatement() cria um objeto Statement que permite enviar comandos
					 //SQL para o banco.
					 conecta._st = conecta._con.createStatement();
					 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
					 conecta._rs = conecta._st.executeQuery("SELECT * FROM vestuario");
					 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
					 while (conecta._rs.next()) 
					 {
						 // A cada nova interacao, cria um novo objeto Livro
						 Vestuario vest = new Vestuario();
						 vest.setID_vest(conecta._rs.getInt(1));				 
						 vest.setDescricao_vest(conecta._rs.getString(2));				 
						 vest.setGenero_vest(conecta._rs.getString(3));		
						 vest.setID_esporte(conecta._rs.getInt(4));
						 vest.setPreco_vest(conecta._rs.getInt(5));
						 vest.setTamanho_vest(conecta._rs.getString(6));
						 vest.setCor_vest(conecta._rs.getString(7));
						 vest.setID_marca(conecta._rs.getInt(8));
						 
						 // Adiciono na lista
						 listaVest.add(vest);
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
				 return listaVest;
			 }
			 
			// (2.2) SELECT POR NOME OU POR PARTE DE UM NOME
			 public List<Vestuario> selecionaPorDescricao()
			 {
				 // Lista que recebera todos os registros desta tabela
				 List<Vestuario> listaVest = new ArrayList<>();
				 try 
				 {
					 // Conecto com o Banco
					 conecta.conectaBanco();
					 // Preparo a consulta
					 conecta._pst =  conecta._con.prepareStatement("SELECT * FROM Vestuario WHERE ID_vest in (SELECT ID_vest from Vestuario where Descricao_vest like ?)");
					 // Indico que o primeiro ? significa o nome digitado pelo usuario
					 conecta._pst.setString(1,"%"+Descricao_vest+"%");
					 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
					 conecta._rs =  conecta._pst.executeQuery();
					 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
					 
					 while ( conecta._rs.next()) 
					 {
						// A cada nova interacao, cria um novo objeto Administrador
						 Vestuario vest = new Vestuario();
						 vest.setID_vest(conecta._rs.getInt(1));
						 vest.setDescricao_vest(conecta._rs.getString(2));
						 vest.setGenero_vest(conecta._rs.getString(3));
						 vest.setID_esporte(conecta._rs.getInt(4));
						 vest.setPreco_vest(conecta._rs.getDouble(5));
						 vest.setTamanho_vest(conecta._rs.getString(6));
						 vest.setCor_vest(conecta._rs.getString(7));
						 vest.setID_marca(conecta._rs.getInt(8));
						 
						 listaVest.add(vest);
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
				 return listaVest;
			 }
			 
			// (3) UPDATE
			 public void update()
			 {
				 // Conecto com o Banco
				 conecta.conectaBanco();
				 try 
				 {
					 // Preparo a atualizacao
					 conecta._pst = conecta._con.prepareStatement("UPDATE Vestuario SET Descricao_vest = ?,Genero_vest = ?,ID_esporte =?, Preco_vest=?, Tamanho_vest=?, Cor_vest=?, ID_marca=? WHERE ID_vest = ?");
					
					 conecta._pst.setString(1, Descricao_vest);
					 conecta._pst.setString(2, Genero_vest);
					 conecta._pst.setInt(3, ID_esporte);
					 conecta._pst.setDouble(4, Preco_vest);
					 conecta._pst.setString(5, Tamanho_vest);
					 conecta._pst.setString(6, Cor_vest);
					 conecta._pst.setInt(7, ID_marca);
					 conecta._pst.setInt(8, ID_vest);
					
					 
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
					 conecta._pst = conecta._con.prepareStatement("DELETE FROM Vestuario WHERE ID_vest = ?");
					 conecta._pst.setInt(1, ID_vest);
					 
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

			
			 
			 /////////////// Getters and setters
			 
			 public int getID_vest() {
					return ID_vest;
				}

				public void setID_vest(int iD_vest) {
					ID_vest = iD_vest;
				}

				public String getDescricao_vest() {
					return Descricao_vest;
				}

				public void setDescricao_vest(String descricao_vest) {
					Descricao_vest = descricao_vest;
				}

				public String getGenero_vest() {
					return Genero_vest;
				}

				public void setGenero_vest(String genero_vest) {
					Genero_vest = genero_vest;
				}

				public int getID_esporte() {
					return ID_esporte;
				}

				public void setID_esporte(int iD_esporte) {
					ID_esporte = iD_esporte;
				}

				public double getPreco_vest() {
					return Preco_vest;
				}

				public void setPreco_vest(double preco_vest) {
					Preco_vest = preco_vest;
				}

				public String getTamanho_vest() {
					return Tamanho_vest;
				}

				public void setTamanho_vest(String tamanho_vest) {
					Tamanho_vest = tamanho_vest;
				}

				public String getCor_vest() {
					return Cor_vest;
				}

				public void setCor_vest(String cor_vest) {
					Cor_vest = cor_vest;
				}

				public int getID_marca() {
					return ID_marca;
				}

				public void setID_marca(int iD_marca) {
					ID_marca = iD_marca;
				}
			 
}
