package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.CalcadosDAO;
import br.inatel.ec206.view.CadastroCalcadoView;

public class ListenerCadCalcado implements ActionListener {

	private static ListenerCadCalcado listener;
	private static CadastroCalcadoView cadastroCalcado;

	private int id_esporte;
	private int id_marca;
	private String esporte;
	private String marca;
	private String genero;

	public static ListenerCadCalcado getInstance(CadastroCalcadoView cadCalcados) {
		if (listener == null) {
			listener = new ListenerCadCalcado();
		}
		cadastroCalcado = cadCalcados;
		return listener;
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand() == "CADASTRAR") {

			if ((cadastroCalcado.getDescricao().getText().equals(""))
					|| (cadastroCalcado.getPreco().getText().equals(""))
					|| (cadastroCalcado.getTamanho().getText().equals(""))
					|| (cadastroCalcado.getCor().getText().equals(""))) {
				JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
			} else {
				if (cadastroCalcado.getFemRadioButton().isSelected()) {
					genero = "F";
				} else {
					if (cadastroCalcado.getMasclRadioButton().isSelected()) {
						genero = "M";
					}
				}
				
				esporte = cadastroCalcado.getEsporteCal().getSelectedItem().toString();
				marca = cadastroCalcado.getMarcaCal().getSelectedItem().toString();

				switch (esporte) {
				case "":
					break;

				case "Futebol":
					id_esporte = 1;
					break;

				case "Basquete":
					id_esporte = 2;
					break;

				case "Volei":
					id_esporte = 3;
					break;
				}
				switch (marca) {
				case "":
					break;

				case "Nike +":
					id_marca = 1;
					break;

				case "Jordan":
					id_marca = 2;
					break;

				case "Outra":
					id_marca = 3;
					break;

				}
				CalcadosDAO calcado = new CalcadosDAO();

				calcado.setDescricao_calc(cadastroCalcado.getDescricao().getText());
				
				calcado.setGenero_calc(genero);

				calcado.setID_esporte(id_esporte);

				calcado.setPreco_calc(Double.parseDouble(cadastroCalcado.getPreco().getText())); // double

				calcado.setTamanho_calc(Integer.parseInt(cadastroCalcado.getTamanho().getText())); // int

				calcado.setCor_calc(cadastroCalcado.getCor().getText());
				
				calcado.setID_marca(id_marca);

				calcado.armazenaNovosDados();

				cadastroCalcado.getDescricao().setText("");
				//cadastroCalcado.getGenero().setText("");

				// cadastroCalcado.getTipo().setText("");

				cadastroCalcado.getPreco().setText("");
				cadastroCalcado.getTamanho().setText("");
				cadastroCalcado.getCor().setText("");

			}

			if (event.getActionCommand() == "CANCELAR") {
				cadastroCalcado.dispose();
			}
		}
	}
}
