package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.model.Marcas;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.model.Vestuario;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.CadastroMarcaView;
import br.inatel.ec206.view.EdicaoMarcaView;

public class ListenerEditMarca implements ActionListener
{

	private static ListenerEditMarca listener;
	private static EdicaoMarcaView editaMarca;
	
	public static ListenerEditMarca getInstance(EdicaoMarcaView editMarca) 
	{
		if (listener == null) 
		{
			listener = new ListenerEditMarca();
		}
		editaMarca = editMarca;
		return listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") 
		{
			MarcasDAO marca = new MarcasDAO();
			List<Marcas> listaMarca = new ArrayList<>();
			
			int idMarca;
			String marcas;
			
			marca.setNome_marca(editaMarca.getTxtPesquisar().getText());

			listaMarca= marca.selecionaPorNome();
			idMarca = listaMarca.get(0).getID_marca();
			marcas= listaMarca.get(0).getNome_marca();
			
			marca.setID_marca(idMarca);
			editaMarca.getTxtMarca().setText(marcas);
			
		}
		
		if (event.getActionCommand() == "EDITAR") 
		{
			MarcasDAO marca = new MarcasDAO();
			List<Marcas> listaMarca = new ArrayList<>();
			
			int idMarca;
			marca.setNome_marca(editaMarca.getTxtPesquisar().getText());

			listaMarca= marca.selecionaPorNome();
			idMarca = listaMarca.get(0).getID_marca();
			
			marca.setID_marca(idMarca);
			marca.setNome_marca(editaMarca.getTxtMarca().getText());
			marca.update();
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			editaMarca.dispose();
		}
	}

}
