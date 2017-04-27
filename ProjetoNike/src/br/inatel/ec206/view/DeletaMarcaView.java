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
import javax.swing.ImageIcon;

public class DeletaMarcaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408481910445217312L;
	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JLabel lblMarca;
	private JButton btnPesquisar;
	private JButton btnDeletar;
	private JButton btnSair;
	
	ListenerExcMarca listener = ListenerExcMarca.getInstance(this);
	private JLabel lblNewLabel_2;

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
		setBounds(100, 100, 866, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getLblMarca());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblNewLabel_2());
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(188, 154, 264, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setBounds(188, 238, 264, 20);
		}
		return lblMarca;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(477, 153, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(111, 375, 115, 29);
			btnDeletar.addActionListener(listener);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(337, 375, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(DeletaMarcaView.class.getResource("/br/inatel/ec206/imagens/remocaoMarca.png")));
			lblNewLabel_2.setBounds(0, 0, 844, 545);
		}
		return lblNewLabel_2;
	}
}
