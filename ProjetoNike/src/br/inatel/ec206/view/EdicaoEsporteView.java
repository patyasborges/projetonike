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

public class EdicaoEsporteView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JTextField txtEsporte;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	
	ListenerEditEsporte listener = ListenerEditEsporte.getInstance(this);

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabel());
		contentPane.add(getTxtEsporte());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Esporte:");
			lblNewLabel.setBounds(15, 39, 69, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Esporte:");
			label.setBounds(15, 90, 69, 20);
		}
		return label;
	}
	public JTextField getTxtEsporte() {
		if (txtEsporte == null) {
			txtEsporte = new JTextField();
			txtEsporte.setColumns(10);
			txtEsporte.setBounds(122, 87, 146, 26);
		}
		return txtEsporte;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(26, 152, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(165, 152, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(122, 36, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(298, 35, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
}
