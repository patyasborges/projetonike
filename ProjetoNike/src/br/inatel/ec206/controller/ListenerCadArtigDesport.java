package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.ArtigosDesportivosDAO;
import br.inatel.ec206.view.CadastroArtigDesportView;


public class ListenerCadArtigDesport implements ActionListener
{
	private static ListenerCadArtigDesport listener;
	private static CadastroArtigDesportView cadastroArtigo;
	String esporte = null, marca = null;
	int id_esporte = 0;
	

	public static ListenerCadArtigDesport getInstance(CadastroArtigDesportView cadArtigo) 
	{
		if (listener == null) 
		{
			listener = new ListenerCadArtigDesport();
		}
		cadastroArtigo = cadArtigo;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
			if (event.getActionCommand() == "CADASTRAR")
			{
				esporte=cadastroArtigo.getCmbbxEsporte().getSelectedItem().toString();
				marca =cadastroArtigo.getCmbbxMarca().getSelectedItem().toString();
				
				if (cadastroArtigo.getTxtDescricao().getText().equals("") || cadastroArtigo.getTxtPreco().getText().equals("") || cadastroArtigo.getTxtTamanho().getText().equals("") || cadastroArtigo.getTxtCor().getText().equals("")
						|| (!cadastroArtigo.getRdbtnFeminino().isSelected() && !cadastroArtigo.getRdbtnMasculino().isSelected()) 
						|| esporte.equals("") || marca.equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
				} 
				else
				{
					ArtigosDesportivosDAO artigos = new ArtigosDesportivosDAO();

					artigos.setDescricao_art(cadastroArtigo.getTxtDescricao().getText());
					if(cadastroArtigo.getRdbtnFeminino().isSelected())
					{
						artigos.setGenero_art("F");
					}
					else
					{
						if(cadastroArtigo.getRdbtnMasculino().isSelected())
						{
							artigos.setGenero_art("M");
						}
					}
					
					
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
					
					int id_marca = 0;
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
					artigos.setID_esporte(id_esporte);
					artigos.setPreco_art(Double.parseDouble(cadastroArtigo.getTxtPreco().getText()));
					artigos.setTamanho_art(cadastroArtigo.getTxtTamanho().getText());
					artigos.setCor_art(cadastroArtigo.getTxtCor().getText());
					artigos.setID_marca(id_marca);
					
					artigos.armazenaNovosDados();

					cadastroArtigo.getTxtDescricao().setText("");
					cadastroArtigo.getTxtPreco().setText("");
					cadastroArtigo.getTxtTamanho().setText("");
					cadastroArtigo.getTxtCor().setText("");
					cadastroArtigo.getCmbbxEsporte().setSelectedIndex(0);
					cadastroArtigo.getCmbbxMarca().setSelectedIndex(0);
					cadastroArtigo.getRdbtnFeminino().setSelected(false);
					cadastroArtigo.getRdbtnMasculino().setSelected(false);
				}
			}
						
			if (event.getActionCommand() == "SAIR")
			{
				cadastroArtigo.dispose();
			}
			
			if (event.getActionCommand() == "F")
			{
				cadastroArtigo.getRdbtnMasculino().setSelected(false);
			}
			
			if (event.getActionCommand() == "M")
			{
				cadastroArtigo.getRdbtnFeminino().setSelected(false);
			}
		}
}
