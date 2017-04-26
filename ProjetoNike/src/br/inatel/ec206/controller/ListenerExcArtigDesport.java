package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.ArtigosDesportivos;
import br.inatel.ec206.model.ArtigosDesportivosDAO;
import br.inatel.ec206.model.Vestuario;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.DeletaArtigDesportView;
import br.inatel.ec206.view.DeletaVestuarioView;

public class ListenerExcArtigDesport implements ActionListener  
{
	private static ListenerExcArtigDesport listener;
	private static DeletaArtigDesportView deletaArtigo;
	
	public static ListenerExcArtigDesport getInstance(DeletaArtigDesportView excArtigo) 
	{
		if (listener == null) 
		{
			listener = new ListenerExcArtigDesport();
		}
		deletaArtigo = excArtigo;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") 
		{
			ArtigosDesportivosDAO artigo = new ArtigosDesportivosDAO();
			List<ArtigosDesportivos> listaArtigo = new ArrayList<>();
			
			int idArt, idMarca, idEsporte;
			String descricao, tamanho, cor,genero, esporte="", precoString,marca="";
			double preco;
			
			artigo.setDescricao_art(deletaArtigo.getTxtPesquisa().getText());
			
			listaArtigo = artigo.selecionaPorDescricao();
			idArt= listaArtigo.get(0).getID_art();
			descricao=listaArtigo.get(0).getDescricao_art();
			genero=listaArtigo.get(0).getGenero_art();
			idEsporte=listaArtigo.get(0).getID_esporte();
			preco=listaArtigo.get(0).getPreco_art();
			tamanho=listaArtigo.get(0).getTamanho_art();
			cor=listaArtigo.get(0).getCor_art();
			idMarca=listaArtigo.get(0).getID_marca();
			
			artigo.setID_art(idArt);
			precoString=String.valueOf(preco);
			
			if(genero.equals("F") || genero.equals("f"))
			{
				deletaArtigo.getLblGenero().setText("Feminino");
			}
			else
			{
				if(genero.equals("M")|| genero.equals("m"))
				{
					deletaArtigo.getLblGenero().setText("Masculino");
				}
			}
			
			switch(idEsporte)
			{
			
				case 1:
					esporte="Futebol";
					break;
					
				case 2:
					esporte="Basquete";
					break;
					
				case 3:
					esporte="Volei";
					break;
			
			}
			switch(idMarca)
			{
				case 1:
					marca="Nike +";
					break;
					
				case 2:
					marca="Jordan";
					break;
					
				case 3:
					marca="Outra";
					break;
			
			}
			
			deletaArtigo.getLblDescricao().setText(descricao);
			deletaArtigo.getLblPreco().setText(precoString);
			deletaArtigo.getLblMarca().setText(marca);
			deletaArtigo.getLblCor().setText(cor);
			deletaArtigo.getLblEsporte().setText(esporte);
			deletaArtigo.getLblTamanho().setText(tamanho);
		}
		
		if (event.getActionCommand() == "DELETAR") 
		{
			if(deletaArtigo.getTxtPesquisa().getText().equals(""))
			{
				System.out.println("Digite os dados");
			}
			else
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Artigo Desportivo?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					ArtigosDesportivosDAO artigo = new ArtigosDesportivosDAO();
					List<ArtigosDesportivos> listaArtigo = new ArrayList<>();
					int idArt;
					artigo.setDescricao_art(deletaArtigo.getTxtPesquisa().getText());

					listaArtigo = artigo.selecionaPorDescricao();
					idArt= listaArtigo.get(0).getID_art();
					artigo.setID_art(idArt);
					
					artigo.delete();
					JOptionPane.showMessageDialog(null, "Artigo Desportivo Deletado!");
				}
			}
		}
		if (event.getActionCommand() == "SAIR") 
		{
			deletaArtigo.dispose();
		}
		
		
	}

}
