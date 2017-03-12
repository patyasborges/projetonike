package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class CadastroUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuarioView frame = new CadastroUsuarioView();
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
	public CadastroUsuarioView() {
		setTitle("Cadastrar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(15, 52, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data de Nascimento: ");
		lblNewLabel_1.setBounds(15, 107, 160, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("E-mail: ");
		lblNewLabel_2.setBounds(15, 167, 69, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo: ");
		lblNewLabel_3.setBounds(15, 228, 69, 20);
		contentPane.add(lblNewLabel_3);
		
		txtNome = new JTextField();
		txtNome.setBounds(170, 49, 222, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(170, 104, 222, 26);
		contentPane.add(txtDataNasc);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(170, 167, 222, 26);
		contentPane.add(txtEmail);
		
		JRadioButton rdbtnComum = new JRadioButton("Comum");
		rdbtnComum.setBounds(158, 224, 89, 29);
		contentPane.add(rdbtnComum);
		
		JRadioButton rdbtnAdministrador = new JRadioButton("Administrador");
		rdbtnAdministrador.setBounds(254, 224, 138, 29);
		contentPane.add(rdbtnAdministrador);
		
		JLabel label = new JLabel("Imagem");
		label.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label.setBounds(486, 38, 86, 21);
		contentPane.add(label);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(450, 65, 156, 154);
		contentPane.add(lblImagem);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(483, 230, 89, 23);
		contentPane.add(btnUpload);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(227, 294, 114, 65);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(385, 294, 115, 65);
		contentPane.add(btnSair);
	}

}
