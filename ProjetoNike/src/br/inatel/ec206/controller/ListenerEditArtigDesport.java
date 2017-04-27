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
import br.inatel.ec206.view.EdicaoArtigDesportView;
import br.inatel.ec206.view.EdicaoVestuarioView;

public class ListenerEditArtigDesport implements ActionListener
{
	private static ListenerEditArtigDesport listener;
	private static EdicaoArtigDesportView editaArtigo;
	int id_esporte, id_marca;
	String esporte, marca,genero;
	
	public static ListenerEditArtigDesport getInstance(EdicaoArtigDesportView editArtig) 
	{
		if (listener == null) {
			listener = new ListenerEditArtigDesport();
		}
		editaArtigo = editArtig;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "PESQUISAR") 
		{
			if(editaArtigo.getTxtPesquisa().getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				ArtigosDesportivosDAO artigo = new ArtigosDesportivosDAO();
				List<ArtigosDesportivos> listaArtigos = new ArrayList<>();
				
				int idArtigo, idMarca, idEsporte,marca=0;
				String descricao, tamanho, cor,genero, esporte, precoString;
				double preco;
				
				artigo.setDescricao_art(editaArtigo.getTxtPesquisa().getText());
				
				listaArtigos = artigo.selecionaPorDescricao();
				idArtigo= listaArtigos.get(0).getID_art();
				descricao=listaArtigos.get(0).getDescricao_art();
				genero=listaArtigos.get(0).getGenero_art();
				idEsporte=listaArtigos.get(0).getID_esporte();
				preco=listaArtigos.get(0).getPreco_art();
				tamanho=listaArtigos.get(0).getTamanho_art();
				cor=listaArtigos.get(0).getCor_art();
				idMarca=listaArtigos.get(0).getID_marca();
				
				artigo.setID_art(idArtigo);
				
				precoString=String.valueOf(preco);
				
				if(genero.equals("F") || genero.equals("f"))
				{
					editaArtigo.getRdbtnFeminino().setSelected(true);
					editaArtigo.getRdbtnMasculino().setSelected(false);
				}
				else
				{
					if(genero.equals("M")|| genero.equals("m"))
					{
						editaArtigo.getRdbtnMasculino().setSelected(true);
						editaArtigo.getRdbtnFeminino().setSelected(false);
					}
				}
				
				editaArtigo.getTxtDescricao().setText(descricao);
				editaArtigo.getTxtPreco().setText(precoString);
				editaArtigo.getCmbbxMarca().setSelectedIndex(marca);
				editaArtigo.getTxtCor().setText(cor);
			}
			
			
			
			
		}
		
		if (event.getActionCommand() == "EDITAR") 
		{
			
			if(editaArtigo.getTxtCor().getText().equals("") || editaArtigo.getTxtDescricao().getText().equals("") || editaArtigo.getTxtPreco().getText().equals("")
					|| editaArtigo.getTxtTamanho().getText().equals("") || editaArtigo.getCmbbxEsporte().getSelectedItem().toString().equals("") ||  editaArtigo.getCmbbxMarca().getSelectedItem().toString().equals("")
					||(!editaArtigo.getRdbtnFeminino().isSelected() && !editaArtigo.getRdbtnMasculino().isSelected()))
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				ArtigosDesportivosDAO artigo = new ArtigosDesportivosDAO();
				List<ArtigosDesportivos> listaArtigo = new ArrayList<>();
				
				int idArt;
				
				artigo.setDescricao_art(editaArtigo.getTxtPesquisa().getText());
				listaArtigo=artigo.selecionaPorDescricao();
				idArt= listaArtigo.get(0).getID_art();
				
				esporte=editaArtigo.getCmbbxEsporte().getSelectedItem().toString();
				marca =editaArtigo.getCmbbxMarca().getSelectedItem().toString();
			
				artigo.setID_art(idArt);
				artigo.setDescricao_art(editaArtigo.getTxtDescricao().getText());
				
				if(editaArtigo.getRdbtnFeminino().isSelected())
				{
					genero="F";
				}
				else
				{
					if(editaArtigo.getRdbtnMasculino().isSelected())
					{
						genero="M";
					}
				}
				artigo.setGenero_art(genero);
				
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
				artigo.setID_esporte(id_esporte);
				artigo.setPreco_art(Double.parseDouble(editaArtigo.getTxtPreco().getText()));
				artigo.setTamanho_art(editaArtigo.getTxtTamanho().getText());
				artigo.setCor_art(editaArtigo.getTxtCor().getText());
				artigo.setID_marca(id_marca);
				
				
				artigo.update();
				
				editaArtigo.getTxtCor().setText("");
				editaArtigo.getTxtDescricao().setText("");
				editaArtigo.getTxtPesquisa().setText("");
				editaArtigo.getTxtPreco().setText("");
				editaArtigo.getTxtTamanho().setText("");
				editaArtigo.getRdbtnFeminino().setSelected(false);
				editaArtigo.getRdbtnMasculino().setSelected(false);
				editaArtigo.getCmbbxEsporte().setSelectedIndex(0);
				editaArtigo.getCmbbxMarca().setSelectedIndex(0);
			}
			
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			editaArtigo.dispose();
		}
		
		if (event.getActionCommand() == "F") 
		{
			editaArtigo.getRdbtnMasculino().setSelected(false);
		}
		
		if (event.getActionCommand() == "M") 
		{
			editaArtigo.getRdbtnFeminino().setSelected(false);
		}
		
	}

}
