package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.CadastroVestuarioView;
import br.inatel.ec206.view.DeletaUsuarioView;

public class ListenerCadVestuario implements ActionListener
{
	private static ListenerCadVestuario listener;
	private static CadastroVestuarioView cadastroVestuario;
	int id_esporte, id_marca;
	String esporte, marca,genero,tamanho;

	public static ListenerCadVestuario getInstance(CadastroVestuarioView cadVest) 
	{
		if (listener == null) {
			listener = new ListenerCadVestuario();
		}
		cadastroVestuario = cadVest;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "CADASTRAR") 
		{
			esporte=cadastroVestuario.getCmbbxEsporte().getSelectedItem().toString();
			marca =cadastroVestuario.getCmbbxMarca().getSelectedItem().toString();
			tamanho= cadastroVestuario.getCmbbxTamanho().getSelectedItem().toString();
			
			if (cadastroVestuario.getTxtDescricao().getText().equals("") || cadastroVestuario.getTxtPreco().getText().equals("") || cadastroVestuario.getTxtCor().getText().equals("")
					|| (!cadastroVestuario.getRdbtnFeminino().isSelected() && !cadastroVestuario.getRdbtnMasculino().isSelected()) 
					|| esporte.equals("") || marca.equals("") || tamanho.equals("")) 
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			} 
			else
			{
				switch(esporte)
				{
					case "":
					break;
					
					case "Futebol":
						id_esporte=1;
						break;
						
					case "Basquete":
						id_esporte=2;
						break;
						
					case "Volei":
						id_esporte=3;
						break;
				
				}
				
				switch(marca)
				{
					case "":
					break;
					
					case "Nike +":
						id_marca=1;
						break;
						
					case "Jordan":
						id_marca=2;
						break;
						
					case "Outra":
						id_marca=3;
						break;
				
				}
				
				if(cadastroVestuario.getRdbtnFeminino().isSelected())
				{
					genero="F";
				}
				else
				{
					if(cadastroVestuario.getRdbtnMasculino().isSelected())
					{
						genero="M";
					}
				}
				
				VestuarioDAO vest = new VestuarioDAO();
				
				vest.setDescricao_vest(cadastroVestuario.getTxtDescricao().getText());
				vest.setGenero_vest(genero);
				vest.setID_esporte(id_esporte);
				vest.setPreco_vest(Double.parseDouble(cadastroVestuario.getTxtPreco().getText()));
				vest.setTamanho_vest(cadastroVestuario.getCmbbxTamanho().getSelectedItem().toString());
				vest.setCor_vest(cadastroVestuario.getTxtCor().getText());
				vest.setID_marca(id_marca);

				vest.armazenaNovosDados();

				cadastroVestuario.getTxtDescricao().setText("");
				cadastroVestuario.getTxtPreco().setText("");
				cadastroVestuario.getCmbbxTamanho().setSelectedIndex(0);
				cadastroVestuario.getTxtCor().setText("");
				cadastroVestuario.getCmbbxEsporte().setSelectedIndex(0);
				cadastroVestuario.getCmbbxMarca().setSelectedIndex(0);
				cadastroVestuario.getRdbtnFeminino().setSelected(false);
				cadastroVestuario.getRdbtnMasculino().setSelected(false);
			}
			
			
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			cadastroVestuario.dispose();
		}
		
		if (event.getActionCommand() == "F") 
		{
			cadastroVestuario.getRdbtnMasculino().setSelected(false);
		}
		
		if (event.getActionCommand() == "M") 
		{
			cadastroVestuario.getRdbtnFeminino().setSelected(false);
		}
	}

}
