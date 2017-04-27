package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadVestuario;
import br.inatel.ec206.controller.ListenerEditVestuario;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class EdicaoVestuarioView extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JTextField txtDescricao;
	private JComboBox cmbbxEsporte;
	private JTextField txtPreco;
	private JComboBox cmbbxTamanho;
	private JTextField txtCor;
	private JComboBox cmbbxMarca;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	
	
	ListenerEditVestuario listener = ListenerEditVestuario.getInstance(this);
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoVestuarioView frame = new EdicaoVestuarioView();
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
	public EdicaoVestuarioView() {
		setTitle("Editar Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getTxtDescricao());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getTxtPreco());
		contentPane.add(getCmbbxTamanho());
		contentPane.add(getTxtCor());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLblNewLabel_1());
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setBackground(Color.BLACK);
			rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnMasculino.setForeground(Color.WHITE);
			rdbtnMasculino.setBounds(277, 230, 55, 29);
		}
		return rdbtnMasculino;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setForeground(Color.WHITE);
			rdbtnFeminino.setBackground(Color.BLACK);
			rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnFeminino.setBounds(369, 230, 45, 29);
		}
		return rdbtnFeminino;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setColumns(10);
			txtDescricao.setBounds(214, 192, 282, 26);
		}
		return txtDescricao;
	}
	public JComboBox getCmbbxEsporte() {
		if (cmbbxEsporte == null) {
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(215, 271, 281, 26);
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
			txtPreco.setBounds(215, 305, 281, 26);
		}
		return txtPreco;
	}
	public JComboBox getCmbbxTamanho() {
		if (cmbbxTamanho == null) {
			cmbbxTamanho = new JComboBox();
			cmbbxTamanho.setBounds(215, 336, 281, 26);
			cmbbxTamanho.addItem("");
			cmbbxTamanho.addItem("PP");
			cmbbxTamanho.addItem("P");
			cmbbxTamanho.addItem("M");
			cmbbxTamanho.addItem("G");
			cmbbxTamanho.addItem("GG");
		}
		return cmbbxTamanho;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setColumns(10);
			txtCor.setBounds(215, 376, 281, 26);
		}
		return txtCor;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.setBounds(214, 408, 282, 26);
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
		}
		return cmbbxMarca;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("");
			btnEditar.setIcon(new ImageIcon(EdicaoVestuarioView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(104, 462, 144, 62);
			btnEditar.addActionListener(listener);
			btnEditar.setOpaque(false);
			btnEditar.setContentAreaFilled(false);
			btnEditar.setBorderPainted(false);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setIcon(new ImageIcon(EdicaoVestuarioView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(334, 462, 115, 46);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(214, 131, 282, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(EdicaoVestuarioView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(501, 101, 115, 93);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(EdicaoVestuarioView.class.getResource("/br/inatel/ec206/imagens/edicaoVestuario.png")));
			lblNewLabel_1.setBounds(0, 0, 829, 524);
		}
		return lblNewLabel_1;
	}
}
