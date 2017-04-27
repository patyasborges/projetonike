package br.inatel.ec206.model;

public class Acesso {
	
	private int ID_Login;
	private String Login;
	private String Senha;
	private int ID_usu;
	
	public int getID_Login() {
		return ID_Login;
	}
	public void setID_Login(int iD_Login) {
		ID_Login = iD_Login;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public int getID_usu() {
		return ID_usu;
	}
	public void setID_usu(int iD_usu) {
		ID_usu = iD_usu;
	}

}