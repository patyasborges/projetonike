package br.inatel.ec206.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class widowExample extends JFrame {

	private static final long serialVersionUID = 2162490295361063212L;
	private JButton btnNewButton;
	private JTextField textField;
	
	public widowExample() {
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getTextField());
	}
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(28, 55, 115, 29);
		}
		return btnNewButton;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(38, 102, 146, 26);
			textField.setColumns(10);
		}
		return textField;
	}
}
