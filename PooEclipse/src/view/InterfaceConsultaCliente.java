package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfaceConsultaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceConsultaCliente frame = new InterfaceConsultaCliente();
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
	public InterfaceConsultaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 10, 152, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Busca por CPF:");
		lblNewLabel_1.setBounds(20, 47, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(115, 44, 196, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(321, 43, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblDadosDoCliente = new JLabel("Dados do Cliente:");
		lblDadosDoCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDadosDoCliente.setBounds(10, 72, 161, 26);
		contentPane.add(lblDadosDoCliente);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setBounds(20, 115, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 112, 193, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_12 = new JLabel("Data de Nascimento:");
		lblNewLabel_12.setBounds(299, 112, 137, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(422, 109, 33, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(459, 112, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(465, 109, 33, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(502, 112, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(508, 109, 33, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("Endereço:");
		lblNewLabel_2.setBounds(20, 143, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(84, 140, 325, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(20, 172, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(76, 169, 333, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setBounds(20, 200, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(76, 197, 303, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_5 = new JLabel("Usuario:");
		lblNewLabel_5.setBounds(20, 249, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(69, 246, 150, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(69, 281, 150, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_6 = new JLabel("Senha:");
		lblNewLabel_6.setBounds(20, 284, 62, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(459, 297, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
