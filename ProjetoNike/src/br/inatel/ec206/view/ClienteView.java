package br.inatel.ec206.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCliente;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ClienteView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4588969551860868011L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnPesquisar;
	private JMenu mnEditar;
	private JMenuItem mnItemArtigos;
	private JMenuItem mnItemCalcado;
	private JMenuItem mnItemEsporte;
	private JMenuItem mnItemMarca;
	private JMenuItem mnItemVestuario;
	private JMenuItem mnItemUsuario;
	private JLabel lblNewLabel;
	
	ListenerCliente listener = ListenerCliente.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
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
	public ClienteView() {
		setTitle("Tela Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
		contentPane.add(getLblNewLabel());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(Color.BLACK);
			menuBar.setBounds(0, 0, 837, 31);
			menuBar.add(getMnPesquisar());
			menuBar.add(getMnEditar());
		}
		return menuBar;
	}
	private JMenu getMnPesquisar() {
		if (mnPesquisar == null) {
			mnPesquisar = new JMenu("Pesquisar");
			mnPesquisar.setForeground(Color.WHITE);
			mnPesquisar.setBackground(Color.BLACK);
			mnPesquisar.add(getMnItemArtigos());
			mnPesquisar.add(getMnItemCalcado());
			mnPesquisar.add(getMnItemEsporte());
			mnPesquisar.add(getMnItemMarca());
			mnPesquisar.add(getMnItemVestuario());
		}
		return mnPesquisar;
	}
	private JMenu getMnEditar() {
		if (mnEditar == null) {
			mnEditar = new JMenu("Editar");
			mnEditar.setBackground(Color.BLACK);
			mnEditar.setForeground(Color.WHITE);
			mnEditar.add(getMnItemUsuario());
		}
		return mnEditar;
	}
	private JMenuItem getMnItemArtigos() {
		if (mnItemArtigos == null) {
			mnItemArtigos = new JMenuItem("Artigos Desportivos");
			mnItemArtigos.setBackground(Color.BLACK);
			mnItemArtigos.setForeground(Color.WHITE);
			mnItemArtigos.setActionCommand("PESQARTIGO");
			mnItemArtigos.addActionListener(listener);
		}
		return mnItemArtigos;
	}
	private JMenuItem getMnItemCalcado() {
		if (mnItemCalcado == null) {
			mnItemCalcado = new JMenuItem("Calcados");
			mnItemCalcado.setBackground(Color.BLACK);
			mnItemCalcado.setForeground(Color.WHITE);
			mnItemCalcado.setActionCommand("PESQCALCADO");
			mnItemCalcado.addActionListener(listener);
		}
		return mnItemCalcado;
	}
	private JMenuItem getMnItemEsporte() {
		if (mnItemEsporte == null) {
			mnItemEsporte = new JMenuItem("Esporte");
			mnItemEsporte.setBackground(Color.BLACK);
			mnItemEsporte.setForeground(Color.WHITE);
			mnItemEsporte.setActionCommand("PESQESPORTE");
			mnItemEsporte.addActionListener(listener);
		}
		return mnItemEsporte;
	}
	private JMenuItem getMnItemMarca() {
		if (mnItemMarca == null) {
			mnItemMarca = new JMenuItem("Marca");
			mnItemMarca.setBackground(Color.BLACK);
			mnItemMarca.setForeground(Color.WHITE);
			mnItemMarca.setActionCommand("PESQMARCA");
			mnItemMarca.addActionListener(listener);
		}
		
		return mnItemMarca;
	}
	private JMenuItem getMnItemVestuario() {
		if (mnItemVestuario == null) {
			mnItemVestuario = new JMenuItem("Vestuario");
			mnItemVestuario.setBackground(Color.BLACK);
			mnItemVestuario.setForeground(Color.WHITE);
			mnItemVestuario.setActionCommand("PESQVESTUARIO");
			mnItemVestuario.addActionListener(listener);
		}
		return mnItemVestuario;
	}
	private JMenuItem getMnItemUsuario() {
		if (mnItemUsuario == null) {
			mnItemUsuario = new JMenuItem("Dados");
			mnItemUsuario.setForeground(Color.WHITE);
			mnItemUsuario.setBackground(Color.BLACK);
			mnItemUsuario.setActionCommand("EDITAR");
			mnItemUsuario.addActionListener(listener);
		}
		return mnItemUsuario;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(ClienteView.class.getResource("/br/inatel/ec206/imagens/NikeMenu.png")));
			lblNewLabel.setBounds(0, 29, 837, 333);
		}
		return lblNewLabel;
	}
}
