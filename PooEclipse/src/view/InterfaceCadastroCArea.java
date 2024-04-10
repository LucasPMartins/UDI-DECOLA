package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class InterfaceCadastroCArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		textField = new JTextField();
		textField.setBounds(77, 45, 344, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel(" Nome Oficial:");
		lblNewLabel_9.setBounds(13, 78, 85, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(108, 76, 136, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Nome Divulgação:");
		lblNewLabel_10.setBounds(262, 78, 111, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(383, 76, 141, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("CNPJ:");
		lblNewLabel_11.setBounds(431, 48, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setBounds(469, 45, 160, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Criação:");
		lblNewLabel_12.setBounds(13, 112, 95, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setBounds(118, 107, 33, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(161, 107, 33, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(204, 107, 33, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(155, 110, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(198, 110, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(556, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(445, 158, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
