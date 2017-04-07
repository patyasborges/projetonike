package br.inatel.ec206.view;

import javax.swing.JFileChooser;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import br.inatel.ec206.model.Calcados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import java.awt.Image;

import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class CadastroCalcadoView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Descricao_calc_textField;
	private JTextField Genero_calc_textField;
	private JTextField Tipo_calc_textField;
	private JTextField Preco_calc_textField;
	private JTextField Tamanho_calc_textField;
	private JTextField Cor_calc_textField;
	private JLabel backgroundLabel;
	private JFileChooser uploadChooser;
	private final Action action = new SwingAction();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCalcadoView frame = new CadastroCalcadoView();
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
	public CadastroCalcadoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 584);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Descricao_calc_textField = new JTextField();
		Descricao_calc_textField.setBounds(156, 156, 130, 20);
		contentPane.add(Descricao_calc_textField);
		Descricao_calc_textField.setColumns(10);

		Genero_calc_textField = new JTextField();
		Genero_calc_textField.setBounds(156, 202, 130, 20);
		contentPane.add(Genero_calc_textField);
		Genero_calc_textField.setColumns(10);

		Tipo_calc_textField = new JTextField();
		Tipo_calc_textField.setBounds(156, 245, 130, 20);
		contentPane.add(Tipo_calc_textField);
		Tipo_calc_textField.setColumns(10);

		Preco_calc_textField = new JTextField();
		Preco_calc_textField.setBounds(156, 287, 130, 20);
		contentPane.add(Preco_calc_textField);
		Preco_calc_textField.setColumns(10);

		Tamanho_calc_textField = new JTextField();
		Tamanho_calc_textField.setBounds(156, 332, 130, 20);
		contentPane.add(Tamanho_calc_textField);
		Tamanho_calc_textField.setColumns(10);

		Cor_calc_textField = new JTextField();
		Cor_calc_textField.setBounds(156, 380, 130, 20);
		contentPane.add(Cor_calc_textField);
		Cor_calc_textField.setColumns(10);

		JButton CancelarButton = new JButton("");
		CancelarButton.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\x.png"));
		CancelarButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		CancelarButton.setBounds(35, 433, 68, 48);
		contentPane.add(CancelarButton);
		CancelarButton.setOpaque(false);
		CancelarButton.setContentAreaFilled(false);
		CancelarButton.setBorderPainted(false);
		uploadChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		uploadChooser.setFileFilter(filter);

		JButton jButtonOk = new JButton("");
		jButtonOk.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\botao_add_laranja120.png"));
		jButtonOk.setOpaque(false);
		jButtonOk.setContentAreaFilled(false);
		jButtonOk.setBorderPainted(false);
		
		jButtonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calcados calcado = new Calcados();
				// Acesso acessos = new Acesso();

				if ((Descricao_calc_textField.getText().isEmpty()) || (Genero_calc_textField.getText().isEmpty())
						|| (Tipo_calc_textField.getText().isEmpty()) || (Preco_calc_textField.getText().isEmpty())
						|| (Tamanho_calc_textField.getText().isEmpty()) || (Cor_calc_textField.getText().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
				} else {
					calcado.setDescricao_calc(Descricao_calc_textField.getText());
					calcado.setGenero_calc(Genero_calc_textField.getText());
					calcado.setTipo_calc(Tipo_calc_textField.getText());
					calcado.setPreco_calc(Double.parseDouble(Preco_calc_textField.getText()));// colocar
																								// tratamento
																								// de
																								// exceção
					calcado.setTamanho_calc(Integer.parseInt(Tamanho_calc_textField.getText()));// colocar
																								// tratamento
																								// de
					// exceção
					calcado.setCor_calc(Cor_calc_textField.getText());
				}
			}
			
		});
		jButtonOk.setBounds(133, 433, 153, 53);
		contentPane.add(jButtonOk);

		backgroundLabel = new JLabel("");
		backgroundLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		backgroundLabel.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\cadastro.png"));
		backgroundLabel.setBounds(0, 0, 784, 550);
		contentPane.add(backgroundLabel);

	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
