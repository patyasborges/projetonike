package br.inatel.ec206.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import br.inatel.ec206.controller.ListenerCadCalcado;

import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class CadastroCalcadosView extends JFrame {

	private static final long serialVersionUID = 1L;

	ListenerCadCalcado listener = ListenerCadCalcado.getInstance(this);

	private JTextField descricaoCal;
	private JComboBox<String> EsporteCal;
	private JComboBox<String> MarcaCal;
	private JTextField precoCal;
	private JTextField tamanhoCal;
	private JTextField corCal;

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
			
			descricaoCal.setColumns(10);
		}

		return descricaoCal;
	}

	public JComboBox<String> getEsporteCal() {
		if (EsporteCal == null) {
			EsporteCal = new JComboBox<String>();
			EsporteCal.setBounds(169, 247, 113, 20);
			
			EsporteCal.addItem("");
			EsporteCal.addItem("Futebol");
			EsporteCal.addItem("Basquete");
			EsporteCal.addItem("Volei");
		}
		return EsporteCal;
	}

	public JComboBox<String> getMarcaCal() {
		if (MarcaCal == null) {
			MarcaCal = new JComboBox<String>();
			MarcaCal.setBounds(169, 412, 113, 20);
			MarcaCal.addItem("");
			MarcaCal.addItem("Nike +");
			MarcaCal.addItem("Jordan");
			MarcaCal.addItem("Outra");
		}
		return MarcaCal;
	}

	public JTextField getPreco() {
		if (precoCal == null) {
			precoCal = new JTextField();
			precoCal.setBounds(169, 286, 113, 20);
			
			precoCal.setColumns(10);
		}
		return precoCal;
	}

	public JTextField getTamanho() {
		if (tamanhoCal == null) {
			tamanhoCal = new JTextField();
			tamanhoCal.setBounds(169, 333, 113, 20);
			
			tamanhoCal.setColumns(10);
		}
		return tamanhoCal;
	}

	public JTextField getCor() {
		if (corCal == null) {
			corCal = new JTextField();
			corCal.setBounds(169, 373, 113, 20);
			
			corCal.setColumns(10);
		}
		return corCal;
	}

	public JButton getOk() {
		JButton ok = new JButton("");
		ok.setIcon(new ImageIcon(CadastroCalcadosView.class.getResource("/br/inatel/ec206/imagens/botao_add_laranja120.png")));
		ok.setBounds(138, 443, 153, 53);
		

		ok.setOpaque(false);
		ok.setContentAreaFilled(false);
		ok.setBorderPainted(false);

		ok.setActionCommand("CADASTRAR");
		ok.addActionListener(listener);

		return ok;
	}

	public JButton getcancelar() {
		JButton cancelar = new JButton("");
		cancelar.setIcon(new ImageIcon(CadastroCalcadosView.class.getResource("/br/inatel/ec206/imagens/x.png")));
		cancelar.setBounds(22, 456, 89, 40);
		
		cancelar.setOpaque(false);
		cancelar.setContentAreaFilled(false);
		cancelar.setBorderPainted(false);

		cancelar.setActionCommand("CANCELAR");
		cancelar.addActionListener(listener);

		return cancelar;
	}

	public JRadioButton getFemRadioButton() {
		JRadioButton FemRadioButton = new JRadioButton("");
		FemRadioButton.setBounds(193, 198, 29, 23);

		FemRadioButton.setOpaque(false);
		FemRadioButton.setContentAreaFilled(false);
		FemRadioButton.setBorderPainted(false);
		return FemRadioButton;
	}

	public JRadioButton getMasclRadioButton() {
		JRadioButton MasclRadioButton = new JRadioButton("");
		MasclRadioButton.setBounds(260, 198, 31, 23);

		MasclRadioButton.setOpaque(false);
		MasclRadioButton.setContentAreaFilled(false);
		MasclRadioButton.setBorderPainted(false);

		return MasclRadioButton;
	}

	public CadastroCalcadosView() {
		setTitle("Cadastro de Calcados");

		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 0, 784, 545);

		contentPane.setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 584);

		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);

		contentPane.add(getDescricao());
		contentPane.add(getEsporteCal());
		contentPane.add(getPreco());
		contentPane.add(getTamanho());
		contentPane.add(getCor());
		contentPane.add(getOk());
		contentPane.add(getcancelar());
		contentPane.add(getMasclRadioButton());
		contentPane.add(getFemRadioButton());
		contentPane.add(getMarcaCal());

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastroCalcadosView.class.getResource("/br/inatel/ec206/imagens/cadastroCalcado.png")));
		lblNewLabel.setBounds(0, 0, 784, 545);
		contentPane.add(lblNewLabel);

		contentPane.repaint();
	}
}
