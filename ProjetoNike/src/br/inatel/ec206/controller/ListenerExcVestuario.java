package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.model.Vestuario;
import br.inatel.ec206.model.VestuarioDAO;
import br.inatel.ec206.view.DeletaVestuarioView;
import br.inatel.ec206.view.EdicaoVestuarioView;

public class ListenerExcVestuario  implements ActionListener
{
	private static ListenerExcVestuario listener;
	private static DeletaVestuarioView deletaVestuario;
	
	public static ListenerExcVestuario getInstance(DeletaVestuarioView excVest) 
	{
		if (listener == null) 
		{
			listener = new ListenerExcVestuario();
		}
		deletaVestuario = excVest;
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
			
			vest.setDescricao_vest(deletaVestuario.getTxtPesquisar().getText());
			
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
				deletaVestuario.getLblGenero().setText("Feminino");
			}
			else
			{
				if(genero.equals("M")|| genero.equals("m"))
				{
					deletaVestuario.getLblGenero().setText("Masculino");
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
			
			deletaVestuario.getLblDescricao().setText(descricao);
			deletaVestuario.getLblPreco().setText(precoString);
			deletaVestuario.getLblMarca().setText(marca);
			deletaVestuario.getLblCor().setText(cor);
			deletaVestuario.getLblEsporte().setText(esporte);
			deletaVestuario.getLblTamanho().setText(tamanho);
		}
		
		if (event.getActionCommand() == "EXCLUIR") 
		{
			if(deletaVestuario.getTxtPesquisar().getText().equals(""))
			{
				System.out.println("Digite os dados");
			}
			else
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Vestuario?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					VestuarioDAO vest = new VestuarioDAO();
					List<Vestuario> listaVest = new ArrayList<>();
					int idVest;
					vest.setDescricao_vest(deletaVestuario.getTxtPesquisar().getText());

					listaVest = vest.selecionaPorDescricao();
					idVest= listaVest.get(0).getID_vest();
					vest.setID_vest(idVest);
					
					vest.delete();
					JOptionPane.showMessageDialog(null, "Vestuario Deletado!");
				}
			}
		}
		if (event.getActionCommand() == "SAIR") 
		{
			deletaVestuario.dispose();
		}
		
	
	}
}
