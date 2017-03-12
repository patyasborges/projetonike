package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class CadastroVestuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtPreco;
	private JTextField txtTamanho;
	private JTextField txtCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVestuarioView frame = new CadastroVestuarioView();
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
	public CadastroVestuarioView() {
		setTitle("Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descri\u00E7\u00E3o: ");
		lblNewLabel.setBounds(15, 54, 100, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Genero: ");
		lblNewLabel_1.setBounds(15, 107, 69, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setBounds(15, 163, 69, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pre\u00E7o:");
		lblNewLabel_3.setBounds(15, 218, 69, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tamanho:");
		lblNewLabel_4.setBounds(15, 281, 84, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cor:");
		lblNewLabel_5.setBounds(15, 344, 69, 20);
		contentPane.add(lblNewLabel_5);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(102, 51, 174, 26);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setBounds(15, 402, 69, 20);
		contentPane.add(lblMarca);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(83, 103, 107, 29);
		contentPane.add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(197, 103, 114, 29);
		contentPane.add(rdbtnMasculino);
		
		JComboBox cbbxTipoEsporte = new JComboBox();
		cbbxTipoEsporte.setBounds(83, 160, 193, 26);
		contentPane.add(cbbxTipoEsporte);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(102, 215, 174, 26);
		contentPane.add(txtPreco);
		
		txtTamanho = new JTextField();
		txtTamanho.setColumns(10);
		txtTamanho.setBounds(102, 278, 174, 26);
		contentPane.add(txtTamanho);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(102, 341, 174, 26);
		contentPane.add(txtCor);
		
		JComboBox cbbxMarca = new JComboBox();
		cbbxMarca.setBounds(83, 399, 193, 26);
		contentPane.add(cbbxMarca);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(377, 80, 156, 154);
		contentPane.add(lblImagem);
		
		JLabel label_1 = new JLabel("Imagem");
		label_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label_1.setBounds(413, 53, 86, 21);
		contentPane.add(label_1);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(410, 245, 89, 23);
		contentPane.add(btnUpload);
	}
}
