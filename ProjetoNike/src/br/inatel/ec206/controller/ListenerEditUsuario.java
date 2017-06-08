package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.EdicaoUsuarioView;

public class ListenerEditUsuario implements ActionListener
{	
	private static ListenerEditUsuario listener;
	private static EdicaoUsuarioView edicaoUsuario;

	public static ListenerEditUsuario getInstance(EdicaoUsuarioView editUsu) 
	{
		if (listener == null) {
			listener = new ListenerEditUsuario();
		}
		edicaoUsuario = editUsu;
		return listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		// TODO Auto-generated method stub
		
		if (event.getActionCommand() == "SAIR") 
		{
			edicaoUsuario.dispose();
		}
	}

}
