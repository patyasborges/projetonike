package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.model.UsuarioDAO;
import br.inatel.ec206.model.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class EdicaoUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNasc;
	private JTextField txtPesquisar;

	
	JRadioButton rdbtnComum;
	JRadioButton rdbtnAdministrador;
	JRadioButton rdbtnAdmin1;
	JRadioButton rdbtnComum1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoUsuarioView frame = new EdicaoUsuarioView();
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
	public EdicaoUsuarioView() {
		setTitle("Editar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(170, 118, 222, 26);
		contentPane.add(txtNome);
		
		JLabel label = new JLabel("Nome: ");
		label.setBounds(15, 121, 69, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Data de Nascimento: ");
		label_1.setBounds(15, 176, 160, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("E-mail: ");
		label_2.setBounds(15, 236, 69, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Tipo: ");
		label_3.setBounds(15, 297, 69, 20);
		contentPane.add(label_3);
		
		rdbtnComum = new JRadioButton("Comum");
		rdbtnComum.setBounds(158, 293, 89, 29);
		contentPane.add(rdbtnComum);
		
		rdbtnAdministrador = new JRadioButton("Administrador");
		rdbtnAdministrador.setBounds(254, 293, 138, 29);
		contentPane.add(rdbtnAdministrador);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(170, 236, 222, 26);
		contentPane.add(txtEmail);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(170, 173, 222, 26);
		contentPane.add(txtDataNasc);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
					if(txtNome.getText().equals("") || txtDataNasc.getText().equals("") || txtEmail.getText().equals("") || ( !rdbtnAdministrador.isSelected() && !rdbtnComum.isSelected()))
					{
						JOptionPane.showMessageDialog(null,"Digite os Dados do Administrador!","Aviso",JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog (null, "Deseja mesmo editar os dados?","Warning",dialogButton);
						if(dialogResult == JOptionPane.YES_OPTION)
						{
							editarUsuario();
						}
					}
				}
				
		});
		btnEditar.setBounds(227, 347, 114, 65);
		contentPane.add(btnEditar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		btnSair.setBounds(385, 347, 115, 65);
		contentPane.add(btnSair);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(450, 118, 156, 154);
		contentPane.add(lblImagem);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(483, 283, 89, 23);
		contentPane.add(btnUpload);
		
		JLabel label_5 = new JLabel("Imagem");
		label_5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label_5.setBounds(486, 91, 86, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Nome: ");
		label_6.setBounds(15, 44, 69, 20);
		contentPane.add(label_6);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setColumns(10);
		txtPesquisar.setBounds(170, 41, 222, 26);
		contentPane.add(txtPesquisar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(txtPesquisar.getText().equals("") || ( !rdbtnAdmin1.isSelected() && !rdbtnComum1.isSelected() ))
				{
					JOptionPane.showMessageDialog(null,"Digite os Dados!","Aviso",JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					pesquisarUsuario();
				}
				
			}
		});
		btnPesquisar.setBounds(457, 40, 115, 29);
		contentPane.add(btnPesquisar);
		
		rdbtnAdmin1 = new JRadioButton("Administrador");
		rdbtnAdmin1.setBounds(266, 79, 138, 29);
		contentPane.add(rdbtnAdmin1);
		
		rdbtnComum1 = new JRadioButton("Comum");
		rdbtnComum1.setBounds(170, 79, 89, 29);
		contentPane.add(rdbtnComum1);
	}

	protected void pesquisarUsuario()
	{
			UsuarioDAO usu = new UsuarioDAO();
			List<Usuario> listaUsuario = new ArrayList<>();
			
			int idUsu, tipousu;
			String nomeusu, datanasc, email,foto;
			
			usu.setNome_usu(txtPesquisar.getText());
			
			listaUsuario = usu.selecionaPorNome();
			idUsu = listaUsuario.get(0).getID_usu();
			nomeusu = listaUsuario.get(0).getNome_usu();
			datanasc = listaUsuario.get(0).getData_nascimento_usu();
			email = listaUsuario.get(0).getEmail_usu();
			tipousu = listaUsuario.get(0).getTipo_usu();
			foto = listaUsuario.get(0).getFoto_usu();
			
			usu.setID_usu(idUsu);
			
			txtNome.setText(usu.getNome_usu());
			txtDataNasc.setText(datanasc);
			txtEmail.setText(email);
			if(tipousu == 1)
			{
				rdbtnAdministrador.setSelected(true);
			}
			else
			{
				if(tipousu == 2)
				{
					rdbtnComum.setSelected(true);
				}
			}
	}
	
	protected void editarUsuario()
	{
				UsuarioDAO usu = new UsuarioDAO();
				List<Usuario> listaUsuario = new ArrayList<>();
				
				int idUsu;
				
				usu.setNome_usu(txtPesquisar.getText());
				listaUsuario = usu.selecionaPorNome();
				idUsu = listaUsuario.get(0).getID_usu();
				System.out.println(idUsu);
				
				usu.setID_usu(idUsu);
				usu.setNome_usu(txtNome.getText());
				usu.setData_nascimento_usu(txtDataNasc.getText());
				usu.setEmail_usu(txtEmail.getText());
				usu.setFoto_usu("Imagem 1");
				
				if(rdbtnAdministrador.isSelected())
				{
					usu.setTipo_usu(1);
				}
				else
				{
					if(rdbtnComum.isSelected())
					{
						usu.setTipo_usu(2);
					}
				}
				
				usu.update();		
	}
}
