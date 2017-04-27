package br.inatel.ec206.controller;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.CadastroUsuarioView;

public class ListenerCadUsuario implements ActionListener {

	private static ListenerCadUsuario listener;
	private static CadastroUsuarioView cadastroUsuario;
	int tipo;
	
	public static ListenerCadUsuario getInstance(CadastroUsuarioView cadUsu) 
	{
		if (listener == null) {
			listener = new ListenerCadUsuario();
		}
		cadastroUsuario = cadUsu;
		return listener;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getActionCommand() == "CAD") 
		{
			if (cadastroUsuario.getTxtNome().getText().equals("") || cadastroUsuario.getTxtDataNascimento().getText().equals("") || cadastroUsuario.getTxtEmail().getText().equals("")
					|| (!cadastroUsuario.getRdbtnAdministrador().isSelected() && !cadastroUsuario.getRdbtnCliente().isSelected())) 
			{
				JOptionPane.showMessageDialog(null, "Digite os Dados!", "Aviso", JOptionPane.WARNING_MESSAGE);
			} else 
			{
				ListenerCadUsuario list = new ListenerCadUsuario();
				if (cadastroUsuario.getRdbtnAdministrador().isSelected()) 
				{
					tipo = 1;
				} else {
					if (cadastroUsuario.getRdbtnCliente().isSelected()) 
					{
						tipo = 2;
					}
				}
				
				UsuarioDAO usu = new UsuarioDAO();

				usu.setNome_usu(cadastroUsuario.getTxtNome().getText());
				usu.setData_nascimento_usu(cadastroUsuario.getTxtDataNascimento().getText());
				usu.setEmail_usu(cadastroUsuario.getTxtEmail().getText());
				usu.setTipo_usu(tipo);
				usu.setSenha_usu(cadastroUsuario.getTxtSenha().getText());

				usu.armazenaNovosDados();

				cadastroUsuario.getTxtNome().setText("");
				cadastroUsuario.getTxtDataNascimento().setText("");
				cadastroUsuario.getTxtEmail().setText("");
				cadastroUsuario.getTxtSenha().setText("");
				cadastroUsuario.getRdbtnAdministrador().setSelected(false);
				cadastroUsuario.getRdbtnCliente().setSelected(false);
			}
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			cadastroUsuario.dispose();
		}
		
		if (event.getActionCommand() == "CLI") 
		{
			cadastroUsuario.getRdbtnAdministrador().setSelected(false);
		}
		
		if (event.getActionCommand() == "ADM") 
		{
			cadastroUsuario.getRdbtnCliente().setSelected(false);
		}
	}
}