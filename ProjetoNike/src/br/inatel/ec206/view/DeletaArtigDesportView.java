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

public class DeletaArtigDesportView extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JButton btnDeletar;
	private JButton btnSair;
	private JLabel label_7;
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
		setBounds(100, 100, 633, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getLabel_6());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getLabel_7());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getTxtPesquisa());
		contentPane.add(getLblDescricao());
		contentPane.add(getLblGenero());
		contentPane.add(getLblEsporte());
		contentPane.add(getLblPreco());
		contentPane.add(getLblTamanho());
		contentPane.add(getLblCor());
		contentPane.add(getLblMarca());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Descricao: ");
			label.setBounds(35, 67, 87, 20);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Genero:");
			label_1.setBounds(35, 112, 69, 20);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Esporte: ");
			label_2.setBounds(35, 163, 69, 20);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Preco:");
			label_3.setBounds(35, 199, 69, 20);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Tamanho:");
			label_4.setBounds(35, 243, 87, 20);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Cor:");
			label_5.setBounds(35, 292, 69, 20);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("Marca:");
			label_6.setBounds(35, 333, 69, 20);
		}
		return label_6;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(101, 415, 115, 29);
			btnDeletar.addActionListener(listener);
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(277, 415, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("Descricao: ");
			label_7.setBounds(35, 32, 87, 20);
		}
		return label_7;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(401, 28, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	public JTextField getTxtPesquisa() {
		if (txtPesquisa == null) {
			txtPesquisa = new JTextField();
			txtPesquisa.setBounds(149, 29, 146, 26);
			txtPesquisa.setColumns(10);
		}
		return txtPesquisa;
	}
	public JLabel getLblDescricao() {
		if (lblDescricao == null) {
			lblDescricao = new JLabel("");
			lblDescricao.setBounds(147, 67, 69, 20);
		}
		return lblDescricao;
	}
	public JLabel getLblGenero() {
		if (lblGenero == null) {
			lblGenero = new JLabel("");
			lblGenero.setBounds(149, 112, 69, 20);
		}
		return lblGenero;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setBounds(149, 163, 69, 20);
		}
		return lblEsporte;
	}
	public JLabel getLblPreco() {
		if (lblPreco == null) {
			lblPreco = new JLabel("");
			lblPreco.setBounds(147, 199, 69, 20);
		}
		return lblPreco;
	}
	public JLabel getLblTamanho() {
		if (lblTamanho == null) {
			lblTamanho = new JLabel("");
			lblTamanho.setBounds(149, 243, 69, 20);
		}
		return lblTamanho;
	}
	public JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("");
			lblCor.setBounds(147, 292, 69, 20);
		}
		return lblCor;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setBounds(149, 333, 69, 20);
		}
		return lblMarca;
	}
}
