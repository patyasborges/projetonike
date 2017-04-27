package br.inatel.ec206.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerLogin;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame  {

	private static final long serialVersionUID = 1L;
	
	ListenerLogin  listener = ListenerLogin.getInstance(this);
	
	private JPanel contentPane;
	private JTextField UsuariotextField;
	private JPasswordField passwordField;

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
	public JButton getSair() {
		JButton sairButton = new JButton("");
		sairButton.setIcon(new ImageIcon(LoginView.class.getResource("/br/inatel/ec206/imagens/botaoXlogin.png")));
		sairButton.setBounds(42, 375, 133, 89);
		contentPane.add(sairButton);
		sairButton.setOpaque(false);
		sairButton.setContentAreaFilled(false);
		sairButton.setBorderPainted(false);
		sairButton.setActionCommand("SAIR");

		return sairButton;
	}

	public JTextField getUsuariotextField() {
		if (UsuariotextField == null) {
			UsuariotextField = new JTextField();
			UsuariotextField.setBounds(143, 204, 151, 20);
			contentPane.add(UsuariotextField);
			UsuariotextField.setColumns(10);
		}
		return UsuariotextField;
	}
	public JButton getEntrarButton(){
		JButton entrarButton = new JButton("");
		entrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		entrarButton.setIcon(new ImageIcon(LoginView.class.getResource("/br/inatel/ec206/imagens/entrar_login.png")));
		entrarButton.setBounds(234, 380, 198, 84);
		contentPane.add(entrarButton);
		entrarButton.setOpaque(false);
		entrarButton.setContentAreaFilled(false);
		entrarButton.setBorderPainted(false);
		entrarButton.setActionCommand("ENTRAR");
		
		return entrarButton;
	}
	public JPasswordField getPasswordField(){
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 272, 151, 20);
		contentPane.add(passwordField);
		return passwordField;
	}

	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(getSair());
		contentPane.add(getUsuariotextField());
		contentPane.add(getEntrarButton());
		contentPane.add(getPasswordField());	

		

		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setIcon(new ImageIcon(LoginView.class.getResource("/br/inatel/ec206/imagens/login.png")));
		backgroundLabel.setBounds(0, 0, 834, 540);
		contentPane.add(backgroundLabel);
	}
}