package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class EdicaoUsuarioView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3622373046369348333L;
	
	private JPanel contentPane;
	public JTextField txtPesquisar;
	public JTextField txtNome;
	private JTextField txtDataNascimento;
	private JTextField txtEmail;
	private JRadioButton rdbtnCliente;
	private JRadioButton rdbtnAdministrador;
	private JButton btnPesquisar;
	private JButton btnEditar;
	private JButton btnSair;

	
	ListenerEditUsuario listener = ListenerEditUsuario.getInstance(this);
	private JTextField txtSenha;
	private JLabel lblNewLabel_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoUsuarioView frame = new EdicaoUsuarioView();
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
	public EdicaoUsuarioView() {
		setTitle("Editar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtPesquisar());
		contentPane.add(getTxtNome());
		contentPane.add(getTxtDataNascimento());
		contentPane.add(getTxtEmail());
		contentPane.add(getRdbtnCliente());
		contentPane.add(getRdbtnAdministrador());
		contentPane.add(getBtnPesquisar());
		contentPane.add(getBtnEditar());
		contentPane.add(getBtnSair());
		contentPane.add(getTxtSenha());
		contentPane.add(getLblNewLabel_6());
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(255, 134, 256, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	public JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(255, 204, 256, 26);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	public JTextField getTxtDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setBounds(255, 246, 256, 26);
			txtDataNascimento.setColumns(10);
		}
		return txtDataNascimento;
	}
	public JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(255, 288, 256, 26);
			txtEmail.setColumns(10);
		}
		return txtEmail;
	}
	public JRadioButton getRdbtnCliente() {
		if (rdbtnCliente == null) {
			rdbtnCliente = new JRadioButton("");
			rdbtnCliente.setBackground(Color.BLACK);
			rdbtnCliente.setBounds(138, 326, 29, 29);
		}
		return rdbtnCliente;
	}
	public JRadioButton getRdbtnAdministrador() {
		if (rdbtnAdministrador == null) {
			rdbtnAdministrador = new JRadioButton("");
			rdbtnAdministrador.setBackground(Color.BLACK);
			rdbtnAdministrador.setBounds(271, 326, 29, 29);
		}
		return rdbtnAdministrador;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("");
			btnPesquisar.setIcon(new ImageIcon(EdicaoUsuarioView.class.getResource("/br/inatel/ec206/imagens/pesquisarBranco.png")));
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(539, 113, 115, 84);
			btnPesquisar.addActionListener(listener);
			btnPesquisar.setOpaque(false);
			btnPesquisar.setContentAreaFilled(false);
			btnPesquisar.setBorderPainted(false);
		}
		return btnPesquisar;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("");
			btnEditar.setIcon(new ImageIcon(EdicaoUsuarioView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(59, 433, 181, 69);
			btnEditar.addActionListener(listener);
			btnEditar.setOpaque(false);
			btnEditar.setContentAreaFilled(false);
			btnEditar.setBorderPainted(false);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("");
			btnSair.setIcon(new ImageIcon(EdicaoUsuarioView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(350, 452, 115, 50);
			btnSair.addActionListener(listener);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
		}
		return btnSair;
	}
	public JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(255, 381, 256, 26);
			txtSenha.setColumns(10);
		}
		return txtSenha;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setIcon(new ImageIcon(EdicaoUsuarioView.class.getResource("/br/inatel/ec206/imagens/edicaoUsuarios.png")));
			lblNewLabel_6.setBounds(0, 0, 820, 535);
		}
		return lblNewLabel_6;
	}
}
