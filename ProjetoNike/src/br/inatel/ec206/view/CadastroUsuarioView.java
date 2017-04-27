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

public class CadastroUsuarioView extends JFrame 
{

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	public JTextField txtNome;
	public JTextField txtDataNascimento;
	public JTextField txtEmail;
	private JButton btnCadastrar;
	private JButton btnSair;
	public JRadioButton rdbtnCliente;
	public JRadioButton rdbtnAdministrador;
	
	ListenerCadUsuario listener = ListenerCadUsuario.getInstance(this);
	private JTextField txtSenha;
	private JLabel lblNewLabel_4;

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
		setBounds(100, 100, 461, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTxtNome());
		contentPane.add(getTxtDataNascimento());
		contentPane.add(getTxtEmail());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getRdbtnCliente());
		contentPane.add(getRdbtnAdministrador());
		contentPane.add(getTxtSenha());
		contentPane.add(getLblNewLabel_4());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBounds(15, 48, 69, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Data de nascimento:");
			lblNewLabel_1.setBounds(15, 84, 146, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("E-mail:");
			lblNewLabel_2.setBounds(15, 130, 69, 20);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Tipo:");
			lblNewLabel_3.setBounds(15, 172, 69, 20);
		}
		return lblNewLabel_3;
	}
	public JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(101, 45, 146, 26);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	public JTextField getTxtDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setBounds(164, 81, 81, 26);
			txtDataNascimento.setColumns(10);
		}
		return txtDataNascimento;
	}
	public JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(101, 127, 146, 26);
			txtEmail.setColumns(10);
		}
		return txtEmail;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CAD");
			btnCadastrar.setBounds(277, 69, 115, 29);
			
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	public JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(277, 137, 115, 29);
			
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JRadioButton getRdbtnCliente() {
		if (rdbtnCliente == null) {
			rdbtnCliente = new JRadioButton("Cliente");
			rdbtnCliente.setActionCommand("CLI");
			rdbtnCliente.setBounds(15, 204, 81, 29);
			rdbtnCliente.addActionListener(listener);
			
		}
		return rdbtnCliente;
	}
	public JRadioButton getRdbtnAdministrador() {
		if (rdbtnAdministrador == null) {
			rdbtnAdministrador = new JRadioButton("Administrador");
			rdbtnAdministrador.setActionCommand("ADM");
			rdbtnAdministrador.setBounds(101, 204, 133, 29);
			rdbtnAdministrador.addActionListener(listener);
			
		}
		return rdbtnAdministrador;
	}
	
	
	public JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(101, 243, 146, 26);
			txtSenha.setColumns(10);
		}
		return txtSenha;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Senha:");
			lblNewLabel_4.setBounds(15, 245, 69, 20);
		}
		return lblNewLabel_4;
	}
}
