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

public class CadastroArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
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
		setBounds(100, 100, 503, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
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
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Descricao: ");
			lblNewLabel.setBounds(15, 45, 87, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Genero:");
			lblNewLabel_1.setBounds(15, 90, 69, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Esporte: ");
			lblNewLabel_2.setBounds(15, 141, 69, 20);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Preco:");
			lblNewLabel_3.setBounds(15, 177, 69, 20);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Tamanho:");
			lblNewLabel_4.setBounds(15, 221, 87, 20);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Cor:");
			lblNewLabel_5.setBounds(15, 270, 69, 20);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Marca:");
			lblNewLabel_6.setBounds(15, 311, 69, 20);
		}
		return lblNewLabel_6;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setBounds(138, 42, 146, 26);
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
			cmbbxEsporte.setBounds(138, 138, 146, 26);
		}
		return cmbbxEsporte;
	}
	public JTextField getTxtPreco() {
		if (txtPreco == null) {
			txtPreco = new JTextField();
			txtPreco.setBounds(138, 174, 146, 26);
			txtPreco.setColumns(10);
		}
		return txtPreco;
	}
	public JTextField getTxtTamanho() {
		if (txtTamanho == null) {
			txtTamanho = new JTextField();
			txtTamanho.setBounds(138, 218, 146, 26);
			txtTamanho.setColumns(10);
		}
		return txtTamanho;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setBounds(138, 267, 146, 26);
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
			cmbbxMarca.setBounds(138, 308, 146, 26);
		}
		return cmbbxMarca;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(81, 393, 115, 29);
			
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(257, 393, 115, 29);
			
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setBounds(129, 86, 41, 29);
		}
		return rdbtnFeminino;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setBounds(177, 86, 52, 29);
		}
		return rdbtnMasculino;
	}
}
