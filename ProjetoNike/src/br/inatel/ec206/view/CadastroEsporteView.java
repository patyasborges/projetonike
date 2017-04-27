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
import javax.swing.ImageIcon;

public class CadastroEsporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEsporte;
	private JButton btnCadastrar;
	private JButton btnSair;

	ListenerCadEsporte listener = ListenerCadEsporte.getInstance(this);
	private JLabel lblNewLabel_1;
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
		setBounds(100, 100, 863, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtEsporte());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblNewLabel_1());
	}

	public JTextField getTxtEsporte() {
		if (txtEsporte == null) {
			txtEsporte = new JTextField();
			txtEsporte.setBounds(149, 197, 235, 26);
			txtEsporte.setColumns(10);
		}
		return txtEsporte;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(171, 365, 115, 29);
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(398, 365, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(CadastroEsporteView.class.getResource("/br/inatel/ec206/imagens/cadastroEsporte.png")));
			lblNewLabel_1.setBounds(0, 0, 850, 550);
		}
		return lblNewLabel_1;
	}
}
