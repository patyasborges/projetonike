package br.inatel.ec206.view;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerEditCalcado;

public class EdicaoCalcadosView extends JFrame {
	
	ListenerEditCalcado listener = ListenerEditCalcado.getInstance(this);

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField descricaoCal;
	private JTextField generoCal;
	private JTextField tipoCal;
	private JTextField precoCal;
	private JTextField tamanhoCal;
	private JTextField corCal;

	private JButton cancelar;
	private JTextField pesquisaCal;
	private JButton pesquisar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EdicaoCalcadosView frame = new EdicaoCalcadosView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getDescricao() {
		descricaoCal = new JTextField();
		descricaoCal.setBounds(155, 156, 130, 20);
		contentPane.add(descricaoCal);
		descricaoCal.setColumns(10);
		return descricaoCal;
	}

	public JTextField getGenero() {
		generoCal = new JTextField();
		generoCal.setBounds(155, 202, 130, 20);
		contentPane.add(generoCal);
		generoCal.setColumns(10);
		return generoCal;
	}

	public JTextField getTipo() {
		tipoCal = new JTextField();
		tipoCal.setBounds(155, 249, 130, 20);
		contentPane.add(tipoCal);
		tipoCal.setColumns(10);
		return tipoCal;
	}

	public JTextField getPreco() {
		precoCal = new JTextField();
		precoCal.setBounds(155, 287, 130, 20);
		contentPane.add(precoCal);
		precoCal.setColumns(10);

		return precoCal;
	}

	public JTextField getTamanho() {
		tamanhoCal = new JTextField();
		tamanhoCal.setBounds(155, 330, 130, 20);
		contentPane.add(tamanhoCal);
		tamanhoCal.setColumns(10);

		return tamanhoCal;
	}

	public JTextField getCor() {
		corCal = new JTextField();
		corCal.setBounds(155, 377, 130, 20);
		contentPane.add(corCal);
		corCal.setColumns(10);

		return corCal;
	}

	public JButton getOk() {
		JButton ok = new JButton("");
		ok.setBackground(new Color(0, 0, 0, 0));

		ok.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\botao_add_laranja120.png"));
		ok.setBounds(132, 463, 153, 53);
		contentPane.add(ok);
		ok.setOpaque(false);
		ok.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		return ok;
	}

	public JButton getcancelar() {
		cancelar = new JButton("");
		cancelar.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\x.png"));
		cancelar.setBounds(21, 463, 66, 53);
		cancelar.setOpaque(false);
		cancelar.setContentAreaFilled(false);
		cancelar.setBorderPainted(false);

		cancelar.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(cancelar);
		return cancelar;
	}

	public JButton getpesquisar() {
		pesquisar = new JButton("");
		pesquisar.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\pesquisar.png"));
		pesquisar.setBounds(638, 157, 111, 78);
		contentPane.add(pesquisar);

		pesquisar.setOpaque(false);
		pesquisar.setContentAreaFilled(false);
		pesquisar.setBorderPainted(false);

		return pesquisar;
	}

	public JTextField getPesquisaCal() {
		pesquisaCal = new JTextField();
		pesquisaCal.setBounds(628, 132, 135, 20);
		contentPane.add(pesquisaCal);
		pesquisaCal.setColumns(10);
		return pesquisaCal;
	}

	public EdicaoCalcadosView() {

		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contentPane.add(getDescricao());
		contentPane.add(getGenero());
		contentPane.add(getTipo());
		contentPane.add(getPreco());
		contentPane.add(getTamanho());
		contentPane.add(getCor());
		contentPane.add(getOk());
		contentPane.add(getcancelar());
		contentPane.add(getpesquisar());
		contentPane.add(getPesquisaCal());

		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\edicao.png"));
		background.setBounds(0, 0, 840, 550);
		contentPane.add(background);
		contentPane.repaint();
	}
}
