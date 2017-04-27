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
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class DeletaUsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JButton btnPesquisar;
	private JLabel lblNome;
	private JLabel lblDataNascimento;
	private JLabel lblEmail;
	private JLabel lblTipo;
	private JButton btnDeletar;
	private JButton btnSair;
	
	ListenerExcUsuario listener = ListenerExcUsuario.getInstance(this);
	private JLabel lblSenha;
	private JLabel lblNewLabel_5;

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
		setTitle("Deletar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getLblNome());
		contentPane.add(getLblDataNascimento());
		contentPane.add(getLblEmail());
		contentPane.add(getLblTipo());
		contentPane.add(getBtnDeletar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblSenha());
		contentPane.add(getLblNewLabel_5());
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(255, 152, 146, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	public JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(DeletaUsuarioView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(448, 124, 115, 87);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("");
			lblNome.setForeground(Color.WHITE);
			lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblNome.setBounds(255, 205, 263, 20);
		}
		return lblNome;
	}
	public JLabel getLblDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel("");
			lblDataNascimento.setForeground(Color.WHITE);
			lblDataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblDataNascimento.setBounds(254, 256, 263, 20);
		}
		return lblDataNascimento;
	}
	public JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblEmail.setBounds(255, 305, 263, 20);
		}
		return lblEmail;
	}
	public JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("");
			lblTipo.setForeground(Color.WHITE);
			lblTipo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblTipo.setBounds(286, 346, 232, 20);
		}
		return lblTipo;
	}
	private JButton getBtnDeletar() {
		if (btnDeletar == null) {
			btnDeletar = new JButton("Deletar");
			btnDeletar.setIcon(new ImageIcon(DeletaUsuarioView.class.getResource("/br/inatel/ec206/imagens/Deletarbranco.png")));
			btnDeletar.setActionCommand("DELETAR");
			btnDeletar.setBounds(36, 457, 146, 59);
			btnDeletar.addActionListener(listener);
			btnDeletar.setOpaque(false);
			btnDeletar.setContentAreaFilled(false);
			btnDeletar.setBorderPainted(false);
			
		}
		return btnDeletar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("");
			btnSair.setIcon(new ImageIcon(DeletaUsuarioView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(286, 442, 115, 59);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JLabel getLblSenha() {
		if (lblSenha == null) {
			lblSenha = new JLabel("");
			lblSenha.setForeground(Color.WHITE);
			lblSenha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			lblSenha.setBounds(256, 394, 263, 20);
		}
		return lblSenha;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(DeletaUsuarioView.class.getResource("/br/inatel/ec206/imagens/remocaoUsuarios.png")));
			lblNewLabel_5.setBounds(0, 0, 819, 550);
		}
		return lblNewLabel_5;
	}
}
