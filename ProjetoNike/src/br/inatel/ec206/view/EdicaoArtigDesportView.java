package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditArtigDesport;
import br.inatel.ec206.controller.ListenerEditVestuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class EdicaoArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;
	private JComboBox cmbbxEsporte;
	private JTextField txtPreco;
	private JTextField txtTamanho;
	private JTextField txtCor;
	private JComboBox cmbbxMarca;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtPesquisa;
	private JButton btnPesquisar;
	
	ListenerEditArtigDesport listener = ListenerEditArtigDesport.getInstance(this);
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoArtigDesportView frame = new EdicaoArtigDesportView();
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
	public EdicaoArtigDesportView() {
		setTitle("Editar Artigo Desportivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtDescricao());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getTxtPreco());
		contentPane.add(getTxtTamanho());
		contentPane.add(getTxtCor());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtPesquisa());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLblNewLabel());
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setColumns(10);
			txtDescricao.setBounds(166, 173, 188, 26);
		}
		return txtDescricao;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnFeminino.setBackground(Color.BLACK);
			rdbtnFeminino.setForeground(Color.WHITE);
			rdbtnFeminino.setActionCommand("F");
			rdbtnFeminino.setBounds(183, 219, 52, 29);
			rdbtnFeminino.addActionListener(listener);
		}
		return rdbtnFeminino;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnMasculino.setBackground(Color.BLACK);
			rdbtnMasculino.setForeground(Color.WHITE);
			rdbtnMasculino.setActionCommand("M");
			rdbtnMasculino.setBounds(266, 219, 52, 29);
			rdbtnMasculino.addActionListener(listener);
		}
		return rdbtnMasculino;
	}
	public JComboBox getCmbbxEsporte() {
		if (cmbbxEsporte == null) {
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(166, 260, 188, 26);
			cmbbxEsporte.addItem("");
			cmbbxEsporte.addItem("Futebol");
			cmbbxEsporte.addItem("Basquete");
			cmbbxEsporte.addItem("Volei");
		}
		return cmbbxEsporte;
	}
	public JTextField getTxtPreco() {
		if (txtPreco == null) {
			txtPreco = new JTextField();
			txtPreco.setColumns(10);
			txtPreco.setBounds(166, 302, 188, 26);
		}
		return txtPreco;
	}
	public JTextField getTxtTamanho() {
		if (txtTamanho == null) {
			txtTamanho = new JTextField();
			txtTamanho.setColumns(10);
			txtTamanho.setBounds(166, 344, 188, 26);
		}
		return txtTamanho;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setColumns(10);
			txtCor.setBounds(166, 386, 188, 26);
		}
		return txtCor;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
			cmbbxMarca.setBounds(166, 428, 188, 26);
		}
		return cmbbxMarca;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("");
			btnEditar.setIcon(new ImageIcon(EdicaoArtigDesportView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(15, 470, 170, 60);
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
			btnSair.setIcon(new ImageIcon(EdicaoArtigDesportView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(239, 480, 115, 50);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JTextField getTxtPesquisa() {
		if (txtPesquisa == null) {
			txtPesquisa = new JTextField();
			txtPesquisa.setColumns(10);
			txtPesquisa.setBounds(166, 119, 188, 26);
		}
		return txtPesquisa;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(EdicaoArtigDesportView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(369, 91, 115, 87);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(EdicaoArtigDesportView.class.getResource("/br/inatel/ec206/imagens/edicaoArtigos.png")));
			lblNewLabel.setBounds(0, 0, 844, 546);
		}
		return lblNewLabel;
	}
}
