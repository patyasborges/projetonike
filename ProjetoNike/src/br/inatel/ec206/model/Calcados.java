package br.inatel.ec206.model;

public class Calcados {
	
	private int ID_calcados;
	private String Descricao_calc;
	private String Genero_calc;
	private String Tipo_calc; // (para qualquer esporte)
	private double Preco_calc;
	private int Tamanho_calc;
	private String Cor_calc;
	private int ID_esporte;
	private int ID_marca;

	public String getDescricao_calc() {
		return Descricao_calc;
	}

	public void setDescricao_calc(String descricao_calc) {
		Descricao_calc = descricao_calc;
	}

	public String getGenero_calc() {
		return Genero_calc;
	}

	public void setGenero_calc(String genero_calc) {
		Genero_calc = genero_calc;
	}

	public String getTipo_calc() {
		return Tipo_calc;
	}

	public void setTipo_calc(String tipo_calc) {
		Tipo_calc = tipo_calc;
	}

	public double getPreco_calc() {
		return Preco_calc;
	}

	public void setPreco_calc(double preco_calc) {
		Preco_calc = preco_calc;
	}

	public int getTamanho_calc() {
		return Tamanho_calc;
	}

	public void setTamanho_calc(int tamanho_calc) {
		Tamanho_calc = tamanho_calc;
	}

	public String getCor_calc() {
		return Cor_calc;
	}

	public void setCor_calc(String cor_calc) {
		Cor_calc = cor_calc;
	}

	public int getID_calcados() {
		return ID_calcados;
	}

	public void setID_calcados(int iD_calcados) {
		ID_calcados = iD_calcados;
	}

	public int getID_esporte() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getID_marca() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
