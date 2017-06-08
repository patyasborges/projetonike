package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.EdicaoUsuarioView;
import br.inatel.ec206.view.PesquisarArtigDesportView;
import br.inatel.ec206.view.PesquisarCalcadoView;
import br.inatel.ec206.view.PesquisarEsporteView;
import br.inatel.ec206.view.PesquisarMarcaView;
import br.inatel.ec206.view.PesquisarVestuarioView;

public class ListenerCliente implements ActionListener
{
	
	private static ListenerCliente listener;
	private static ClienteView cliente;
	

	public static ListenerCliente getInstance(ClienteView cli) 
	{
		if (listener == null) 
		{
			listener = new ListenerCliente();
		}
		cliente = cli;
		return listener;
	}


	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQARTIGO")
		{
			new PesquisarArtigDesportView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQCALCADO")
		{
			new PesquisarCalcadoView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQESPORTE")
		{
			new PesquisarEsporteView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQMARCA")
		{
			new PesquisarMarcaView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQVESTUARIO")
		{
			new PesquisarVestuarioView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EDITAR")
		{
			new EdicaoUsuarioView().setVisible(true);
		}
		
		
	}

	
	

}
