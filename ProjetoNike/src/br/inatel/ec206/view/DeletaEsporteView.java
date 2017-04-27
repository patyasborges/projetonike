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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class DeletaEsporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JButton btnDeletar;
	private JButton btnSair;
	private JLabel lblEsporte;
	
	ListenerExcEsporte listener = ListenerExcEsporte.getInstance(this);
	private JLabel lblNewLabel;

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
		setBounds(100, 100, 853, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblEsporte());
		contentPane.add(getLblNewLabel());
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setColumns(10);
			txtPesquisar.setBounds(176, 160, 308, 26);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(521, 159, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(104, 392, 115, 29);
			btnDeletar.addActionListener(listener);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(298, 392, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setForeground(Color.WHITE);
			lblEsporte.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblEsporte.setBounds(176, 248, 308, 20);
		}
		return lblEsporte;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(DeletaEsporteView.class.getResource("/br/inatel/ec206/imagens/remocaoEsporte.png")));
			lblNewLabel.setBounds(0, 0, 841, 548);
		}
		return lblNewLabel;
	}
}
