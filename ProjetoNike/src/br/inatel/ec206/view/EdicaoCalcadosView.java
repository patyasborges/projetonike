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
import javax.swing.JRadioButton;

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
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;


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
		descricaoCal.setBounds(166, 207, 130, 20);
		contentPane.add(descricaoCal);
		descricaoCal.setColumns(10);
		return descricaoCal;
	}

	public JTextField getGenero() {
		generoCal = new JTextField();
		generoCal.setBounds(166, 284, 130, 20);
		contentPane.add(generoCal);
		generoCal.setColumns(10);
		return generoCal;
	}

	public JTextField getTipo() {
		tipoCal = new JTextField();
		tipoCal.setBounds(166, 326, 130, 20);
		contentPane.add(tipoCal);
		tipoCal.setColumns(10);
		return tipoCal;
	}

	public JTextField getPreco() {
		precoCal = new JTextField();
		precoCal.setBounds(166, 357, 130, 20);
		contentPane.add(precoCal);
		precoCal.setColumns(10);

		return precoCal;
	}

	public JTextField getTamanho() {
		tamanhoCal = new JTextField();
		tamanhoCal.setBounds(166, 401, 130, 20);
		contentPane.add(tamanhoCal);
		tamanhoCal.setColumns(10);

		return tamanhoCal;
	}

	public JTextField getCor() {
		corCal = new JTextField();
		corCal.setBounds(166, 442, 130, 20);
		contentPane.add(corCal);
		corCal.setColumns(10);

		return corCal;
	}

	public JButton getOk() {
		JButton ok = new JButton("");
		ok.setBackground(new Color(0, 0, 0, 0));

		ok.setIcon(new ImageIcon(EdicaoCalcadosView.class.getResource("/br/inatel/ec206/imagens/botao_add_laranja120.png")));
		ok.setBounds(155, 473, 153, 53);
		contentPane.add(ok);
		ok.setOpaque(false);
		ok.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		return ok;
	}

	public JButton getcancelar() {
		cancelar = new JButton("");
		cancelar.setIcon(new ImageIcon(EdicaoCalcadosView.class.getResource("/br/inatel/ec206/imagens/x.png")));
		cancelar.setBounds(29, 473, 66, 53);
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
		pesquisar.setBounds(307, 127, 111, 78);
		contentPane.add(pesquisar);

		pesquisar.setOpaque(false);
		pesquisar.setContentAreaFilled(false);
		pesquisar.setBorderPainted(false);

		return pesquisar;
	}

	public JTextField getPesquisaCal() {
		pesquisaCal = new JTextField();
		pesquisaCal.setBounds(166, 141, 130, 20);
		contentPane.add(pesquisaCal);
		pesquisaCal.setColumns(10);
		return pesquisaCal;
	}

	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("");
			rdbtnNewRadioButton.setBounds(192, 247, 26, 23);

			rdbtnNewRadioButton.setOpaque(false);
			rdbtnNewRadioButton.setContentAreaFilled(false);
			rdbtnNewRadioButton.setBorderPainted(false);
		}
		return rdbtnNewRadioButton;
	}

	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("");
			rdbtnNewRadioButton_1.setBounds(257, 247, 26, 23);

			rdbtnNewRadioButton_1.setOpaque(false);
			rdbtnNewRadioButton_1.setContentAreaFilled(false);
			rdbtnNewRadioButton_1.setBorderPainted(false);
		}
		return rdbtnNewRadioButton_1;
	}

	public EdicaoCalcadosView() {
		setTitle("Editar Calcados");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 591);
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
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getRdbtnNewRadioButton_1());

		JLabel background = new JLabel("");
		background.setIcon(
				new ImageIcon(EdicaoCalcadosView.class.getResource("/br/inatel/ec206/imagens/edicaoCalcado.png")));
		background.setBounds(0, 0, 850, 550);
		contentPane.add(background);
		contentPane.repaint();
	}
}
