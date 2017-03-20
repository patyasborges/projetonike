package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.UsuarioDAO;
import br.inatel.ec206.model.Usuario;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DeletaUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaUsuarioView frame = new DeletaUsuarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeletaUsuarioView() {
		setTitle("Deletar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(txtNome.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Digite os Dados!","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					pesquisarUsuario();
				}
				
			}
		});
		btnPesquisar.setBounds(462, 39, 115, 29);
		contentPane.add(btnPesquisar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(404, 175, 115, 65);
		contentPane.add(btnSair);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(txtNome.getText().equals(""))
				{
					System.out.println("Digite os dados");
				}
				else
				{
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo deletar Usuario?","Warning",dialogButton);
					if(dialogResult == JOptionPane.YES_OPTION)
					{
						deletarUsuario();
					}
					
				}
				
			}
		});
		btnDeletar.setBounds(244, 175, 114, 65);
		contentPane.add(btnDeletar);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(102, 40, 319, 26);
		contentPane.add(txtNome);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(15, 134, 156, 154);
		contentPane.add(lblImagem);
		
		JLabel label_1 = new JLabel("Imagem");
		label_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label_1.setBounds(51, 107, 86, 21);
		contentPane.add(label_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(15, 43, 100, 20);
		contentPane.add(lblNome);
	}
	
	protected void pesquisarUsuario()
	{
			UsuarioDAO usu = new UsuarioDAO();
			List<Usuario> listaUsuario = new ArrayList<>();
			
			int idUsu, tipousu;
			String nomeusu, datanasc, email,foto;
			
			usu.setNome_usu(txtNome.getText());
			
			listaUsuario = usu.selecionaPorNome();
			idUsu = listaUsuario.get(0).getID_usu();
			nomeusu = listaUsuario.get(0).getNome_usu();
			datanasc = listaUsuario.get(0).getData_nascimento_usu();
			email = listaUsuario.get(0).getEmail_usu();
			tipousu = listaUsuario.get(0).getTipo_usu();
			foto = listaUsuario.get(0).getFoto_usu();
			
			usu.setID_usu(idUsu);
			
			//txtNome.setText(usu.getNome_usu());
	}
	
	
	protected void deletarUsuario()
	{

			UsuarioDAO usu = new UsuarioDAO();
			List<Usuario> listaUsu = new ArrayList<>();
			int idUsu;
			usu.setNome_usu(txtNome.getText());

			listaUsu = usu.selecionaPorNome();
			idUsu= listaUsu.get(0).getID_usu();
			System.out.println(idUsu);
			usu.setID_usu(idUsu);
			
			usu.delete();
			JOptionPane.showMessageDialog(null, "Usuario Deletado!");
	}


}
