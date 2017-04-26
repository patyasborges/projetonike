package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
		if (event.getActionCommand() == "PESQUISAR") 
		{
			UsuarioDAO usu = new UsuarioDAO();
			List<Usuario> listaUsuario = new ArrayList<>();
			
			int idUsu, tipousu;
			String nomeusu, datanasc, email, senha;
			
			usu.setNome_usu(edicaoUsuario.getTxtPesquisar().getText());
			
			listaUsuario = usu.selecionaPorNome();
			idUsu = listaUsuario.get(0).getID_usu();
			nomeusu = listaUsuario.get(0).getNome_usu();
			datanasc = listaUsuario.get(0).getData_nascimento_usu();
			email = listaUsuario.get(0).getEmail_usu();
			tipousu = listaUsuario.get(0).getTipo_usu();
			senha = listaUsuario.get(0).getSenha_usu();
			
			usu.setID_usu(idUsu);
			
			edicaoUsuario.getTxtNome().setText(nomeusu);
			edicaoUsuario.getTxtDataNascimento().setText(datanasc);
			edicaoUsuario.getTxtEmail().setText(email);
			if(tipousu == 1)
			{
				edicaoUsuario.getRdbtnAdministrador().setSelected(true);
			}
			else
			{
				if(tipousu == 2)
				{
					edicaoUsuario.getRdbtnCliente().setSelected(true);
				}
			}
			edicaoUsuario.getTxtSenha().setText(senha);
		}
		
		if (event.getActionCommand() == "EDITAR") 
		{
			UsuarioDAO usu = new UsuarioDAO();
			List<Usuario> listaUsuario = new ArrayList<>();
			
			int idUsu;
			
			usu.setNome_usu(edicaoUsuario.getTxtPesquisar().getText());
			listaUsuario = usu.selecionaPorNome();
			idUsu = listaUsuario.get(0).getID_usu();
			System.out.println(idUsu);
			
			usu.setID_usu(idUsu);
			usu.setNome_usu(edicaoUsuario.getTxtNome().getText());
			usu.setData_nascimento_usu(edicaoUsuario.getTxtDataNascimento().getText());
			usu.setEmail_usu(edicaoUsuario.getTxtEmail().getText());
			usu.setSenha_usu(edicaoUsuario.getTxtSenha().getText());
			
			if(edicaoUsuario.getRdbtnAdministrador().isSelected())
			{
				usu.setTipo_usu(1);
			}
			else
			{
				if(edicaoUsuario.getRdbtnCliente().isSelected())
				{
					usu.setTipo_usu(2);
				}
			}
			
			usu.update();		
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			edicaoUsuario.dispose();
		}
	}

}
