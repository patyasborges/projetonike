package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.model.Vestuario;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.CadastroVestuarioView;
import br.inatel.ec206.view.EdicaoVestuarioView;

public class ListenerEditVestuario implements ActionListener
{

	private static ListenerEditVestuario listener;
	private static EdicaoVestuarioView editaVestuario;
	int id_esporte, id_marca;
	String esporte, marca,genero;

	public static ListenerEditVestuario getInstance(EdicaoVestuarioView editVest) 
	{
		if (listener == null) {
			listener = new ListenerEditVestuario();
		}
		editaVestuario = editVest;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") 
		{
			VestuarioDAO vest = new VestuarioDAO();
			List<Vestuario> listaVestuario = new ArrayList<>();
			
			int idVest, idMarca, idEsporte,marca=0;
			String descricao, tamanho, cor,genero, esporte, precoString;
			double preco;
			
			vest.setDescricao_vest(editaVestuario.getTxtPesquisar().getText());
			
			listaVestuario = vest.selecionaPorDescricao();
			idVest= listaVestuario.get(0).getID_vest();
			descricao=listaVestuario.get(0).getDescricao_vest();
			genero=listaVestuario.get(0).getGenero_vest();
			idEsporte=listaVestuario.get(0).getID_esporte();
			preco=listaVestuario.get(0).getPreco_vest();
			tamanho=listaVestuario.get(0).getTamanho_vest();
			cor=listaVestuario.get(0).getCor_vest();
			idMarca=listaVestuario.get(0).getID_marca();
			
			vest.setID_vest(idVest);
			
			precoString=String.valueOf(preco);
			
			if(genero.equals("F") || genero.equals("f"))
			{
				editaVestuario.getRdbtnFeminino().setSelected(true);
				editaVestuario.getRdbtnMasculino().setSelected(false);
			}
			else
			{
				if(genero.equals("M")|| genero.equals("m"))
				{
					editaVestuario.getRdbtnMasculino().setSelected(true);
					editaVestuario.getRdbtnFeminino().setSelected(false);
				}
			}
			
			editaVestuario.getTxtDescricao().setText(descricao);
			editaVestuario.getTxtPreco().setText(precoString);
			editaVestuario.getCmbbxMarca().setSelectedIndex(marca);
			editaVestuario.getTxtCor().setText(cor);
			
		}
		
		if (event.getActionCommand() == "EDITAR") 
		{
			VestuarioDAO vest = new VestuarioDAO();
			List<Vestuario> listaVestuario = new ArrayList<>();
			
			int idVest;
			
			vest.setDescricao_vest(editaVestuario.getTxtPesquisar().getText());
			listaVestuario=vest.selecionaPorDescricao();
			idVest= listaVestuario.get(0).getID_vest();
			
			esporte=editaVestuario.getCmbbxEsporte().getSelectedItem().toString();
			marca =editaVestuario.getCmbbxMarca().getSelectedItem().toString();
		
			vest.setID_vest(idVest);
			vest.setDescricao_vest(editaVestuario.getTxtDescricao().getText());
			
			if(editaVestuario.getRdbtnFeminino().isSelected())
			{
				genero="F";
			}
			else
			{
				if(editaVestuario.getRdbtnMasculino().isSelected())
				{
					genero="M";
				}
			}
			vest.setGenero_vest(genero);
			
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
			vest.setID_esporte(id_esporte);
			vest.setPreco_vest(Double.parseDouble(editaVestuario.getTxtPreco().getText()));
			vest.setTamanho_vest(editaVestuario.getCmbbxTamanho().getSelectedItem().toString());
			vest.setCor_vest(editaVestuario.getTxtCor().getText());
			vest.setID_marca(id_marca);
			
			
			vest.update();
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			editaVestuario.dispose();
		}
		
	}
}
