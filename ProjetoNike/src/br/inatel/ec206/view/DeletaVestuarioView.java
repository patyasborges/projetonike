package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditVestuario;
import br.inatel.ec206.controller.ListenerExcVestuario;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DeletaVestuarioView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnPesquisar;
	private JTextField txtPesquisar;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JButton btnExcluir;
	private JButton btnSair;
	private JLabel lblDescricao;
	private JLabel lblGenero;
	private JLabel lblEsporte;
	private JLabel lblPreco;
	private JLabel lblTamanho;
	private JLabel lblCor;
	private JLabel lblMarca;
	
	ListenerExcVestuario listener = ListenerExcVestuario.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaVestuarioView frame = new DeletaVestuarioView();
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
	public DeletaVestuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getLabel_6());
		contentPane.add(getBtnExcluir());
		contentPane.add(getBtnSair());
		contentPane.add(getLblDescricao());
		contentPane.add(getLblGenero());
		contentPane.add(getLblEsporte());
		contentPane.add(getLblPreco());
		contentPane.add(getLblTamanho());
		contentPane.add(getLblCor());
		contentPane.add(getLblMarca());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Descricao: ");
			lblNewLabel.setBounds(15, 38, 86, 20);
		}
		return lblNewLabel;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(278, 34, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(99, 35, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Descri\u00E7\u00E3o:");
			label.setBounds(15, 81, 86, 20);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Genero:");
			label_1.setBounds(15, 117, 69, 20);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Tipo:");
			label_2.setBounds(15, 153, 69, 20);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Preco: ");
			label_3.setBounds(15, 194, 69, 20);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Tamanho:");
			label_4.setBounds(15, 236, 86, 20);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Cor:");
			label_5.setBounds(15, 272, 69, 20);
		}
		return label_5;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("Marca:");
			label_6.setBounds(15, 308, 69, 20);
		}
		return label_6;
	}
	private JButton getBtnExcluir() {
		if (btnExcluir == null) {
			btnExcluir = new JButton("Excluir");
			btnExcluir.setActionCommand("EXCLUIR");
			btnExcluir.setBounds(278, 113, 115, 29);
			btnExcluir.addActionListener(listener);
		}
		return btnExcluir;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(278, 175, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JLabel getLblDescricao() {
		if (lblDescricao == null) {
			lblDescricao = new JLabel("");
			lblDescricao.setBounds(109, 77, 69, 20);
		}
		return lblDescricao;
	}
	public JLabel getLblGenero() {
		if (lblGenero == null) {
			lblGenero = new JLabel("");
			lblGenero.setBounds(109, 117, 69, 20);
		}
		return lblGenero;
	}
	public JLabel getLblEsporte() {
		if (lblEsporte == null) {
			lblEsporte = new JLabel("");
			lblEsporte.setBounds(109, 153, 69, 20);
		}
		return lblEsporte;
	}
	public JLabel getLblPreco() {
		if (lblPreco == null) {
			lblPreco = new JLabel("");
			lblPreco.setBounds(109, 194, 69, 20);
		}
		return lblPreco;
	}
	public JLabel getLblTamanho() {
		if (lblTamanho == null) {
			lblTamanho = new JLabel("");
			lblTamanho.setBounds(99, 236, 69, 20);
		}
		return lblTamanho;
	}
	public JLabel getLblCor() {
		if (lblCor == null) {
			lblCor = new JLabel("");
			lblCor.setBounds(109, 272, 69, 20);
		}
		return lblCor;
	}
	public JLabel getLblMarca() {
		if (lblMarca == null) {
			lblMarca = new JLabel("");
			lblMarca.setBounds(109, 308, 69, 20);
		}
		return lblMarca;
	}
}
