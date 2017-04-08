package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadEsporte;
import br.inatel.ec206.controller.ListenerCadMarca;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CadastroEsporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEsporte;
	private JLabel lblNewLabel;
	private JButton btnCadastrar;
	private JButton btnSair;

	ListenerCadEsporte listener = ListenerCadEsporte.getInstance(this);
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
		setTitle("Cadastro Esporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtEsporte());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
	}

	public JTextField getTxtEsporte() {
		if (txtEsporte == null) {
			txtEsporte = new JTextField();
			txtEsporte.setBounds(122, 47, 146, 26);
			txtEsporte.setColumns(10);
		}
		return txtEsporte;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Esporte:");
			lblNewLabel.setBounds(15, 50, 69, 20);
		}
		return lblNewLabel;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(26, 112, 115, 29);
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(165, 112, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
}
