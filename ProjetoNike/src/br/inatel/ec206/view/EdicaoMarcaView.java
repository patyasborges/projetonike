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
import javax.swing.ImageIcon;

public class EdicaoMarcaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtMarca;
	
	ListenerEditMarca listener = ListenerEditMarca.getInstance(this);
	private JLabel lblNewLabel_2;

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
		setTitle("Editar Marcas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 863, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtMarca());
		contentPane.add(getLblNewLabel_2());
	}

	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(170, 146, 206, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(EdicaoMarcaView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(408, 134, 115, 87);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("");
			btnEditar.setIcon(new ImageIcon(EdicaoMarcaView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(49, 313, 161, 87);
			btnEditar.addActionListener(listener);
			btnEditar.setOpaque(false);
			btnEditar.setContentAreaFilled(false);
			btnEditar.setBorderPainted(false);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("");
			btnSair.setIcon(new ImageIcon(EdicaoMarcaView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(261, 333, 115, 67);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JTextField getTxtMarca() {
		if (txtMarca == null) {
			txtMarca = new JTextField();
			txtMarca.setBounds(170, 206, 206, 26);
			txtMarca.setColumns(10);
		}
		return txtMarca;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(EdicaoMarcaView.class.getResource("/br/inatel/ec206/imagens/edicaoMarca.png")));
			lblNewLabel_2.setBounds(0, 0, 848, 529);
		}
		return lblNewLabel_2;
	}
}
