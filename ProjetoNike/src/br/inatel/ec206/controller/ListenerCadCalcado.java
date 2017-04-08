package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.CalcadosDAO;
import br.inatel.ec206.view.CadastroCalcadosView;

public class ListenerCadCalcado implements ActionListener {

	private static ListenerCadCalcado listener;
	private static CadastroCalcadosView cadastroCalcado;

	public static ListenerCadCalcado getInstance(CadastroCalcadosView cadCalcados) {
		if (listener == null) {
			listener = new ListenerCadCalcado();
		}
		cadastroCalcado = cadCalcados;
		return listener;
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand() == "CADASTRAR") {

			if ((cadastroCalcado.getDescricao().getText().equals(""))
					|| (cadastroCalcado.getGenero().getText().equals(""))
					|| (cadastroCalcado.getTipo().getText().equals(""))
					|| (cadastroCalcado.getPreco().getText().equals(""))
					|| (cadastroCalcado.getTamanho().getText().equals(""))
					|| (cadastroCalcado.getCor().getText().equals(""))) {
				JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
			} else {

				CalcadosDAO calcado = new CalcadosDAO();

				calcado.setDescricao_calc(cadastroCalcado.getDescricao().getText());
				calcado.setGenero_calc(cadastroCalcado.getGenero().getText());
				calcado.setTipo_calc(cadastroCalcado.getTipo().getText());

				calcado.setPreco_calc(Double.parseDouble(cadastroCalcado.getPreco().getText())); // double

				calcado.setTamanho_calc(Integer.parseInt(cadastroCalcado.getTamanho().getText())); // int

				calcado.setCor_calc(cadastroCalcado.getCor().getText());

				calcado.armazenaNovosDados();

				cadastroCalcado.getDescricao().setText("");
				cadastroCalcado.getGenero().setText("");
				cadastroCalcado.getTipo().setText("");
				cadastroCalcado.getPreco().setText("");
				cadastroCalcado.getTamanho().setText("");
				cadastroCalcado.getCor().setText("");

			}

		}
		if (event.getActionCommand() == "CANCELAR") {
			cadastroCalcado.dispose();
		}
	}
}
