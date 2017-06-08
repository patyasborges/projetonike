package br.inatel.ec206.model;

public class Usuario
{
	int ID_usu;
	String Nome_usu;
	String Data_nascimento_usu;
	String email_usu;
	int Tipo_usu;
	String Senha_usu;
	public static String usu_logado;
	
	public String getUsu_logado() {
		return usu_logado;
	}
	public void setUsu_logado(String usu_logado) {
		this.usu_logado = usu_logado;
	}
	public String getSenha_usu() {
		return Senha_usu;
	}
	public void setSenha_usu(String senha_usu) {
		Senha_usu = senha_usu;
	}
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
