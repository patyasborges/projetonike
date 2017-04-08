package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Marcas;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.DeletaMarcaView;
import br.inatel.ec206.view.EdicaoVestuarioView;

public class ListenerExcMarca implements ActionListener
{
	private static ListenerExcMarca listener;
	private static DeletaMarcaView deletaMarca;


	public static ListenerExcMarca getInstance(DeletaMarcaView excMarca) 
	{
		if (listener == null) 
		{
			listener = new ListenerExcMarca();
		}
		deletaMarca = excMarca;
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
			
			marca.setNome_marca(deletaMarca.getTxtPesquisar().getText());

			listaMarca= marca.selecionaPorNome();
			idMarca = listaMarca.get(0).getID_marca();
			marcas= listaMarca.get(0).getNome_marca();
			
			marca.setID_marca(idMarca);
			deletaMarca.getLblMarca().setText(marcas);
			
		}
		
		if (event.getActionCommand() == "DELETAR") 
		{
			
			if(deletaMarca.getTxtPesquisar().getText().equals(""))
			{
				System.out.println("Digite os dados");
			}
			else
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Marca?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					MarcasDAO marca = new MarcasDAO();
					List<Marcas> listaMarca = new ArrayList<>();
					int idMarca;
					marca.setNome_marca(deletaMarca.getTxtPesquisar().getText());

					listaMarca = marca.selecionaPorNome();
					idMarca= listaMarca.get(0).getID_marca();
					marca.setID_marca(idMarca);
					
					marca.delete();
					JOptionPane.showMessageDialog(null, "Marca Deletado!");
				}
				
			}
			
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			deletaMarca.dispose();
		}
		
	}

}
