package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.CalcadosDAO;
import br.inatel.ec206.model.Calcados;
import br.inatel.ec206.view.EdicaoCalcadosView;

public class ListenerEditCalcado implements ActionListener {

	private static ListenerEditCalcado listener;
	private static EdicaoCalcadosView edicaoCalcado;
	
	private int ID_calc;
	private String Descricao_calc;
	private String Genero_calc;
	
	private double Preco_calc;
	private int Tamanho_calc;
	private String Cor_calc;
	private int ID_esporte;
	private int ID_marca;
	

	private String esporte;
	private String marca;
	private String genero;

	public static ListenerEditCalcado getInstance(EdicaoCalcadosView editCalcado) {
		if (listener == null) {
			listener = new ListenerEditCalcado();
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
			ID_calc = listaCalcado.get(0).getID_calcados();
			Descricao_calc = listaCalcado.get(0).getDescricao_calc();
			Genero_calc = listaCalcado.get(0).getGenero_calc();
			ID_esporte = listaCalcado.get(0).getID_esporte();
			Preco_calc = listaCalcado.get(0).getPreco_calc();
			Tamanho_calc = listaCalcado.get(0).getTamanho_calc();
			Cor_calc = listaCalcado.get(0).getCor_calc();
			ID_marca= listaCalcado.get(0).getID_marca();
			calcado.setID_calcado(ID_calc);
			
			
			edicaoCalcado.getDescricao().setText(Descricao_calc);
			
			if (Genero_calc.equals("F")) {
				edicaoCalcado.getFemRadioButton().setSelected(true);
			} else {
				if (Genero_calc.equals("M")) {
					edicaoCalcado.getMasclRadioButton().setSelected(true);
				}
			}
			
			edicaoCalcado.getPreco().setText(String.valueOf(Preco_calc));
			edicaoCalcado.getTamanho().setText(String.valueOf(Tamanho_calc));
			edicaoCalcado.getCor().setText(Cor_calc);
			edicaoCalcado.getEsporteCal().setSelectedIndex(ID_esporte);
			edicaoCalcado.getMarcaCal().setSelectedIndex(ID_marca);
			
		}else if (event.getActionCommand() == "EDITAR") {
			CalcadosDAO calcado = new CalcadosDAO();
			if ((edicaoCalcado.getDescricao().getText().equals(""))
					|| (edicaoCalcado.getPreco().getText().equals(""))
					|| (edicaoCalcado.getTamanho().getText().equals(""))
					|| (edicaoCalcado.getCor().getText().equals(""))) {
				JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
			} else {
				if (edicaoCalcado.getFemRadioButton().isSelected()) {
					genero = "F";
				} else {
					if (edicaoCalcado.getMasclRadioButton().isSelected()) {
						genero = "M";
					}
				}
				
				esporte = edicaoCalcado.getEsporteCal().getSelectedItem().toString();
				marca = edicaoCalcado.getMarcaCal().getSelectedItem().toString();

				switch (esporte) {
				case "":
					break;

				case "Futebol":
					ID_esporte = 1;
					break;

				case "Basquete":
					ID_esporte = 2;
					break;

				case "Volei":
					ID_esporte = 3;
					break;
				}
				switch (marca) {
				case "":
					break;

				case "Nike +":
					ID_marca = 1;
					break;

				case "Jordan":
					ID_marca = 2;
					break;

				case "Outra":
					ID_marca = 3;
					break;

				}
				

				calcado.setDescricao_calc(edicaoCalcado.getDescricao().getText());
				
				calcado.setGenero_calc(genero);

				calcado.setID_esporte(ID_esporte);

				calcado.setPreco_calc(Double.parseDouble(edicaoCalcado.getPreco().getText())); // double

				calcado.setTamanho_calc(Integer.parseInt(edicaoCalcado.getTamanho().getText())); // int

				calcado.setCor_calc(edicaoCalcado.getCor().getText());
				
				calcado.setID_marca(ID_marca);

				calcado.update();
			
			}
		}
	}

}
