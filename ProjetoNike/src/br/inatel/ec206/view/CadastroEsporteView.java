package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CadastroEsporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEsporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEsporteView frame = new CadastroEsporteView();
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
	public CadastroEsporteView() {
		setTitle("Cadasto Esporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(50, 165, 115, 29);
		contentPane.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(203, 165, 115, 29);
		contentPane.add(btnSair);
		
		txtEsporte = new JTextField();
		txtEsporte.setBounds(177, 67, 146, 26);
		contentPane.add(txtEsporte);
		txtEsporte.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Esporte:");
		lblNewLabel.setBounds(50, 70, 69, 20);
		contentPane.add(lblNewLabel);
	}
}
