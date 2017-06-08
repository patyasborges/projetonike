package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Acesso;
import br.inatel.ec206.model.AcessoDAO;
import br.inatel.ec206.model.Login;
import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.AdministradorView;
import br.inatel.ec206.view.ClienteView;
import br.inatel.ec206.view.LoginView;

public class ListenerLogin implements ActionListener {

	private static ListenerLogin listener;
	private static LoginView login;

	public static ListenerLogin getInstance(LoginView login1) {
		if (listener == null) {
			listener = new ListenerLogin();
		}
		login = login1;
		return listener;
	}

	public void actionPerformed(ActionEvent event)
	{

		if (event.getActionCommand() == "ENTRAR") 
		{
			if(login.getUsuarioTextField().getText().equals("") || login.getPasswordField().getText().equals("") || (!login.getRdbtnAdm().isSelected() && !login.getRdbtnCliente().isSelected()))
			{
				JOptionPane.showMessageDialog(null,"Digite os Dados!","Aviso",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				if(login.getRdbtnAdm().isSelected())
				{
					UsuarioDAO usu = new UsuarioDAO();
					List<Usuario> listaUsu = new ArrayList<>();
					String senhaA,senhaTela;
					
					usu.setNome_usu(login.getUsuarioTextField().getText());
					listaUsu = usu.selecionaPorNome();
					senhaA = listaUsu.get(0).getSenha_usu();
					senhaTela= login.getPasswordField().getText();
					
					if (senhaA.equals(senhaTela))
					{
						new AdministradorView().setVisible(true);
						login.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Senha ou Usuario nao existe","Aviso",JOptionPane.WARNING_MESSAGE);
					}
					
				}
				else
				{
					if(login.getRdbtnCliente().isSelected())
					{
						UsuarioDAO usu = new UsuarioDAO();
						List<Usuario> listaUsu = new ArrayList<>();
						String nomeC;
						String senhaC,senhaTelaC;
						
						usu.setNome_usu(login.getUsuarioTextField().getText());
						listaUsu = usu.selecionaPorNome();
						nomeC = listaUsu.get(0).getNome_usu();
						senhaC = listaUsu.get(0).getSenha_usu();
						senhaTelaC = login.getPasswordField().getText();
						
						if(senhaC.equals(senhaTelaC))
						{
							Usuario.usu_logado = nomeC;
							new ClienteView().setVisible(true);
							login.dispose();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Senha ou Usuario nao existe","Aviso",JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
			
		}
		
	}

}