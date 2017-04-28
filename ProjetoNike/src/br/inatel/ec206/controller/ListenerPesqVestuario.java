package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Vestuario;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.PesquisarVestuarioView;

public class ListenerPesqVestuario implements ActionListener
{
	private static ListenerPesqVestuario listener;
	private static PesquisarVestuarioView pesquisarVestuario;
	

	public static ListenerPesqVestuario getInstance(PesquisarVestuarioView pesqVest) 
	{
		if (listener == null) 
		{
			listener = new ListenerPesqVestuario();
		}
		pesquisarVestuario = pesqVest;
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
			
			int idVest, idMarca, idEsporte;
			String descricao, tamanho, cor,genero, esporte="", precoString,marca="";
			double preco;
			
			vest.setDescricao_vest(pesquisarVestuario.getTxtPesquisar().getText());
			
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
				pesquisarVestuario.getLblGenero().setText("Feminino");
			}
			else
			{
				if(genero.equals("M")|| genero.equals("m"))
				{
					pesquisarVestuario.getLblGenero().setText("Masculino");
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
			
			pesquisarVestuario.getLblDescricao().setText(descricao);
			pesquisarVestuario.getLblPreco().setText(precoString);
			pesquisarVestuario.getLblMarca().setText(marca);
			pesquisarVestuario.getLblCor().setText(cor);
			pesquisarVestuario.getLblEsporte().setText(esporte);
			pesquisarVestuario.getLblTamanho().setText(tamanho);
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			pesquisarVestuario.dispose();
		}
		
	}

}
