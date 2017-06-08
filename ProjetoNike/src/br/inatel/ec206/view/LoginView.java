package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditArtigDesport;
import br.inatel.ec206.controller.ListenerLogin;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6236825665513062648L;
	private JPanel contentPane;
	private JTextField UsuarioTextField;
	private JTextField PasswordField;
	private JButton btnEntrar;
	private JRadioButton rdbtnCliente;
	private JRadioButton rdbtnAdm;
	
	ListenerLogin listener = ListenerLogin.getInstance(this);
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getUsuarioTextField());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnEntrar());
		contentPane.add(getRdbtnCliente());
		contentPane.add(getRdbtnAdm());
		contentPane.add(getLblNewLabel());
	}
	public JTextField getUsuarioTextField() {
		if (UsuarioTextField == null) {
			UsuarioTextField = new JTextField();
			UsuarioTextField.setBounds(149, 207, 247, 26);
			UsuarioTextField.setColumns(10);
		}
		return UsuarioTextField;
	}
	public JTextField getPasswordField() {
		if (PasswordField == null) {
			PasswordField = new JTextField();
			PasswordField.setBounds(149, 272, 247, 26);
			PasswordField.setColumns(10);
		}
		return PasswordField;
	}
	private JButton getBtnEntrar()
	{
		if (btnEntrar == null) {
			btnEntrar = new JButton("");
			btnEntrar.setIcon(new ImageIcon(LoginView.class.getResource("/br/inatel/ec206/imagens/entrar_login.png")));
			btnEntrar.setBounds(79, 422, 216, 83);
			btnEntrar.setActionCommand("ENTRAR");
			btnEntrar.addActionListener(listener);
			btnEntrar.setOpaque(false);
			btnEntrar.setContentAreaFilled(false);
			btnEntrar.setBorderPainted(false);
			
		}
		return btnEntrar;
	}
	public JRadioButton getRdbtnCliente() {
		if (rdbtnCliente == null) {
			rdbtnCliente = new JRadioButton("Cliente");
			rdbtnCliente.setBackground(Color.BLACK);
			rdbtnCliente.setForeground(Color.WHITE);
			rdbtnCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rdbtnCliente.setBounds(56, 352, 109, 27);
		}
		return rdbtnCliente;
	}
	public JRadioButton getRdbtnAdm() {
		if (rdbtnAdm == null) {
			rdbtnAdm = new JRadioButton("Administrador");
			rdbtnAdm.setBackground(Color.BLACK);
			rdbtnAdm.setForeground(Color.WHITE);
			rdbtnAdm.setFont(new Font("Tahoma", Font.PLAIN, 18));
			rdbtnAdm.setBounds(201, 352, 173, 27);
		}
		return rdbtnAdm;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/br/inatel/ec206/imagens/login.png")));
			lblNewLabel.setBounds(0, 0, 822, 550);
		}
		return lblNewLabel;
	}
}
