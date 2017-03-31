package br.inatel.ec206.view;

import javax.swing.JFileChooser;
import java.io.File;
import java.awt.BorderLayout;
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
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class CadastroCalcadoView extends JFrame {

	private JPanel contentPane;
	private JTextField Descricao_calc_textField;
	private JTextField Genero_calc_textField;
	private JLabel lblNewLabel_3;
	private JTextField Tipo_calc_textField;
	private JLabel lblNewLabel;
	private JTextField Preco_calc_textField;
	private JLabel lblNewLabel_4;
	private JTextField Tamanho_calc_textField;
	private JLabel lblCor;
	private JTextField Cor_calc_textField;
	private JLabel backgroundLabel;
	private JLabel foto_calcadoLabel;
	private JButton upload_Button;
	private JFileChooser uploadChooser;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcadosView frame = new CalcadosView();
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_1.setBounds(39, 77, 75, 21);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_1);

		Descricao_calc_textField = new JTextField();
		Descricao_calc_textField.setBounds(119, 77, 130, 20);
		contentPane.add(Descricao_calc_textField);
		Descricao_calc_textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("G\u00EAnero");
		lblNewLabel_2.setBounds(39, 119, 75, 21);
		lblNewLabel_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2);

		Genero_calc_textField = new JTextField();
		Genero_calc_textField.setBounds(119, 120, 130, 20);
		contentPane.add(Genero_calc_textField);
		Genero_calc_textField.setColumns(10);

		lblNewLabel_3 = new JLabel("Tipo");
		lblNewLabel_3.setBounds(39, 161, 75, 21);
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_3);

		Tipo_calc_textField = new JTextField();
		Tipo_calc_textField.setBounds(119, 161, 130, 20);
		contentPane.add(Tipo_calc_textField);
		Tipo_calc_textField.setColumns(10);

		lblNewLabel = new JLabel("Pre\u00E7o");
		lblNewLabel.setBounds(39, 199, 44, 21);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);

		Preco_calc_textField = new JTextField();
		Preco_calc_textField.setBounds(119, 200, 130, 20);
		contentPane.add(Preco_calc_textField);
		Preco_calc_textField.setColumns(10);

		lblNewLabel_4 = new JLabel("Tamanho");
		lblNewLabel_4.setBounds(39, 237, 75, 21);
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_4);

		Tamanho_calc_textField = new JTextField();
		Tamanho_calc_textField.setBounds(119, 237, 130, 20);
		contentPane.add(Tamanho_calc_textField);
		Tamanho_calc_textField.setColumns(10);

		lblCor = new JLabel("Cor");
		lblCor.setBounds(39, 275, 26, 21);
		lblCor.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		contentPane.add(lblCor);

		Cor_calc_textField = new JTextField();
		Cor_calc_textField.setBounds(119, 275, 130, 20);
		contentPane.add(Cor_calc_textField);
		Cor_calc_textField.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Cal\u00E7ados");
		lblNewLabel_6.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 32));
		lblNewLabel_6.setBounds(39, 11, 156, 37);
		contentPane.add(lblNewLabel_6);

		JButton CancelarButton = new JButton("Cancelar");
		CancelarButton.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		CancelarButton.setBounds(164, 411, 99, 45);
		contentPane.add(CancelarButton);

		JLabel lblNewLabel_7 = new JLabel("Imagem");
		lblNewLabel_7.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(593, 24, 86, 21);
		contentPane.add(lblNewLabel_7);

		JPanel panelImagem = new JPanel();
		panelImagem.setBounds(557, 51, 156, 154);
		contentPane.add(panelImagem);
		panelImagem.setLayout(null);

		foto_calcadoLabel = new JLabel("");
		foto_calcadoLabel.setBounds(0, 0, 156, 154);
		panelImagem.add(foto_calcadoLabel);

		upload_Button = new JButton("Upload");
		uploadChooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		uploadChooser.setFileFilter(filter);

		upload_Button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal = uploadChooser.showOpenDialog(upload_Button.getParent());
				if (returnVal == JFileChooser.APPROVE_OPTION) {

					// ImageIcon imageIcon = new
					// ImageIcon(uploadChooser.getSelectedFile().getAbsolutePath()).getImage().getScaledInstance(20,
					// 20, Image.SCALE_DEFAULT)));
					// label.setIcon(imageIcon);
					foto_calcadoLabel.setIcon(new ImageIcon(uploadChooser.getSelectedFile().getAbsolutePath()));
					foto_calcadoLabel.repaint();
				}

			}

		});

		upload_Button.setBounds(590, 216, 89, 23);
		contentPane.add(upload_Button);

		JButton jButtonOk = new JButton("OK");
		jButtonOk.setAction(action);
		jButtonOk.setBounds(42, 418, 89, 37);
		contentPane.add(jButtonOk);

		backgroundLabel = new JLabel("");
		backgroundLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		backgroundLabel.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\Ec206_projeto\\Nike_Footwear_800_.png"));
		backgroundLabel.setBounds(0, 0, 784, 561);
		contentPane.add(backgroundLabel);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {

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

	private void Descricao_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Genero_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Tipo_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Preco_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Tamanho_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

	private void Cor_calc_textFieldActionPerformed(java.awt.event.ActionEvent evt) {
	}

}
