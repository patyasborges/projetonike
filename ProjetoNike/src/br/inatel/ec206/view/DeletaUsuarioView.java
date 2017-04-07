package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditUsuario;
import br.inatel.ec206.controller.ListenerExcUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeletaUsuarioView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNome;
	private JLabel lblDataNascimento;
	private JLabel lblEmail;
	private JLabel lblTipo;
	private JButton btnDeletar;
	private JButton btnSair;
	
	ListenerExcUsuario listener = ListenerExcUsuario.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaUsuarioView frame = new DeletaUsuarioView();
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
	public DeletaUsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNome());
		contentPane.add(getLblDataNascimento());
		contentPane.add(getLblEmail());
		contentPane.add(getLblTipo());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBounds(15, 31, 69, 20);
		}
		return lblNewLabel;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(115, 28, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	public JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(68, 78, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Nome:");
			lblNewLabel_1.setBounds(15, 136, 69, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Data de Nascimento:");
			lblNewLabel_2.setBounds(15, 178, 162, 20);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("E-mail:");
			lblNewLabel_3.setBounds(15, 224, 69, 20);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Tipo:");
			lblNewLabel_4.setBounds(15, 274, 69, 20);
		}
		return lblNewLabel_4;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("");
			lblNome.setBounds(115, 136, 69, 20);
		}
		return lblNome;
	}
	public JLabel getLblDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel("");
			lblDataNascimento.setBounds(192, 178, 69, 20);
		}
		return lblDataNascimento;
	}
	public JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("");
			lblEmail.setBounds(114, 224, 69, 20);
		}
		return lblEmail;
	}
	public JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("");
			lblTipo.setBounds(114, 274, 69, 20);
		}
		return lblTipo;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(250, 132, 115, 29);
			btnDeletar.addActionListener(listener);
			
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(250, 215, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
}
