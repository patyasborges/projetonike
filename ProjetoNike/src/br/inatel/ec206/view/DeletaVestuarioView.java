package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditVestuario;
import br.inatel.ec206.controller.ListenerExcVestuario;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class DeletaVestuarioView extends JFrame {

	private JPanel contentPane;
	private JButton btnPesquisar;
	private JTextField txtPesquisar;
	private JButton btnExcluir;
	private JButton btnSair;
	private JLabel lblDescricao;
	private JLabel lblGenero;
	private JLabel lblEsporte;
	private JLabel lblPreco;
	private JLabel lblTamanho;
	private JLabel lblCor;
	private JLabel lblMarca;
	
	ListenerExcVestuario listener = ListenerExcVestuario.getInstance(this);
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaVestuarioView frame = new DeletaVestuarioView();
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
	public DeletaVestuarioView() {
		setTitle("Deleta Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnPesquisar());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnExcluir());
		contentPane.add(getBtnSair());
		contentPane.add(getLblDescricao());
		contentPane.add(getLblGenero());
		contentPane.add(getLblEsporte());
		contentPane.add(getLblPreco());
		contentPane.add(getLblTamanho());
		contentPane.add(getLblCor());
		contentPane.add(getLblMarca());
		contentPane.add(getLblNewLabel_1());
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(DeletaVestuarioView.class.getResource("/br/inatel/ec206/imagens/pesquisaAzul.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(498, 84, 100, 93);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(193, 122, 278, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("Excluir");
			btnExcluir.setActionCommand("EXCLUIR");
			btnExcluir.setBounds(149, 474, 115, 29);
			btnExcluir.addActionListener(listener);
		}
		return btnExcluir;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(356, 474, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JLabel getLblDescricao() {
		if (lblDescricao == null) {
			lblDescricao = new JLabel("");
			lblDescricao.setForeground(Color.WHITE);
			lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblDescricao.setBounds(193, 184, 278, 20);
		}
		return lblDescricao;
	}
	public JLabel getLblGenero() {
		if (lblGenero == null) {
			lblGenero = new JLabel("");
			lblGenero.setForeground(Color.WHITE);
			lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblGenero.setBounds(193, 220, 278, 20);
		}
		return lblGenero;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setForeground(Color.WHITE);
			lblEsporte.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblEsporte.setBounds(193, 272, 278, 20);
		}
		return lblEsporte;
	}
	public JLabel getLblPreco() {
		if (lblPreco == null) {
			lblPreco = new JLabel("");
			lblPreco.setForeground(Color.WHITE);
			lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblPreco.setBounds(193, 308, 278, 20);
		}
		return lblPreco;
	}
	public JLabel getLblTamanho() {
		if (lblTamanho == null) {
			lblTamanho = new JLabel("");
			lblTamanho.setForeground(Color.WHITE);
			lblTamanho.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTamanho.setBounds(193, 354, 278, 20);
		}
		return lblTamanho;
	}
	public JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("");
			lblCor.setForeground(Color.WHITE);
			lblCor.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblCor.setBounds(193, 393, 278, 20);
		}
		return lblCor;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setForeground(Color.WHITE);
			lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblMarca.setBounds(193, 437, 278, 20);
		}
		return lblMarca;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(DeletaVestuarioView.class.getResource("/br/inatel/ec206/imagens/remocaoVestuario.png")));
			lblNewLabel_1.setBounds(0, 0, 828, 542);
		}
		return lblNewLabel_1;
	}
}
