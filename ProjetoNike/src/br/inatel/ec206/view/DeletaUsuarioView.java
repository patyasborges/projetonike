package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

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
		btnPesquisar.setBounds(462, 39, 115, 29);
		contentPane.add(btnPesquisar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(404, 175, 115, 65);
		contentPane.add(btnSair);
		
		JButton btnDeletar = new JButton("Deletar");
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

}
