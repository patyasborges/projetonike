package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditEsporte;
import br.inatel.ec206.controller.ListenerExcEsporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeletaEsporteView extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JLabel label_1;
	private JButton btnDeletar;
	private JButton btnSair;
	private JLabel lblEsporte;
	
	ListenerExcEsporte listener = ListenerExcEsporte.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaEsporteView frame = new DeletaEsporteView();
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
	public DeletaEsporteView() {
		setTitle("Deleta Esporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLabel_1());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblEsporte());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Esporte:");
			label.setBounds(15, 49, 69, 20);
		}
		return label;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setColumns(10);
			txtPesquisar.setBounds(122, 46, 146, 26);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(298, 45, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Esporte:");
			label_1.setBounds(15, 100, 69, 20);
		}
		return label_1;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(26, 162, 115, 29);
			btnDeletar.addActionListener(listener);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(165, 162, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setBounds(122, 100, 69, 20);
		}
		return lblEsporte;
	}
}
