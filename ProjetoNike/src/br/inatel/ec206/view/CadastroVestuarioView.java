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

public class CadastroVestuarioView extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrar;
	private JButton btnSair;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtDescricao;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JComboBox cmbbxEsporte;
	private JTextField txtPreco;
	private JComboBox cmbbxTamanho;
	private JTextField txtCor;

	ListenerCadVestuario listener = ListenerCadVestuario.getInstance(this);
	private JComboBox cmbbxMarca;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVestuarioView frame = new CadastroVestuarioView();
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
	public CadastroVestuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getTxtDescricao());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getTxtPreco());
		contentPane.add(getCmbbxTamanho());
		contentPane.add(getTxtCor());
		contentPane.add(getCmbbxMarca());
	}

	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(326, 64, 115, 29);
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(326, 127, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Descri\u00E7\u00E3o:");
			lblNewLabel.setBounds(15, 32, 86, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Genero:");
			lblNewLabel_1.setBounds(15, 68, 69, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Tipo:");
			lblNewLabel_2.setBounds(15, 104, 69, 20);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Preco: ");
			lblNewLabel_3.setBounds(15, 145, 69, 20);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Tamanho:");
			lblNewLabel_4.setBounds(15, 187, 86, 20);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Cor:");
			lblNewLabel_5.setBounds(15, 223, 69, 20);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Marca:");
			lblNewLabel_6.setBounds(15, 259, 69, 20);
		}
		return lblNewLabel_6;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setBounds(103, 29, 146, 26);
			txtDescricao.setColumns(10);
		}
		return txtDescricao;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(79, 64, 101, 29);
		}
		return rdbtnMasculino;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("Feminino");
			rdbtnFeminino.setBounds(181, 64, 101, 29);
		}
		return rdbtnFeminino;
	}
	public JComboBox getCmbbxEsporte() 
	{
		if (cmbbxEsporte == null) 
		{
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(89, 101, 160, 26);
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
			txtPreco.setBounds(79, 142, 146, 26);
			txtPreco.setColumns(10);
		}
		return txtPreco;
	}
	public JComboBox getCmbbxTamanho() {
		if (cmbbxTamanho == null) {
			cmbbxTamanho = new JComboBox();
			cmbbxTamanho.setBounds(89, 184, 160, 26);
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
			txtCor.setBounds(79, 220, 146, 26);
			txtCor.setColumns(10);
		}
		return txtCor;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.setBounds(89, 256, 160, 26);
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
			
		}
		return cmbbxMarca;
	}
}
