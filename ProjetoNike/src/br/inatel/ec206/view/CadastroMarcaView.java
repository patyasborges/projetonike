package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadMarca;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class CadastroMarcaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4670519714230978814L;
	private JPanel contentPane;
	private JTextField txtMarca;
	private JButton btnCadastrar;
	private JButton btnSair;

	ListenerCadMarca listener = ListenerCadMarca.getInstance(this);
	private JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroMarcaView frame = new CadastroMarcaView();
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
	public CadastroMarcaView() {
		setTitle("Cadastro Marcas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtMarca());
		contentPane.add(getBtnCadastrar());
		contentPane.add(getBtnSair());
		contentPane.add(getLblNewLabel_1());
	}
	public JTextField getTxtMarca() {
		if (txtMarca == null) {
			txtMarca = new JTextField();
			txtMarca.setBounds(139, 170, 330, 26);
			txtMarca.setColumns(10);
		}
		return txtMarca;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setActionCommand("CADASTRAR");
			btnCadastrar.setBounds(114, 313, 115, 29);
			btnCadastrar.addActionListener(listener);
		}
		return btnCadastrar;
	}
	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton("Sair");
			btnSair.setActionCommand("SAIR");
			btnSair.setBounds(306, 313, 115, 29);
			btnSair.addActionListener(listener);
		}
		return btnSair;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(CadastroMarcaView.class.getResource("/br/inatel/ec206/imagens/cadastroMarca.png")));
			lblNewLabel_1.setBounds(0, 0, 845, 547);
		}
		return lblNewLabel_1;
	}
}
