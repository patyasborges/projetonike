package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.inatel.ec206.view.AdministradorView;
import br.inatel.ec206.view.CadastroArtigDesportView;
import br.inatel.ec206.view.CadastroCalcadoView;
import br.inatel.ec206.view.CadastroEsporteView;
import br.inatel.ec206.view.CadastroMarcaView;
import br.inatel.ec206.view.CadastroUsuarioView;
import br.inatel.ec206.view.CadastroVestuarioView;
import br.inatel.ec206.view.DeletaArtigDesportView;
import br.inatel.ec206.view.DeletaCalcadoView;
import br.inatel.ec206.view.DeletaEsporteView;
import br.inatel.ec206.view.DeletaMarcaView;
import br.inatel.ec206.view.DeletaUsuarioView;
import br.inatel.ec206.view.DeletaVestuarioView;
import br.inatel.ec206.view.EdicaoArtigDesportView;
import br.inatel.ec206.view.EdicaoEsporteView;
import br.inatel.ec206.view.EdicaoMarcaView;
import br.inatel.ec206.view.EdicaoVestuarioView;

public class ListenerAdministrador implements ActionListener
{
	private static ListenerAdministrador listener;
	private static AdministradorView administrador;
	

	public static ListenerAdministrador getInstance(AdministradorView adm) 
	{
		if (listener == null) 
		{
			listener = new ListenerAdministrador();
		}
		administrador = adm;
		return listener;
	}


	@Override
	public void actionPerformed(ActionEvent event)
	{
		// TODO Auto-generated method stub
		
		if (event.getActionCommand() == "CADARTIGO")
		{
			new CadastroArtigDesportView().setVisible(true);
		}
		
		if (event.getActionCommand() == "CADCALCADO")
		{
			new CadastroCalcadoView().setVisible(true);
		}
		
		if (event.getActionCommand() == "CADESPORTE")
		{
			new CadastroEsporteView().setVisible(true);
		}
		
		if (event.getActionCommand() == "CADMARCA")
		{
			new CadastroMarcaView().setVisible(true);
		}
		
		if (event.getActionCommand() == "CADUSUARIO")
		{
			new CadastroUsuarioView().setVisible(true);
		}
		
		if (event.getActionCommand() == "CADVESTUARIO")
		{
			new CadastroVestuarioView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQARTIGO")
		{
			new EdicaoArtigDesportView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQESPORTE")
		{
			new EdicaoEsporteView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQMARCA")
		{
			new EdicaoMarcaView().setVisible(true);
		}
		
		if (event.getActionCommand() == "PESQVESTUARIO")
		{
			new EdicaoVestuarioView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCARTIGOS")
		{
			new DeletaArtigDesportView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCCALCADO")
		{
			new DeletaCalcadoView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCESPORTE")
		{
			new DeletaEsporteView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCMARCA")
		{
			new DeletaMarcaView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCUSUARIO")
		{
			new DeletaUsuarioView().setVisible(true);
		}
		
		if (event.getActionCommand() == "EXCVESTUARIO")
		{
			new DeletaVestuarioView().setVisible(true);
		}
	}


}
