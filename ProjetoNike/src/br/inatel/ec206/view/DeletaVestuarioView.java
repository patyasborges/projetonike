package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class DeletaVestuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaVestuarioView frame = new DeletaVestuarioView();
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
	public DeletaVestuarioView() {
		setTitle("Deletar Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(482, 40, 115, 29);
		contentPane.add(btnPesquisar);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(122, 41, 319, 26);
		contentPane.add(txtDescricao);
		
		JLabel label = new JLabel("Descri\u00E7\u00E3o: ");
		label.setBounds(35, 44, 100, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Imagem");
		label_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label_1.setBounds(71, 108, 86, 21);
		contentPane.add(label_1);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(35, 135, 156, 154);
		contentPane.add(lblImagem);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(264, 176, 114, 65);
		contentPane.add(btnDeletar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(424, 176, 115, 65);
		contentPane.add(btnSair);
	}

}
