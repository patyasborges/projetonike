package br.inatel.ec206.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
					 usu.setFoto_usu(conecta._rs.getString(6));
					 
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
		 public List<Administrador> selecionaPorUsername()
		 {
			 // Lista que recebera todos os registros desta tabela
			 List<Administrador> listaAdministrador = new ArrayList<>();
			 try 
			 {
				 // Conecto com o Banco
				 conectaBanco();
				 // Preparo a consulta
				 _pst = _con.prepareStatement("SELECT * FROM administrador WHERE aCodigo in (SELECT aCodigo from administrador where aUserName like ?)");
				 // Indico que o primeiro ? significa o nome digitado pelo usuario
				 _pst.setString(1,"%"+username+"%");
				 // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
				 _rs = _pst.executeQuery();
				 // O metodo next() caminha entre as linhas da tabela de resultados retornada.
				 
				 while (_rs.next()) 
				 {
					// A cada nova interacao, cria um novo objeto Administrador
					 Administrador adm = new Administrador();
					 adm.setCodAdm(_rs.getInt(1));
					 adm.setUsername(_rs.getString(2));
					 adm.setTipoUsu(_rs.getInt(3));
					 adm.setSenha(_rs.getString(4));

					 listaAdministrador.add(adm);
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
					 if (_rs != null) 
					 {
						 _rs.close();
					 }
					 if (_st != null) 
					 {
						 _st.close();
					 }
					 if (_con != null) 
					 {
						 _con.close();
					 }
				 } 
				 catch (SQLException ex) 
				 {
					 System.out.println("Erro: Conexão não pode ser fechada! :(");
				 }
			 }
			 return listaAdministrador;
		 }
}
