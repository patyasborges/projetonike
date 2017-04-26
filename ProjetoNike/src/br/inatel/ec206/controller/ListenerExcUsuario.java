package br.inatel.ec206.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.inatel.ec206.model.Usuario;
import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.view.DeletaUsuarioView;
import br.inatel.ec206.view.EdicaoUsuarioView;

public class ListenerExcUsuario implements ActionListener
{
	private static ListenerExcUsuario listener;
	private static DeletaUsuarioView excluirUsuario;

	public static ListenerExcUsuario getInstance(DeletaUsuarioView excUsu) 
	{
		if (listener == null) {
			listener = new ListenerExcUsuario();
		}
		excluirUsuario = excUsu;
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
			String nomeusu, datanasc, email,senha;
			
			usu.setNome_usu(excluirUsuario.getTxtPesquisar().getText());
			
			listaUsuario = usu.selecionaPorNome();
			idUsu = listaUsuario.get(0).getID_usu();
			nomeusu = listaUsuario.get(0).getNome_usu();
			datanasc = listaUsuario.get(0).getData_nascimento_usu();
			email = listaUsuario.get(0).getEmail_usu();
			tipousu = listaUsuario.get(0).getTipo_usu();
			senha= listaUsuario.get(0).getSenha_usu();
			
			usu.setID_usu(idUsu);
			
			excluirUsuario.getLblNome().setText(nomeusu);
			excluirUsuario.getLblDataNascimento().setText(datanasc);
			excluirUsuario.getLblEmail().setText(email);
			excluirUsuario.getLblSenha().setText(senha);
			if(tipousu == 1)
			{
				excluirUsuario.getLblTipo().setText("Administrador");;
			}
			else
			{
				if(tipousu == 2)
				{
					excluirUsuario.getLblTipo().setText("Cliente");
				}
			}
		}
		
		if (event.getActionCommand() == "DELETAR") 
		{
			
			if(excluirUsuario.getTxtPesquisar().getText().equals(""))
			{
				System.out.println("Digite os dados");
			}
			else
			{
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Usuario?","Warning",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION)
				{
					UsuarioDAO usu = new UsuarioDAO();
					List<Usuario> listaUsu = new ArrayList<>();
					int idUsu;
					usu.setNome_usu(excluirUsuario.getTxtPesquisar().getText());

					listaUsu = usu.selecionaPorNome();
					idUsu= listaUsu.get(0).getID_usu();
					System.out.println(idUsu);
					usu.setID_usu(idUsu);
					
					usu.delete();
					JOptionPane.showMessageDialog(null, "Usuario Deletado!");
				}
				
			}
			
		}
		
		if (event.getActionCommand() == "SAIR") 
		{
			excluirUsuario.dispose();
		}
		
	}

}
