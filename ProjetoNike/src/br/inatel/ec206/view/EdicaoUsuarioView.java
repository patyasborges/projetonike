package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class EdicaoUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtDataNasc;
	private JTextField txtPesquisar;

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
		txtNome.setBounds(170, 102, 222, 26);
		contentPane.add(txtNome);
		
		JLabel label = new JLabel("Nome: ");
		label.setBounds(15, 105, 69, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Data de Nascimento: ");
		label_1.setBounds(15, 160, 160, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("E-mail: ");
		label_2.setBounds(15, 220, 69, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Tipo: ");
		label_3.setBounds(15, 281, 69, 20);
		contentPane.add(label_3);
		
		JRadioButton rdbtnComum = new JRadioButton("Comum");
		rdbtnComum.setBounds(158, 277, 89, 29);
		contentPane.add(rdbtnComum);
		
		JRadioButton rdbtnAdministrador = new JRadioButton("Administrador");
		rdbtnAdministrador.setBounds(254, 277, 138, 29);
		contentPane.add(rdbtnAdministrador);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(170, 220, 222, 26);
		contentPane.add(txtEmail);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		txtDataNasc.setBounds(170, 157, 222, 26);
		contentPane.add(txtDataNasc);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(227, 347, 114, 65);
		contentPane.add(btnEditar);
		
		JButton btnSair = new JButton("Sair");
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
		btnPesquisar.setBounds(457, 40, 115, 29);
		contentPane.add(btnPesquisar);
	}

}
