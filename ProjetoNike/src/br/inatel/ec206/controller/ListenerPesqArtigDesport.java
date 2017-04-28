package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.ArtigosDesportivos;
import br.inatel.ec206.model.ArtigosDesportivosDAO;
import br.inatel.ec206.view.CadastroCalcadoView;
import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.PesquisarArtigDesportView;

public class ListenerPesqArtigDesport implements ActionListener
{
	private static ListenerPesqArtigDesport listener;
	private static PesquisarArtigDesportView pesquisarArtigo;
	

	public static ListenerPesqArtigDesport getInstance(PesquisarArtigDesportView pesqArtig) 
	{
		if (listener == null) 
		{
			listener = new ListenerPesqArtigDesport();
		}
		pesquisarArtigo = pesqArtig;
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
			
			artigo.setDescricao_art(pesquisarArtigo.getTxtPesquisa().getText());
			
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
				pesquisarArtigo.getLblGenero().setText("Feminino");
			}
			else
			{
				if(genero.equals("M")|| genero.equals("m"))
				{
					pesquisarArtigo.getLblGenero().setText("Masculino");
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
			
			pesquisarArtigo.getLblDescricao().setText(descricao);
			pesquisarArtigo.getLblPreco().setText(precoString);
			pesquisarArtigo.getLblMarca().setText(marca);
			pesquisarArtigo.getLblCor().setText(cor);
			pesquisarArtigo.getLblEsporte().setText(esporte);
			pesquisarArtigo.getLblTamanho().setText(tamanho);
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			pesquisarArtigo.dispose();
		}
	}
}
