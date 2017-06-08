package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerAdministrador;
import br.inatel.ec206.controller.ListenerCliente;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class AdministradorView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5049292873739226958L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JMenuBar menuBar;
	private JMenu mnCadastro;
	private JMenu mnEdicao;
	private JMenu mnExcluir;
	private JMenuItem itemArtigo;
	private JMenuItem itemCalcados;
	private JMenuItem itemEsporte;
	private JMenuItem itemMarca;
	private JMenuItem itemUsuario;
	private JMenuItem itemVestuario;
	private JMenuItem itemEditArtigo;
	private JMenuItem itemEditCalcados;
	private JMenuItem itemEditEsporte;
	private JMenuItem itemEditMarca;
	private JMenuItem itemEditVest;
	private JMenuItem itemExcArtigos;
	private JMenuItem itemExcCalcados;
	private JMenuItem itemExcEsporte;
	private JMenuItem itemExcMarca;
	private JMenuItem itemExcUsuario;
	private JMenuItem itemExcVest;
	
	ListenerAdministrador listener = ListenerAdministrador.getInstance(this);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministradorView frame = new AdministradorView();
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
	public AdministradorView() {
		setTitle("Tela Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getMenuBar_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(AdministradorView.class.getResource("/br/inatel/ec206/imagens/NikeMenu.png")));
			lblNewLabel.setBounds(0, 30, 823, 386);
		}
		return lblNewLabel;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(Color.BLACK);
			menuBar.setBounds(0, 0, 823, 31);
			menuBar.add(getMnCadastro());
			menuBar.add(getMnEdicao());
			menuBar.add(getMnExcluir());
		}
		return menuBar;
	}
	private JMenu getMnCadastro() {
		if (mnCadastro == null) {
			mnCadastro = new JMenu("Cadastro");
			mnCadastro.setForeground(Color.WHITE);
			mnCadastro.setBackground(Color.BLACK);
			mnCadastro.add(getItemArtigo());
			mnCadastro.add(getItemCalcados());
			mnCadastro.add(getItemEsporte());
			mnCadastro.add(getItemMarca());
			mnCadastro.add(getItemUsuario());
			mnCadastro.add(getItemVestuario());
		}
		return mnCadastro;
	}
	private JMenu getMnEdicao() {
		if (mnEdicao == null) {
			mnEdicao = new JMenu("Edicao");
			mnEdicao.setBackground(Color.BLACK);
			mnEdicao.setForeground(Color.WHITE);
			mnEdicao.add(getItemEditArtigo());
			mnEdicao.add(getItemEditCalcados());
			mnEdicao.add(getItemEditEsporte());
			mnEdicao.add(getItemEditMarca());
			mnEdicao.add(getItemEditVest());
		}
		return mnEdicao;
	}
	private JMenu getMnExcluir() {
		if (mnExcluir == null) {
			mnExcluir = new JMenu("Deletar");
			mnExcluir.setBackground(Color.BLACK);
			mnExcluir.setForeground(Color.WHITE);
			mnExcluir.add(getItemExcArtigos());
			mnExcluir.add(getItemExcCalcados());
			mnExcluir.add(getItemExcEsporte());
			mnExcluir.add(getItemExcMarca());
			mnExcluir.add(getItemExcUsuario());
			mnExcluir.add(getItemExcVest());
		}
		return mnExcluir;
	}
	private JMenuItem getItemArtigo() {
		if (itemArtigo == null) {
			itemArtigo = new JMenuItem("Artigos Desportivos");
			itemArtigo.setForeground(Color.WHITE);
			itemArtigo.setBackground(Color.BLACK);
			itemArtigo.setActionCommand("CADARTIGO");
			itemArtigo.addActionListener(listener);
		}
		return itemArtigo;
	}
	private JMenuItem getItemCalcados() {
		if (itemCalcados == null) {
			itemCalcados = new JMenuItem("Calcados");
			itemCalcados.setForeground(Color.WHITE);
			itemCalcados.setBackground(Color.BLACK);
			itemCalcados.setActionCommand("CADCALCADO");
			itemCalcados.addActionListener(listener);
		}
		return itemCalcados;
	}
	private JMenuItem getItemEsporte() {
		if (itemEsporte == null) {
			itemEsporte = new JMenuItem("Esporte");
			itemEsporte.setForeground(Color.WHITE);
			itemEsporte.setBackground(Color.BLACK);
			itemEsporte.setActionCommand("CADESPORTE");
			itemEsporte.addActionListener(listener);
		}
		return itemEsporte;
	}
	private JMenuItem getItemMarca() {
		if (itemMarca == null) {
			itemMarca = new JMenuItem("Marca");
			itemMarca.setForeground(Color.WHITE);
			itemMarca.setBackground(Color.BLACK);
			itemMarca.setActionCommand("CADMARCA");
			itemMarca.addActionListener(listener);
		}
		return itemMarca;
	}
	private JMenuItem getItemUsuario() {
		if (itemUsuario == null) {
			itemUsuario = new JMenuItem("Usuario");
			itemUsuario.setForeground(Color.WHITE);
			itemUsuario.setBackground(Color.BLACK);
			itemUsuario.setActionCommand("CADUSUARIO");
			itemUsuario.addActionListener(listener);
		}
		return itemUsuario;
	}
	private JMenuItem getItemVestuario() {
		if (itemVestuario == null) {
			itemVestuario = new JMenuItem("Vestuario");
			itemVestuario.setForeground(Color.WHITE);
			itemVestuario.setBackground(Color.BLACK);
			itemVestuario.setActionCommand("CADVESTUARIO");
			itemVestuario.addActionListener(listener);
		}
		return itemVestuario;
	}
	private JMenuItem getItemEditArtigo() {
		if (itemEditArtigo == null) {
			itemEditArtigo = new JMenuItem("Artigos Desportivos");
			itemEditArtigo.setBackground(Color.BLACK);
			itemEditArtigo.setForeground(Color.WHITE);
			itemEditArtigo.setActionCommand("PESQARTIGO");
			itemEditArtigo.addActionListener(listener);
		}
		return itemEditArtigo;
	}
	private JMenuItem getItemEditCalcados() {
		if (itemEditCalcados == null) {
			itemEditCalcados = new JMenuItem("Calcados");
			itemEditCalcados.setBackground(Color.BLACK);
			itemEditCalcados.setForeground(Color.WHITE);
			itemEditCalcados.setActionCommand("PESQCALCADO");
			itemEditCalcados.addActionListener(listener);
		}
		return itemEditCalcados;
	}
	private JMenuItem getItemEditEsporte() {
		if (itemEditEsporte == null) {
			itemEditEsporte = new JMenuItem("Esportes");
			itemEditEsporte.setBackground(Color.BLACK);
			itemEditEsporte.setForeground(Color.WHITE);
			itemEditEsporte.setActionCommand("PESQESPORTE");
			itemEditEsporte.addActionListener(listener);
		}
		return itemEditEsporte;
	}
	private JMenuItem getItemEditMarca() {
		if (itemEditMarca == null) {
			itemEditMarca = new JMenuItem("Marcas");
			itemEditMarca.setBackground(Color.BLACK);
			itemEditMarca.setForeground(Color.WHITE);
			itemEditMarca.setActionCommand("PESQMARCA");
			itemEditMarca.addActionListener(listener);
		}
		return itemEditMarca;
	}
	private JMenuItem getItemEditVest() {
		if (itemEditVest == null) {
			itemEditVest = new JMenuItem("Vestuario");
			itemEditVest.setBackground(Color.BLACK);
			itemEditVest.setForeground(Color.WHITE);
			itemEditVest.setActionCommand("PESQVESTUARIO");
			itemEditVest.addActionListener(listener);
		}
		return itemEditVest;
	}
	private JMenuItem getItemExcArtigos() {
		if (itemExcArtigos == null) {
			itemExcArtigos = new JMenuItem("Artigos Desportivos");
			itemExcArtigos.setBackground(Color.BLACK);
			itemExcArtigos.setForeground(Color.WHITE);
			itemExcArtigos.setActionCommand("EXCARTIGOS");
			itemExcArtigos.addActionListener(listener);
		}
		return itemExcArtigos;
	}
	private JMenuItem getItemExcCalcados() {
		if (itemExcCalcados == null) {
			itemExcCalcados = new JMenuItem("Calcados");
			itemExcCalcados.setBackground(Color.BLACK);
			itemExcCalcados.setForeground(Color.WHITE);
			itemExcCalcados.setActionCommand("EXCCALCADO");
			itemExcCalcados.addActionListener(listener);
		}
		return itemExcCalcados;
	}
	private JMenuItem getItemExcEsporte() {
		if (itemExcEsporte == null) {
			itemExcEsporte = new JMenuItem("Esporte");
			itemExcEsporte.setBackground(Color.BLACK);
			itemExcEsporte.setForeground(Color.WHITE);
			itemExcEsporte.setActionCommand("EXCESPORTE");
			itemExcEsporte.addActionListener(listener);
		}
		return itemExcEsporte;
	}
	private JMenuItem getItemExcMarca() {
		if (itemExcMarca == null) {
			itemExcMarca = new JMenuItem("Marca");
			itemExcMarca.setBackground(Color.BLACK);
			itemExcMarca.setForeground(Color.WHITE);
			itemExcMarca.setActionCommand("EXCMARCA");
			itemExcMarca.addActionListener(listener);
		}
		return itemExcMarca;
	}
	private JMenuItem getItemExcUsuario() {
		if (itemExcUsuario == null) {
			itemExcUsuario = new JMenuItem("Usuario");
			itemExcUsuario.setBackground(Color.BLACK);
			itemExcUsuario.setForeground(Color.WHITE);
			itemExcUsuario.setActionCommand("EXCUSUARIO");
			itemExcUsuario.addActionListener(listener);
		}
		return itemExcUsuario;
	}
	private JMenuItem getItemExcVest() {
		if (itemExcVest == null) {
			itemExcVest = new JMenuItem("Vestuario");
			itemExcVest.setBackground(Color.BLACK);
			itemExcVest.setForeground(Color.WHITE);
			itemExcVest.setActionCommand("EXCVESTUARIO");
			itemExcVest.addActionListener(listener);
		}
		return itemExcVest;
	}
}
