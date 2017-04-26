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

public class EdicaoArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField txtDescricao;
	private JLabel label_1;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;
	private JComboBox cmbbxEsporte;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField txtPreco;
	private JTextField txtTamanho;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField txtCor;
	private JLabel label_6;
	private JComboBox cmbbxMarca;
	private JButton btnEditar;
	private JButton btnSair;
	private JLabel label_7;
	private JTextField txtPesquisa;
	private JButton btnPesquisar;
	
	ListenerEditArtigDesport listener = ListenerEditArtigDesport.getInstance(this);

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
		setBounds(100, 100, 568, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getTxtDescricao());
		contentPane.add(getLabel_1());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getTxtPreco());
		contentPane.add(getTxtTamanho());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getTxtCor());
		contentPane.add(getLabel_6());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getLabel_7());
		contentPane.add(getTxtPesquisa());
		contentPane.add(getBtnPesquisar());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Descricao: ");
			label.setBounds(15, 69, 87, 20);
		}
		return label;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setColumns(10);
			txtDescricao.setBounds(138, 66, 146, 26);
		}
		return txtDescricao;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Genero:");
			label_1.setBounds(15, 99, 69, 20);
		}
		return label_1;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("F");
			rdbtnFeminino.setBounds(129, 95, 41, 29);
		}
		return rdbtnFeminino;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("M");
			rdbtnMasculino.setBounds(183, 95, 52, 29);
		}
		return rdbtnMasculino;
	}
	public JComboBox getCmbbxEsporte() {
		if (cmbbxEsporte == null) {
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(138, 129, 146, 26);
			cmbbxEsporte.addItem("");
			cmbbxEsporte.addItem("Futebol");
			cmbbxEsporte.addItem("Basquete");
			cmbbxEsporte.addItem("Volei");
		}
		return cmbbxEsporte;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Esporte: ");
			label_2.setBounds(15, 132, 69, 20);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Preco:");
			label_3.setBounds(15, 168, 69, 20);
		}
		return label_3;
	}
	public JTextField getTxtPreco() {
		if (txtPreco == null) {
			txtPreco = new JTextField();
			txtPreco.setColumns(10);
			txtPreco.setBounds(138, 165, 146, 26);
		}
		return txtPreco;
	}
	public JTextField getTxtTamanho() {
		if (txtTamanho == null) {
			txtTamanho = new JTextField();
			txtTamanho.setColumns(10);
			txtTamanho.setBounds(138, 209, 146, 26);
		}
		return txtTamanho;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Tamanho:");
			label_4.setBounds(15, 212, 87, 20);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Cor:");
			label_5.setBounds(15, 261, 69, 20);
		}
		return label_5;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setColumns(10);
			txtCor.setBounds(138, 258, 146, 26);
		}
		return txtCor;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("Marca:");
			label_6.setBounds(15, 302, 69, 20);
		}
		return label_6;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
			cmbbxMarca.setBounds(138, 299, 146, 26);
		}
		return cmbbxMarca;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(34, 368, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(164, 368, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("Descricao: ");
			label_7.setBounds(15, 30, 87, 20);
		}
		return label_7;
	}
	public JTextField getTxtPesquisa() {
		if (txtPesquisa == null) {
			txtPesquisa = new JTextField();
			txtPesquisa.setColumns(10);
			txtPesquisa.setBounds(138, 27, 146, 26);
		}
		return txtPesquisa;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(311, 26, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
}
