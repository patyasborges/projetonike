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

public class EdicaoVestuarioView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JTextField txtDescricao;
	private JLabel label_2;
	private JComboBox cmbbxEsporte;
	private JLabel label_3;
	private JTextField txtPreco;
	private JLabel label_4;
	private JComboBox cmbbxTamanho;
	private JLabel label_5;
	private JTextField txtCor;
	private JLabel label_6;
	private JComboBox cmbbxMarca;
	private JButton btnEditar;
	private JButton btnSair;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	
	
	ListenerEditVestuario listener = ListenerEditVestuario.getInstance(this);

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getRdbtnMasculino());
		contentPane.add(getRdbtnFeminino());
		contentPane.add(getTxtDescricao());
		contentPane.add(getLabel_2());
		contentPane.add(getCmbbxEsporte());
		contentPane.add(getLabel_3());
		contentPane.add(getTxtPreco());
		contentPane.add(getLabel_4());
		contentPane.add(getCmbbxTamanho());
		contentPane.add(getLabel_5());
		contentPane.add(getTxtCor());
		contentPane.add(getLabel_6());
		contentPane.add(getCmbbxMarca());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Descricao:");
			lblNewLabel.setBounds(15, 16, 86, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Descri\u00E7\u00E3o:");
			label.setBounds(15, 73, 86, 20);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Genero:");
			label_1.setBounds(15, 109, 69, 20);
		}
		return label_1;
	}
	public JRadioButton getRdbtnMasculino() {
		if (rdbtnMasculino == null) {
			rdbtnMasculino = new JRadioButton("Masculino");
			rdbtnMasculino.setBounds(79, 105, 101, 29);
		}
		return rdbtnMasculino;
	}
	public JRadioButton getRdbtnFeminino() {
		if (rdbtnFeminino == null) {
			rdbtnFeminino = new JRadioButton("Feminino");
			rdbtnFeminino.setBounds(181, 105, 101, 29);
		}
		return rdbtnFeminino;
	}
	public JTextField getTxtDescricao() {
		if (txtDescricao == null) {
			txtDescricao = new JTextField();
			txtDescricao.setColumns(10);
			txtDescricao.setBounds(103, 70, 146, 26);
		}
		return txtDescricao;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Tipo:");
			label_2.setBounds(15, 145, 69, 20);
		}
		return label_2;
	}
	public JComboBox getCmbbxEsporte() {
		if (cmbbxEsporte == null) {
			cmbbxEsporte = new JComboBox();
			cmbbxEsporte.setBounds(89, 142, 160, 26);
			cmbbxEsporte.addItem("");
			cmbbxEsporte.addItem("Futebol");
			cmbbxEsporte.addItem("Basquete");
			cmbbxEsporte.addItem("Volei");
		}
		return cmbbxEsporte;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Preco: ");
			label_3.setBounds(15, 186, 69, 20);
		}
		return label_3;
	}
	public JTextField getTxtPreco() {
		if (txtPreco == null) {
			txtPreco = new JTextField();
			txtPreco.setColumns(10);
			txtPreco.setBounds(79, 183, 146, 26);
		}
		return txtPreco;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Tamanho:");
			label_4.setBounds(15, 228, 86, 20);
		}
		return label_4;
	}
	public JComboBox getCmbbxTamanho() {
		if (cmbbxTamanho == null) {
			cmbbxTamanho = new JComboBox();
			cmbbxTamanho.setBounds(89, 225, 160, 26);
			cmbbxTamanho.addItem("");
			cmbbxTamanho.addItem("PP");
			cmbbxTamanho.addItem("P");
			cmbbxTamanho.addItem("M");
			cmbbxTamanho.addItem("G");
			cmbbxTamanho.addItem("GG");
		}
		return cmbbxTamanho;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Cor:");
			label_5.setBounds(15, 264, 69, 20);
		}
		return label_5;
	}
	public JTextField getTxtCor() {
		if (txtCor == null) {
			txtCor = new JTextField();
			txtCor.setColumns(10);
			txtCor.setBounds(79, 261, 146, 26);
		}
		return txtCor;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("Marca:");
			label_6.setBounds(15, 300, 69, 20);
		}
		return label_6;
	}
	public JComboBox getCmbbxMarca() {
		if (cmbbxMarca == null) {
			cmbbxMarca = new JComboBox();
			cmbbxMarca.setBounds(89, 297, 160, 26);
			cmbbxMarca.addItem("");
			cmbbxMarca.addItem("Nike +");
			cmbbxMarca.addItem("Jordan");
			cmbbxMarca.addItem("Outra");
		}
		return cmbbxMarca;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(326, 105, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(326, 168, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(99, 13, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(278, 12, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
}
