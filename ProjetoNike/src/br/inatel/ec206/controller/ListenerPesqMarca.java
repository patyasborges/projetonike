package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Marcas;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.PesquisarMarcaView;

public class ListenerPesqMarca implements ActionListener
{
	private static ListenerPesqMarca listener;
	private static PesquisarMarcaView pesquisarMarca;
	

	public static ListenerPesqMarca getInstance(PesquisarMarcaView pesqMarca) 
	{
		if (listener == null) 
		{
			listener = new ListenerPesqMarca();
		}
		pesquisarMarca = pesqMarca;
		return listener;
	}


	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if (event.getActionCommand() == "PESQUISAR") 
				{
					MarcasDAO marca = new MarcasDAO();
					List<Marcas> listaMarca = new ArrayList<>();
					
					int idMarca;
					String marcas;
					
					marca.setNome_marca(pesquisarMarca.getTxtPesquisar().getText());

					listaMarca= marca.selecionaPorNome();
					idMarca = listaMarca.get(0).getID_marca();
					marcas= listaMarca.get(0).getNome_marca();
					
					marca.setID_marca(idMarca);
					pesquisarMarca.getLblMarca().setText(marcas);
					
				}
				
				
				if (event.getActionCommand() == "SAIR") 
				{
					pesquisarMarca.dispose();
				}
						
	}
}
