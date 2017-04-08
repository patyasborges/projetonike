package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Esporte;
import br.inatel.ec206.model.EsporteDAO;
import br.inatel.ec206.model.Marcas;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.view.DeletaEsporteView;
import br.inatel.ec206.view.DeletaMarcaView;

public class ListenerExcEsporte implements ActionListener
{
	
	private static ListenerExcEsporte listener;
	private static DeletaEsporteView deletaEsporte;


	public static ListenerExcEsporte getInstance(DeletaEsporteView excEsporte) 
	{
		if (listener == null) 
		{
			listener = new ListenerExcEsporte();
		}
		deletaEsporte = excEsporte;
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
			
			esporte.setNome_Esporte(deletaEsporte.getTxtPesquisar().getText());

			listaEsporte= esporte.selecionaPorNome();
			idEsporte = listaEsporte.get(0).getID_Esporte();
			esportes= listaEsporte.get(0).getNome_Esporte();
			
			esporte.setID_Esporte(idEsporte);
			deletaEsporte.getLblEsporte().setText(esportes);
			
		}
		
		if (event.getActionCommand() == "DELETAR") 
		{
			
			if(deletaEsporte.getTxtPesquisar().getText().equals(""))
			{
				System.out.println("Digite os dados");
			}
			else
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Esporte?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					EsporteDAO esporte = new EsporteDAO();
					List<Esporte> listaEsporte = new ArrayList<>();
					int idEsporte;
					esporte.setNome_Esporte(deletaEsporte.getTxtPesquisar().getText());

					listaEsporte = esporte.selecionaPorNome();
					idEsporte= listaEsporte.get(0).getID_Esporte();
					esporte.setID_Esporte(idEsporte);
					
					esporte.delete();
					JOptionPane.showMessageDialog(null, "Marca Deletado!");
				}
				
			}
			
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			deletaEsporte.dispose();
		}
		
	}

}
