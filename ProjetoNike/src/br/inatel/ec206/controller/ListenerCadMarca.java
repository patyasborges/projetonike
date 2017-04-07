package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.CadastroMarcaView;
import br.inatel.ec206.view.DeletaVestuarioView;

public class ListenerCadMarca implements ActionListener
{
	private static ListenerCadMarca listener;
	private static CadastroMarcaView cadastraMarca;
	
	public static ListenerCadMarca getInstance(CadastroMarcaView cadMarca) 
	{
		if (listener == null) 
		{
			listener = new ListenerCadMarca();
		}
		cadastraMarca = cadMarca;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "CADASTRAR") 
		{
			if (cadastraMarca.getTxtMarca().getText().equals("")) 
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			}
			else 
			{
				ListenerCadMarca list = new ListenerCadMarca();
				
				MarcasDAO marca = new MarcasDAO();

				marca.setNome_marca(cadastraMarca.getTxtMarca().getText());
				marca.armazenaNovosDados();

				cadastraMarca.getTxtMarca().setText("");
				
			}
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			cadastraMarca.dispose();
		}
		
	}

}
