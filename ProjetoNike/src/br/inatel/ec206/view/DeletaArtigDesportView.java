package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadArtigDesport;
import br.inatel.ec206.controller.ListenerExcArtigDesport;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class DeletaArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JButton btnDeletar;
	private JButton btnSair;
	private JButton btnPesquisar;
	private JTextField txtPesquisa;
	private JLabel lblDescricao;
	private JLabel lblGenero;
	private JLabel lblEsporte;
	private JLabel lblPreco;
	private JLabel lblTamanho;
	private JLabel lblCor;
	private JLabel lblMarca;
	
	
	ListenerExcArtigDesport listener = ListenerExcArtigDesport.getInstance(this);
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaArtigDesportView frame = new DeletaArtigDesportView();
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
	public DeletaArtigDesportView() {
		setTitle("Deleta Artigos Desportivos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getTxtPesquisa());
		contentPane.add(getLblDescricao());
		contentPane.add(getLblGenero());
		contentPane.add(getLblEsporte());
		contentPane.add(getLblPreco());
		contentPane.add(getLblTamanho());
		contentPane.add(getLblCor());
		contentPane.add(getLblMarca());
		contentPane.add(getLblNewLabel());
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("");
			btnDeletar.setIcon(new ImageIcon(DeletaArtigDesportView.class.getResource("/br/inatel/ec206/imagens/Deletarbranco.png")));
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(95, 488, 115, 41);
			btnDeletar.addActionListener(listener);
			btnDeletar.setOpaque(false);
			btnDeletar.setContentAreaFilled(false);
			btnDeletar.setBorderPainted(false);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setIcon(new ImageIcon(DeletaArtigDesportView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(294, 476, 115, 53);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(DeletaArtigDesportView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(349, 100, 146, 90);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	public JTextField getTxtPesquisa() {
		if (txtPesquisa == null) {
			txtPesquisa = new JTextField();
			txtPesquisa.setBounds(188, 130, 146, 26);
			txtPesquisa.setColumns(10);
		}
		return txtPesquisa;
	}
	public JLabel getLblDescricao() {
		if (lblDescricao == null) {
			lblDescricao = new JLabel("");
			lblDescricao.setForeground(Color.WHITE);
			lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblDescricao.setBounds(200, 185, 209, 20);
		}
		return lblDescricao;
	}
	public JLabel getLblGenero() {
		if (lblGenero == null) {
			lblGenero = new JLabel("");
			lblGenero.setForeground(Color.WHITE);
			lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblGenero.setBounds(200, 225, 209, 20);
		}
		return lblGenero;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setForeground(Color.WHITE);
			lblEsporte.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblEsporte.setBounds(200, 272, 209, 20);
		}
		return lblEsporte;
	}
	public JLabel getLblPreco() {
		if (lblPreco == null) {
			lblPreco = new JLabel("");
			lblPreco.setForeground(Color.WHITE);
			lblPreco.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblPreco.setBounds(200, 314, 209, 20);
		}
		return lblPreco;
	}
	public JLabel getLblTamanho() {
		if (lblTamanho == null) {
			lblTamanho = new JLabel("");
			lblTamanho.setForeground(Color.WHITE);
			lblTamanho.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblTamanho.setBounds(200, 351, 209, 20);
		}
		return lblTamanho;
	}
	public JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("");
			lblCor.setForeground(Color.WHITE);
			lblCor.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblCor.setBounds(200, 404, 209, 20);
		}
		return lblCor;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setForeground(Color.WHITE);
			lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblMarca.setBounds(200, 440, 209, 20);
		}
		return lblMarca;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(DeletaArtigDesportView.class.getResource("/br/inatel/ec206/imagens/remocarArtigos.png")));
			lblNewLabel.setBounds(0, 0, 840, 550);
		}
		return lblNewLabel;
	}
}
