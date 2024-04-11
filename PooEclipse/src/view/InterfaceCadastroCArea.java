package view;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classesPrincipais.CompanhiaAerea;
import classesPrincipais.Data;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCadastroCArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enderecoLabel;
	private JTextField nomeOfcLabel;
	private JTextField nomeDivLabel;
	private JTextField cnpjLabel;
	private JTextField diaLabel;
	private JTextField mesLabel;
	private JTextField anoLabel;

	int retorno;
	private CompanhiaAerea ca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastroCArea frame = new InterfaceCadastroCArea();
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
	public InterfaceCadastroCArea() {
		setTitle("Dados do Hotel");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dados da Compania Area:");
		lblNewLabel.setBounds(10, 11, 234, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Endereço:");
		lblNewLabel_1.setBounds(16, 48, 70, 14);
		contentPane.add(lblNewLabel_1);

		enderecoLabel = new JTextField();
		enderecoLabel.setBounds(77, 45, 344, 20);
		contentPane.add(enderecoLabel);
		enderecoLabel.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel(" Nome Oficial:");
		lblNewLabel_9.setBounds(13, 78, 85, 14);
		contentPane.add(lblNewLabel_9);

		nomeOfcLabel = new JTextField();
		nomeOfcLabel.setBounds(108, 76, 136, 20);
		contentPane.add(nomeOfcLabel);
		nomeOfcLabel.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("Nome Divulgação:");
		lblNewLabel_10.setBounds(262, 78, 111, 14);
		contentPane.add(lblNewLabel_10);

		nomeDivLabel = new JTextField();
		nomeDivLabel.setBounds(383, 76, 141, 20);
		contentPane.add(nomeDivLabel);
		nomeDivLabel.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("CNPJ:");
		lblNewLabel_11.setBounds(431, 48, 46, 14);
		contentPane.add(lblNewLabel_11);

		cnpjLabel = new JTextField();
		cnpjLabel.setBounds(469, 45, 160, 20);
		contentPane.add(cnpjLabel);
		cnpjLabel.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("Data de Criação:");
		lblNewLabel_12.setBounds(13, 112, 95, 14);
		contentPane.add(lblNewLabel_12);

		diaLabel = new JTextField();
		diaLabel.setBounds(118, 107, 33, 20);
		contentPane.add(diaLabel);
		diaLabel.setColumns(10);

		mesLabel = new JTextField();
		mesLabel.setBounds(161, 107, 33, 20);
		contentPane.add(mesLabel);
		mesLabel.setColumns(10);

		anoLabel = new JTextField();
		anoLabel.setBounds(204, 107, 33, 20);
		contentPane.add(anoLabel);
		anoLabel.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(155, 110, 21, 14);
		contentPane.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(198, 110, 21, 14);
		contentPane.add(lblNewLabel_14);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca = obterCA();
				if (ca != null) {
					setCA(ca);
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					retorno = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Erro!");
					retorno = 2;
				}
				dispose();
			}
		});
		btnNewButton.setBounds(556, 158, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retorno = 3;
				dispose();
			}
		});
		btnNewButton_1.setBounds(445, 158, 89, 23);
		contentPane.add(btnNewButton_1);
	}

	public CompanhiaAerea retornaCA() {
		setVisible(true);
		
		while (ca == null && retorno != 3) {
			try {
				Thread.sleep(100); // Aguarda 100 milissegundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (retorno == 3) {
			return null;
		}
		return ca;
	}

	public CompanhiaAerea getCA() {
		return ca;
	}

	public void setCA(CompanhiaAerea ca) {
		this.ca = ca;
	}

	private CompanhiaAerea obterCA() {
		String endereco = enderecoLabel.getText();
		String cnpj = cnpjLabel.getText();
		String nome_oficial = nomeOfcLabel.getText();
		String nome_divulgacao = nomeDivLabel.getText();

		// Convertendo para inteiro para adicionar a DATA.
		int dia = Integer.parseInt(diaLabel.getText());
		int mes = Integer.parseInt(mesLabel.getText());
		int ano = Integer.parseInt(anoLabel.getText());

		Data data_criacao = new Data(dia, mes, ano);

		CompanhiaAerea ca = new CompanhiaAerea(cnpj,nome_oficial,nome_divulgacao,data_criacao,endereco);
		return ca;
	}
}
