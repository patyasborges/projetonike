package br.inatel.ec206.controller;

import java.sql.SQLException;

public class UsuarioDAO 
{
	Conecta conecta = new Conecta();
	
	//--------------------------------------------------------------------
	int ID_usu;
	String Nome_usu;
	String Data_nascimento_usu;
	String email_usu;
	int Tipo_usu;
	String foto_usu;

		 //---------------------------------------------------------------------
	
	// (1) INSERT
		 public void armazenaNovosDados()
		 {
			 // Conecto com o Banco
			 conecta.conectaBanco();
			 
			 try 
			 {
				 // Preparo a insercao
				 conecta._pst = conecta._con.prepareStatement("INSERT INTO usuario(ID_usu,Nome_usu,Data_nascimento_usu,email_usu, Tipo_usu, foto_usu) VALUES(?,?,?,?,?,?)");
				 // Cada numero indica a posicao que o valor sera inserido nas ? acima
				 conecta._pst.setInt(1, ID_usu);
				 conecta._pst.setString(2, Nome_usu);
				 conecta._pst.setString(3, Data_nascimento_usu);
				 conecta._pst.setString(4, email_usu);
				 conecta._pst.setInt(3, Tipo_usu);
				 conecta._pst.setString(4, foto_usu);


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


}
