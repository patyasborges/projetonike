package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.model.CalcadosDAO;
import br.inatel.ec206.model.Calcados;
import br.inatel.ec206.view.EdicaoCalcadosView;

public class ListnerEditCalcado implements ActionListener {

	private static ListnerEditCalcado listener;
	private static EdicaoCalcadosView edicaoCalcado;
	
	private int ID_calcado;
	private String Descricao_calc;
	private String Genero_calc;
	private String Tipo_calc; // (para qualquer esporte)
	private double Preco_calc;
	private int Tamanho_calc;
	private String Cor_calc;
	
	

	public static ListnerEditCalcado getInstance(EdicaoCalcadosView editCalcado) {
		if (listener == null) {
			listener = new ListnerEditCalcado();
		}
		edicaoCalcado = editCalcado;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") {
			CalcadosDAO calcado = new CalcadosDAO();
			List<Calcados> listaCalcado = new ArrayList<>();
			
			calcado.setDescricao_calc(edicaoCalcado.getPesquisaCal().getText());
			
			listaCalcado = calcado.selecionaPorNome();
			ID_calcado = listaCalcado.get(0).getID_calcados();
			Descricao_calc = listaCalcado.get(0).getDescricao_calc();
			Genero_calc = listaCalcado.get(0).getGenero_calc();
			Tipo_calc = listaCalcado.get(0).getTipo_calc();
			Preco_calc = listaCalcado.get(0).getPreco_calc();
			Tamanho_calc = listaCalcado.get(0).getTamanho_calc();
			Cor_calc = listaCalcado.get(0).getCor_calc();
			
			calcado.setID_calcado(ID_calcado);
			
			
			edicaoCalcado.getDescricao().setText(Descricao_calc);
			edicaoCalcado.getGenero().setText(Genero_calc);
			edicaoCalcado.getTipo().setText(Tipo_calc);
			edicaoCalcado.getPreco().setText(String.valueOf(Preco_calc));
			edicaoCalcado.getTamanho().setText(String.valueOf(Tamanho_calc));
			edicaoCalcado.getCor().setText(Cor_calc);
			
		}
	}

}
