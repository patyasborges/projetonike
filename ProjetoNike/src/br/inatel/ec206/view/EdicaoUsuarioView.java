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

public class EdicaoUsuarioView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3622373046369348333L;
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
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
	private JLabel lblNewLabel_5;
	
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
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
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
		contentPane.add(getLblNewLabel_5());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setBounds(15, 16, 69, 20);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Nome:");
			lblNewLabel_1.setBounds(15, 71, 69, 20);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Data de Nascimento:");
			lblNewLabel_2.setBounds(15, 110, 152, 20);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("E-mail:");
			lblNewLabel_3.setBounds(15, 146, 69, 20);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Tipo:");
			lblNewLabel_4.setBounds(15, 182, 69, 20);
		}
		return lblNewLabel_4;
	}
	public JTextField getTxtPesquisar() {
		if (txtPesquisar == null) {
			txtPesquisar = new JTextField();
			txtPesquisar.setBounds(80, 13, 176, 26);
			txtPesquisar.setColumns(10);
		}
		return txtPesquisar;
	}
	public JTextField getTxtNome() {
		if (txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(99, 68, 146, 26);
			txtNome.setColumns(10);
		}
		return txtNome;
	}
	public JTextField getTxtDataNascimento() {
		if (txtDataNascimento == null) {
			txtDataNascimento = new JTextField();
			txtDataNascimento.setBounds(167, 107, 78, 26);
			txtDataNascimento.setColumns(10);
		}
		return txtDataNascimento;
	}
	public JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setBounds(99, 143, 146, 26);
			txtEmail.setColumns(10);
		}
		return txtEmail;
	}
	public JRadioButton getRdbtnCliente() {
		if (rdbtnCliente == null) {
			rdbtnCliente = new JRadioButton("Cliente");
			rdbtnCliente.setBounds(15, 203, 90, 29);
		}
		return rdbtnCliente;
	}
	public JRadioButton getRdbtnAdministrador() {
		if (rdbtnAdministrador == null) {
			rdbtnAdministrador = new JRadioButton("Administrador");
			rdbtnAdministrador.setBounds(110, 203, 155, 29);
		}
		return rdbtnAdministrador;
	}
	private JButton getBtnPesquisar() {
		if (btnPesquisar == null) {
			btnPesquisar = new JButton("Pesquisar");
			btnPesquisar.setActionCommand("PESQUISAR");
			btnPesquisar.setBounds(271, 12, 115, 29);
			btnPesquisar.addActionListener(listener);
		}
		return btnPesquisar;
	}
	private JButton getBtnEditar() {
		if (btnEditar == null) {
			btnEditar = new JButton("Editar");
			btnEditar.setActionCommand("EDITAR");
			btnEditar.setBounds(286, 89, 115, 29);
			btnEditar.addActionListener(listener);
		}
		return btnEditar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(286, 142, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	public JTextField getTxtSenha() {
		if (txtSenha == null) {
			txtSenha = new JTextField();
			txtSenha.setBounds(99, 248, 146, 26);
			txtSenha.setColumns(10);
		}
		return txtSenha;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Senha:");
			lblNewLabel_5.setBounds(15, 251, 69, 20);
		}
		return lblNewLabel_5;
	}
}
