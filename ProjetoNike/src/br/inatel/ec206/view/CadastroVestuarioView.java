package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadVestuario;
import br.inatel.ec206.controller.ListenerExcUsuario;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class CadastroVestuarioView extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrar;
	private JButton btnSair;
	private JTextField txtDescricao;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JComboBox cmbbxEsporte;
	private JTextField txtPreco;
	private JComboBox cmbbxTamanho;
	private JTextField txtCor;

	ListenerCadVestuario listener = ListenerCadVestuario.getInstance(this);
	private JComboBox cmbbxMarca;
	private JLabel lblNewLabel_7;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CadastroVestuarioView frame = new CadastroVestuarioView();
					frame.setVisible(true);
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroVestuarioView() {
		setForeground(Color.BLACK);
		setTitle("Cadastro Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 599);
		//setUndecorated(true); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtDescricao());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getTxtPreco());
		contentPane.add(getCmbbxTamanho());
		contentPane.add(getTxtCor());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getLblNewLabel_7());
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("");
			btnCadastrar.setIcon(new ImageIcon(CadastroVestuarioView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(118, 458, 138, 69);
			btnCadastrar.addActionListener(listener);
			btnCadastrar.setOpaque(false);
			btnCadastrar.setContentAreaFilled(false);
			btnCadastrar.setBorderPainted(false);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setIcon(new ImageIcon(CadastroVestuarioView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(326, 479, 115, 48);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setBounds(181, 156, 296, 26);
			txtDescricao.setColumns(10);
		}
		return txtDescricao;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setActionCommand("M");
			rdbtnMasculino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnMasculino.setForeground(Color.WHITE);
			rdbtnMasculino.setBackground(Color.BLACK);
			rdbtnMasculino.setBounds(245, 185, 76, 29);
			rdbtnMasculino.addActionListener(listener);
		}
		return rdbtnMasculino;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setActionCommand("F");
			rdbtnFeminino.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rdbtnFeminino.setBackground(Color.BLACK);
			rdbtnFeminino.setForeground(Color.WHITE);
			rdbtnFeminino.setBounds(339, 185, 63, 29);
			rdbtnFeminino.addActionListener(listener);
		}
		return rdbtnFeminino;
	}
	public JComboBox getCmbbxEsporte() 
	{
		if (cmbbxEsporte == null) 
		{
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(181, 226, 296, 26);
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
			txtPreco.setBounds(181, 268, 296, 26);
			txtPreco.setColumns(10);
		}
		return txtPreco;
	}
	public JComboBox getCmbbxTamanho() {
		if (cmbbxTamanho == null) {
			cmbbxTamanho = new JComboBox();
			cmbbxTamanho.setBounds(181, 310, 296, 26);
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
			txtCor.setBounds(184, 352, 293, 26);
			txtCor.setColumns(10);
		}
		return txtCor;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.setBounds(181, 400, 296, 26);
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
			
		}
		return cmbbxMarca;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(CadastroVestuarioView.class.getResource("/br/inatel/ec206/imagens/cadastroVestuario.png")));
			lblNewLabel_7.setBounds(0, 0, 835, 550);
		}
		return lblNewLabel_7;
	}
}
