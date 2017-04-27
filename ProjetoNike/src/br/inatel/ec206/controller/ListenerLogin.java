package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Acesso;
import br.inatel.ec206.model.AcessoDAO;
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

	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand() == "ENTRAR") {
			AcessoDAO acessoDAO = new AcessoDAO();
			
			List <Acesso> acessos = acessoDAO.pesquisarAcessoDAO();
			
			boolean valido = false;
			
			if(acessos != null){
				for(Acesso acesso : acessos){
					if(login.getUsuariotextField().getText().equals(acesso.getID_usu()) && login.getPasswordField().getText().equals(acesso.getSenha())){
						valido = true;
					}
				}
				
				if(valido){
					//chamar a tela principal
				} else{
					JOptionPane.showMessageDialog(null,"Senha ou Usuário inválidos!");
				}
			}
			
			
		}
		
	}

}