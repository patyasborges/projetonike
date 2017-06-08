package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadUsuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class CadastroUsuarioView extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6602906066821793183L;
	private JPanel contentPane;
	public JTextField txtNome;
	public JTextField txtDataNascimento;
	public JTextField txtEmail;
	private JButton btnCadastrar;
	private JButton btnSair;
	public JRadioButton rdbtnCliente;
	public JRadioButton rdbtnAdministrador;
	
	ListenerCadUsuario listener = ListenerCadUsuario.getInstance(this);
	private JTextField txtSenha;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuarioView frame = new CadastroUsuarioView();
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
	public CadastroUsuarioView() {
		setTitle("Cadastrar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtNome());
		contentPane.add(getTxtDataNascimento());
		contentPane.add(getTxtEmail());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getRdbtnCliente());
		contentPane.add(getRdbtnAdministrador());
		contentPane.add(getTxtSenha());
		contentPane.add(getLblNewLabel_5());
	}
	public JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(246, 158, 226, 26);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	public JTextField getTxtDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setBounds(246, 200, 226, 26);
			txtDataNascimento.setColumns(10);
		}
		return txtDataNascimento;
	}
	public JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(246, 254, 226, 26);
			txtEmail.setColumns(10);
		}
		return txtEmail;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/br/inatel/ec206/imagens/botaoBranco.png")));
			btnCadastrar.setActionCommand("CAD");
			btnCadastrar.setBounds(47, 417, 169, 57);
			btnCadastrar.setOpaque(false);
			btnCadastrar.setContentAreaFilled(false);
			btnCadastrar.setBorderPainted(false);
			
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	public JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/br/inatel/ec206/imagens/sairBranco.png")));
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(277, 417, 115, 57);
			btnSair.setOpaque(false);
			btnSair.setContentAreaFilled(false);
			btnSair.setBorderPainted(false);
			
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JRadioButton getRdbtnCliente() {
		if (rdbtnCliente == null) {
			rdbtnCliente = new JRadioButton("");
			rdbtnCliente.setBackground(Color.BLACK);
			rdbtnCliente.setActionCommand("CLI");
			rdbtnCliente.setBounds(135, 292, 29, 29);
			rdbtnCliente.addActionListener(listener);
			
		}
		return rdbtnCliente;
	}
	public JRadioButton getRdbtnAdministrador() {
		if (rdbtnAdministrador == null) {
			rdbtnAdministrador = new JRadioButton("");
			rdbtnAdministrador.setBackground(Color.BLACK);
			rdbtnAdministrador.setActionCommand("ADM");
			rdbtnAdministrador.setBounds(273, 292, 29, 29);
			rdbtnAdministrador.addActionListener(listener);
			
		}
		return rdbtnAdministrador;
	}
	
	
	public JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(246, 346, 226, 26);
			txtSenha.setColumns(10);
		}
		return txtSenha;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(CadastroUsuarioView.class.getResource("/br/inatel/ec206/imagens/cadastroUsuario.png")));
			lblNewLabel_5.setBounds(0, 0, 850, 539);
		}
		return lblNewLabel_5;
	}
}
