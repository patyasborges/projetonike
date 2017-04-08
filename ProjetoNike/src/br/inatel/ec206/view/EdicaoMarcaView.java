package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadMarca;
import br.inatel.ec206.controller.ListenerEditMarca;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EdicaoMarcaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtMarca;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	ListenerEditMarca listener = ListenerEditMarca.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoMarcaView frame = new EdicaoMarcaView();
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
	public EdicaoMarcaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtMarca());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
	}

	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(120, 26, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(281, 25, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(281, 93, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(281, 160, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JTextField getTxtMarca() {
		if (txtMarca == null) {
			txtMarca = new JTextField();
			txtMarca.setBounds(108, 94, 146, 26);
			txtMarca.setColumns(10);
		}
		return txtMarca;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Marca:");
			lblNewLabel.setBounds(15, 29, 69, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Marca:");
			lblNewLabel_1.setBounds(15, 97, 69, 20);
		}
		return lblNewLabel_1;
	}
}
