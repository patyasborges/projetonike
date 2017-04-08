package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.EsporteDAO;
import br.inatel.ec206.model.MarcasDAO;
import br.inatel.ec206.view.CadastroEsporteView;
import br.inatel.ec206.view.CadastroMarcaView;

public class ListenerCadEsporte implements ActionListener
{

	private static ListenerCadEsporte listener;
	private static CadastroEsporteView cadastraEsporte;
	
	public static ListenerCadEsporte getInstance(CadastroEsporteView cadEsporte) 
	{
		if (listener == null) 
		{
			listener = new ListenerCadEsporte();
		}
		cadastraEsporte = cadEsporte;
		return listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "CADASTRAR") 
		{
			if (cadastraEsporte.getTxtEsporte().getText().equals("")) 
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			}
			else 
			{
				
				EsporteDAO esporte = new EsporteDAO();

				esporte.setNome_Esporte(cadastraEsporte.getTxtEsporte().getText());
				esporte.armazenaNovosDados();

				cadastraEsporte.getTxtEsporte().setText("");
				
			}
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			cadastraEsporte.dispose();
		}
		
	}

}
