package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.PesquisarCalcadoView;

public class ListenerPesqCalcado implements ActionListener 
{
	private static ListenerPesqCalcado listener;
	private static PesquisarCalcadoView pesquisarCalcado;
	

	public static ListenerPesqCalcado getInstance(PesquisarCalcadoView pesqCalc) 
	{
		if (listener == null) 
		{
			listener = new ListenerPesqCalcado();
		}
		pesquisarCalcado = pesqCalc;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

}
