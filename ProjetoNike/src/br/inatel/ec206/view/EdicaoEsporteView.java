package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadEsporte;
import br.inatel.ec206.controller.ListenerEditEsporte;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class EdicaoEsporteView extends JFrame {

	private JPanel contentPane;
	private JTextField txtEsporte;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	
	ListenerEditEsporte listener = ListenerEditEsporte.getInstance(this);
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoEsporteView frame = new EdicaoEsporteView();
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
	public EdicaoEsporteView() {
		setTitle("Editar Esporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtEsporte());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLblNewLabel_1());
	}
	public JTextField getTxtEsporte() {
		if (txtEsporte == null) {
			txtEsporte = new JTextField();
			txtEsporte.setColumns(10);
			txtEsporte.setBounds(165, 243, 266, 26);
		}
		return txtEsporte;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(77, 370, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(247, 370, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(165, 165, 266, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(478, 164, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(EdicaoEsporteView.class.getResource("/br/inatel/ec206/imagens/edicaoEsporte.png")));
			lblNewLabel_1.setBounds(0, 0, 827, 550);
		}
		return lblNewLabel_1;
	}
}
