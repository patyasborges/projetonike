package br.inatel.ec206.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class DeletaCalcadoView extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletaCalcadoView frame = new DeletaCalcadoView();
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
	public DeletaCalcadoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getTextField_6());
		contentPane.add(getTextField_7());
		contentPane.add(getTextField_8());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getLblNewLabel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(DeletaCalcadoView.class.getResource("/br/inatel/ec206/imagens/remocaoCalcados.png")));
			lblNewLabel.setBounds(0, 0, 840, 548);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(181, 142, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(181, 206, 113, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("");
			rdbtnNewRadioButton.setBounds(191, 244, 26, 23);
			
			rdbtnNewRadioButton.setOpaque(false);
			rdbtnNewRadioButton.setContentAreaFilled(false);
			rdbtnNewRadioButton.setBorderPainted(false);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("");
			rdbtnNewRadioButton_1.setBounds(255, 244, 26, 23);
			
			rdbtnNewRadioButton_1.setOpaque(false);
			rdbtnNewRadioButton_1.setContentAreaFilled(false);
			rdbtnNewRadioButton_1.setBorderPainted(false);
		}
		return rdbtnNewRadioButton_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(181, 286, 113, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(181, 317, 113, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(181, 317, 86, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(181, 317, 86, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(181, 358, 113, 20);
			textField_6.setColumns(10);
		}
		return textField_6;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(181, 402, 113, 20);
			textField_7.setColumns(10);
		}
		return textField_7;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setBounds(181, 440, 113, 20);
			textField_8.setColumns(10);
		}
		return textField_8;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(DeletaCalcadoView.class.getResource("/br/inatel/ec206/imagens/x.png")));
			btnNewButton.setBounds(23, 475, 83, 73);
			
			btnNewButton.setOpaque(false);
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setBorderPainted(false);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon(DeletaCalcadoView.class.getResource("/br/inatel/ec206/imagens/botao_add_laranja120.png")));
			btnNewButton_1.setBounds(153, 484, 153, 53);
			
			btnNewButton_1.setOpaque(false);
			btnNewButton_1.setContentAreaFilled(false);
			btnNewButton_1.setBorderPainted(false);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\r\n");
			btnNewButton_2.setIcon(new ImageIcon(DeletaCalcadoView.class.getResource("/br/inatel/ec206/imagens/pesquisar.png")));
			btnNewButton_2.setBounds(277, 112, 83, 80);
			
			btnNewButton_2.setOpaque(false);
			btnNewButton_2.setContentAreaFilled(false);
			btnNewButton_2.setBorderPainted(false);
		}
		return btnNewButton_2;
	}
}
