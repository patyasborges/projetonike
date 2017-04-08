package br.inatel.ec206.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadCalcado;

import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CadastroCalcadosView extends JFrame {

	private static final long serialVersionUID = 1L;

	ListenerCadCalcado listener = ListenerCadCalcado.getInstance(this);

	private JTextField descricaoCal;
	private JTextField generoCal;
	private JTextField tipoCal;
	private JTextField precoCal;
	private JTextField tamanhoCal;
	private JTextField corCal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCalcadosView frame = new CadastroCalcadosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getDescricao() {
		if (descricaoCal == null) {
			descricaoCal = new JTextField();
			descricaoCal.setBounds(169, 153, 113, 20);
			// contentPane.add(descricaoCal);
			descricaoCal.setColumns(10);
		}

		return descricaoCal;
	}

	public JTextField getGenero() {
		if (generoCal == null) {
			generoCal = new JTextField();
			generoCal.setBounds(169, 198, 113, 20);
			// contentPane.add(generoCal);
			generoCal.setColumns(10);
		}
		return generoCal;
	}

	public JTextField getTipo() {
		if (tipoCal == null) {
			tipoCal = new JTextField();
			tipoCal.setBounds(169, 247, 113, 20);
			// contentPane.add(tipoCal);
			tipoCal.setColumns(10);
		}
		return tipoCal;
	}

	public JTextField getPreco() {
		if (precoCal == null) {
			precoCal = new JTextField();
			precoCal.setBounds(169, 292, 113, 20);
			// contentPane.add(precoCal);
			precoCal.setColumns(10);
		}
		return precoCal;
	}

	public JTextField getTamanho() {
		if (tamanhoCal == null) {
			tamanhoCal = new JTextField();
			tamanhoCal.setBounds(169, 333, 113, 20);
			// contentPane.add(tamanhoCal);
			tamanhoCal.setColumns(10);
		}
		return tamanhoCal;
	}

	public JTextField getCor() {
		if (corCal == null) {
			corCal = new JTextField();
			corCal.setBounds(169, 373, 113, 20);
			// contentPane.add(corCal);
			corCal.setColumns(10);
		}
		return corCal;
	}

	public JButton getOk() {
		JButton ok = new JButton("");
		ok.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\botao_add_laranja120.png"));
		ok.setBounds(138, 443, 153, 53);
		// contentPane.add(ok);

		ok.setOpaque(false);
		ok.setContentAreaFilled(false);
		ok.setBorderPainted(false);

		ok.setActionCommand("CADASTRAR");
		ok.addActionListener(listener);

		return ok;
	}

	public JButton getcancelar() {
		JButton cancelar = new JButton("");
		cancelar.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\x.png"));
		cancelar.setBounds(22, 456, 89, 40);
		// contentPane.add(cancelar);
		cancelar.setOpaque(false);
		cancelar.setContentAreaFilled(false);
		cancelar.setBorderPainted(false);

		cancelar.setActionCommand("CANCELAR");
		cancelar.addActionListener(listener);

		return cancelar;
	}

	public CadastroCalcadosView() {

		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 0, 784, 545);
		getContentPane().add(contentPane);
		contentPane.setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 584);

		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		contentPane.add(getDescricao());
		contentPane.add(getGenero());
		contentPane.add(getTipo());
		contentPane.add(getPreco());
		contentPane.add(getTamanho());
		contentPane.add(getCor());
		contentPane.add(getOk());
		contentPane.add(getcancelar());

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\cadastro.png"));
		lblNewLabel.setBounds(0, 0, 784, 545);
		contentPane.add(lblNewLabel);

		contentPane.repaint();
	}

}
