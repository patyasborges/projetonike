package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Esporte;
import br.inatel.ec206.model.EsporteDAO;
import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.PesquisarEsporteView;

public class ListenerPesqEsporte implements ActionListener
{

	private static ListenerPesqEsporte listener;
	private static PesquisarEsporteView pesquisarEsporte;
	

	public static ListenerPesqEsporte getInstance(PesquisarEsporteView pesqEsporte) 
	{
		if (listener == null) 
		{
			listener = new ListenerPesqEsporte();
		}
		pesquisarEsporte = pesqEsporte;
		return listener;
	}


	@Override
	public void actionPerformed(ActionEvent event)
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") 
		{
			EsporteDAO esporte = new EsporteDAO();
			List<Esporte> listaEsporte = new ArrayList<>();
			
			int idEsporte;
			String esportes;
			
			esporte.setNome_Esporte(pesquisarEsporte.getTxtPesquisar().getText());

			listaEsporte= esporte.selecionaPorNome();
			idEsporte = listaEsporte.get(0).getID_Esporte();
			esportes= listaEsporte.get(0).getNome_Esporte();
			
			esporte.setID_Esporte(idEsporte);
			pesquisarEsporte.getLblEsporte().setText(esportes);
			
		}
		
		
		if (event.getActionCommand() == "SAIR") 
		{
			pesquisarEsporte.dispose();
		}
		
		
	}

}
