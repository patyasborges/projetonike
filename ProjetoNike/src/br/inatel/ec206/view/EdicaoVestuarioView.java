package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;

public class EdicaoVestuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtCor;
	private JTextField txtTamanho;
	private JTextField txtPreco;
	private JTextField txtDescricao;
	private JTextField txtPesquisar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoVestuarioView frame = new EdicaoVestuarioView();
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
	public EdicaoVestuarioView() {
		setTitle("Editar Vestuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(494, 410, 115, 65);
		contentPane.add(btnSair);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(336, 410, 114, 65);
		contentPane.add(btnEditar);
		
		JComboBox cbbxMarca = new JComboBox();
		cbbxMarca.setBounds(83, 452, 193, 26);
		contentPane.add(cbbxMarca);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(102, 394, 174, 26);
		contentPane.add(txtCor);
		
		txtTamanho = new JTextField();
		txtTamanho.setColumns(10);
		txtTamanho.setBounds(102, 331, 174, 26);
		contentPane.add(txtTamanho);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(102, 268, 174, 26);
		contentPane.add(txtPreco);
		
		JComboBox cbbxTipoEsporte = new JComboBox();
		cbbxTipoEsporte.setBounds(83, 213, 193, 26);
		contentPane.add(cbbxTipoEsporte);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(410, 298, 107, 38);
		contentPane.add(btnUpload);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setBackground(Color.WHITE);
		lblImagem.setBounds(377, 133, 156, 154);
		contentPane.add(lblImagem);
		
		JLabel label_1 = new JLabel("Imagem");
		label_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		label_1.setBounds(413, 106, 86, 21);
		contentPane.add(label_1);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(102, 104, 174, 26);
		contentPane.add(txtDescricao);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(197, 156, 114, 29);
		contentPane.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(83, 156, 107, 29);
		contentPane.add(rdbtnFeminino);
		
		JLabel label_2 = new JLabel("Descri\u00E7\u00E3o: ");
		label_2.setBounds(15, 107, 100, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Genero: ");
		label_3.setBounds(15, 160, 69, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tipo");
		label_4.setBounds(15, 216, 69, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Pre\u00E7o:");
		label_5.setBounds(15, 271, 69, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Tamanho:");
		label_6.setBounds(15, 334, 84, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Cor:");
		label_7.setBounds(15, 397, 69, 20);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Marca: ");
		label_8.setBounds(15, 455, 69, 20);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Descri\u00E7\u00E3o: ");
		label_9.setBounds(15, 39, 100, 20);
		contentPane.add(label_9);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setColumns(10);
		txtPesquisar.setBounds(102, 36, 319, 26);
		contentPane.add(txtPesquisar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(462, 35, 115, 29);
		contentPane.add(btnPesquisar);
	}

}
