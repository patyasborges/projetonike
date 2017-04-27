package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadArtigDesport;
import br.inatel.ec206.controller.ListenerCadUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class CadastroArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JComboBox cmbbxEsporte;
	private JTextField txtPreco;
	private JTextField txtTamanho;
	private JTextField txtCor;
	private JComboBox cmbbxMarca;
	private JButton btnCadastrar;
	private JButton btnSair;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;

	
	ListenerCadArtigDesport listener = ListenerCadArtigDesport.getInstance(this);
	private JLabel lblNewLabel_7;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroArtigDesportView frame = new CadastroArtigDesportView();
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
	public CadastroArtigDesportView() {
		setTitle("Cadastro Artigos Desportivos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtDescricao());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getTxtPreco());
		contentPane.add(getTxtTamanho());
		contentPane.add(getTxtCor());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getLblNewLabel_7());
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setBounds(183, 151, 181, 26);
			txtDescricao.setColumns(10);
		}
		return txtDescricao;
	}
	public JComboBox getCmbbxEsporte() {
		if (cmbbxEsporte == null) {
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.addItem("");
			cmbbxEsporte.addItem("Futebol");
			cmbbxEsporte.addItem("Basquete");
			cmbbxEsporte.addItem("Volei");
			cmbbxEsporte.setBounds(183, 237, 175, 26);
		}
		return cmbbxEsporte;
	}
	public JTextField getTxtPreco() {
		if (txtPreco == null) {
			txtPreco = new JTextField();
			txtPreco.setBounds(183, 279, 175, 26);
			txtPreco.setColumns(10);
		}
		return txtPreco;
	}
	public JTextField getTxtTamanho() {
		if (txtTamanho == null) {
			txtTamanho = new JTextField();
			txtTamanho.setBounds(183, 316, 175, 26);
			txtTamanho.setColumns(10);
		}
		return txtTamanho;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setBounds(183, 358, 175, 26);
			txtCor.setColumns(10);
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
			cmbbxMarca.setBounds(183, 400, 175, 26);
		}
		return cmbbxMarca;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(85, 474, 115, 29);
			
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(249, 474, 115, 29);
			
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setBackground(Color.BLACK);
			rdbtnFeminino.setForeground(Color.WHITE);
			rdbtnFeminino.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
			rdbtnFeminino.setActionCommand("F");
			rdbtnFeminino.setBounds(193, 189, 52, 29);
			rdbtnFeminino.addActionListener(listener);
		}
		return rdbtnFeminino;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setBackground(Color.BLACK);
			rdbtnMasculino.setForeground(Color.WHITE);
			rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnMasculino.setActionCommand("M");
			rdbtnMasculino.setBounds(264, 189, 52, 29);
			rdbtnMasculino.addActionListener(listener);
		}
		return rdbtnMasculino;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(CadastroArtigDesportView.class.getResource("/br/inatel/ec206/imagens/cadastroArtigos.png")));
			lblNewLabel_7.setBounds(0, 0, 833, 550);
		}
		return lblNewLabel_7;
	}
}
