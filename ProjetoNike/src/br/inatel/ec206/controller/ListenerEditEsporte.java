package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.model.Esporte;
import br.inatel.ec206.model.EsporteDAO;
import br.inatel.ec206.model.Marcas;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.view.EdicaoEsporteView;
import br.inatel.ec206.view.EdicaoMarcaView;

public class ListenerEditEsporte implements ActionListener
{

	private static ListenerEditEsporte listener;
	private static EdicaoEsporteView editaEsporte;
	
	public static ListenerEditEsporte getInstance(EdicaoEsporteView editEsporte) 
	{
		if (listener == null) 
		{
			listener = new ListenerEditEsporte();
		}
		editaEsporte = editEsporte;
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
			
			esporte.setNome_Esporte(editaEsporte.getTxtPesquisar().getText());

			listaEsporte= esporte.selecionaPorNome();
			idEsporte = listaEsporte.get(0).getID_Esporte();
			esportes= listaEsporte.get(0).getNome_Esporte();
			
			esporte.setID_Esporte(idEsporte);
			editaEsporte.getTxtEsporte().setText(esportes);
			
		}
		
		if (event.getActionCommand() == "EDITAR") 
		{
			EsporteDAO esporte = new EsporteDAO();
			List<Esporte> listaEsporte = new ArrayList<>();
			
			int idEsporte;
			esporte.setNome_Esporte(editaEsporte.getTxtPesquisar().getText());

			listaEsporte= esporte.selecionaPorNome();
			idEsporte = listaEsporte.get(0).getID_Esporte();
			
			esporte.setID_Esporte(idEsporte);
			esporte.setNome_Esporte(editaEsporte.getTxtEsporte().getText());
			esporte.update();
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			editaEsporte.dispose();
		}
		
	}

}
