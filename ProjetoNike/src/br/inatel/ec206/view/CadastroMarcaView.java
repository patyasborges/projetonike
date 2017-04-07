package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadMarca;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroMarcaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4670519714230978814L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtMarca;
	private JButton btnCadastrar;
	private JButton btnSair;

	ListenerCadMarca listener = ListenerCadMarca.getInstance(this);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroMarcaView frame = new CadastroMarcaView();
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
	public CadastroMarcaView() {
		setTitle("Cadastro Marcas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtMarca());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBounds(15, 60, 69, 20);
		}
		return lblNewLabel;
	}
	public JTextField getTxtMarca() {
		if (txtMarca == null) {
			txtMarca = new JTextField();
			txtMarca.setBounds(112, 57, 146, 26);
			txtMarca.setColumns(10);
		}
		return txtMarca;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(275, 56, 115, 29);
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(275, 125, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
}
