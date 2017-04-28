package br.inatel.ec206.view;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
	private JComboBox<String> EsporteCal;
	private JComboBox<String> MarcaCal;
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
		descricaoCal.setBounds(166, 207, 130, 20);
		contentPane.add(descricaoCal);
		descricaoCal.setColumns(10);
		return descricaoCal;
	}

	public JRadioButton getFemRadioButton() {
		JRadioButton FemRadioButton = new JRadioButton("");
		FemRadioButton.setBounds(192, 247, 21, 23);

		FemRadioButton.setOpaque(false);
		FemRadioButton.setContentAreaFilled(false);
		FemRadioButton.setBorderPainted(false);
		return FemRadioButton;
	}

	public JRadioButton getMasclRadioButton() {
		JRadioButton MasclRadioButton = new JRadioButton("");
		MasclRadioButton.setBounds(259, 247, 22, 23);

		MasclRadioButton.setOpaque(false);
		MasclRadioButton.setContentAreaFilled(false);
		MasclRadioButton.setBorderPainted(false);

		return MasclRadioButton;
	}

	public JComboBox<String> getEsporteCal() {
		if (EsporteCal == null) {
			EsporteCal = new JComboBox<String>();
			EsporteCal.setBounds(166, 277, 130, 20);
			
			EsporteCal.addItem("");
			EsporteCal.addItem("Futebol");
			EsporteCal.addItem("Basquete");
			EsporteCal.addItem("Volei");
		}
		return EsporteCal;
	}

	public JTextField getPreco() {
		precoCal = new JTextField();
		precoCal.setBounds(166, 319, 130, 20);
		contentPane.add(precoCal);
		precoCal.setColumns(10);

		return precoCal;
	}

	public JTextField getTamanho() {
		tamanhoCal = new JTextField();
		tamanhoCal.setBounds(166, 359, 130, 20);
		contentPane.add(tamanhoCal);
		tamanhoCal.setColumns(10);

		return tamanhoCal;
	}

	public JTextField getCor() {
		corCal = new JTextField();
		corCal.setBounds(166, 396, 130, 20);
		contentPane.add(corCal);
		corCal.setColumns(10);

		return corCal;
	}
	public JComboBox<String> getMarcaCal() {
		if (MarcaCal == null) {
			MarcaCal = new JComboBox<String>();
			MarcaCal.setBounds(166, 442, 130, 20);
			MarcaCal.addItem("");
			MarcaCal.addItem("Nike +");
			MarcaCal.addItem("Jordan");
			MarcaCal.addItem("Outra");
		}
		return MarcaCal;
	}

	public JButton getOk() {
		JButton ok = new JButton("");
		ok.setBackground(new Color(0, 0, 0, 0));

		ok.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\botao_add_laranja120.png"));
		ok.setBounds(155, 473, 153, 53);
		contentPane.add(ok);
		ok.setOpaque(false);
		ok.setContentAreaFilled(false);
		ok.setBorderPainted(false);
		

		ok.setActionCommand("EDITAR");
		ok.addActionListener(listener);
		return ok;
	}

	public JButton getcancelar() {
		cancelar = new JButton("");
		cancelar.setIcon(new ImageIcon("C:\\Users\\patricia\\Desktop\\imagens_trabalho\\x.png"));
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
		
		pesquisar.setActionCommand("PESQUISAR");
		pesquisar.addActionListener(listener);

		return pesquisar;
	}

	public JTextField getPesquisaCal() {
		pesquisaCal = new JTextField();
		pesquisaCal.setBounds(166, 141, 130, 20);
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
		contentPane.add(getEsporteCal());
		contentPane.add(getPreco());
		contentPane.add(getTamanho());
		contentPane.add(getCor());
		contentPane.add(getMarcaCal());
		contentPane.add(getOk());
		contentPane.add(getcancelar());
		contentPane.add(getpesquisar());
		contentPane.add(getPesquisaCal());
		contentPane.add(getFemRadioButton());
		contentPane.add(getMasclRadioButton());

		JLabel background = new JLabel("");
		background.setIcon(
				new ImageIcon(EdicaoCalcadosView.class.getResource("/br/inatel/ec206/imagens/edicaoCalcado.png")));
		background.setBounds(0, 0, 850, 550);
		contentPane.add(background);
		contentPane.repaint();
	}
}
