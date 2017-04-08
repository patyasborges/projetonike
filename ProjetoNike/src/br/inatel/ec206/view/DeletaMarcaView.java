package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditMarca;
import br.inatel.ec206.controller.ListenerExcMarca;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DeletaMarcaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408481910445217312L;
	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblMarca;
	private JButton btnPesquisar;
	private JButton btnDeletar;
	private JButton btnSair;
	
	ListenerExcMarca listener = ListenerExcMarca.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaMarcaView frame = new DeletaMarcaView();
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
	public DeletaMarcaView() {
		setTitle("Deleta Marca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblMarca());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(111, 30, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Marca:");
			lblNewLabel.setBounds(15, 33, 69, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Marca:");
			lblNewLabel_1.setBounds(15, 102, 69, 20);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setBounds(111, 102, 69, 20);
		}
		return lblMarca;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(272, 29, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(272, 98, 115, 29);
			btnDeletar.addActionListener(listener);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(272, 159, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
}
