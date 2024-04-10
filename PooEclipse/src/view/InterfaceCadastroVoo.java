package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class InterfaceCadastroVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4;
	private JTextField textField_7;
	private JLabel lblNewLabel_5;
	private JTextField textField_8;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastroVoo frame = new InterfaceCadastroVoo();
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
	public InterfaceCadastroVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Voo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 190, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(53, 42, 33, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(90, 45, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(96, 42, 33, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(133, 45, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 42, 33, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setBounds(20, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horário de Partida:");
		lblNewLabel_2.setBounds(20, 73, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Horário de Chegada:");
		lblNewLabel_2_1.setBounds(20, 98, 134, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 70, 33, 20);
		contentPane.add(textField_3);
		
		lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(172, 72, 21, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 70, 33, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(192, 98, 33, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 98, 33, 20);
		contentPane.add(textField_6);
		
		lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(182, 100, 21, 14);
		contentPane.add(lblNewLabel_3_1);
		
		lblNewLabel_4 = new JLabel("Vagas:");
		lblNewLabel_4.setBounds(256, 45, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setBounds(300, 42, 46, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Preço:");
		lblNewLabel_5.setBounds(256, 73, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_8 = new JTextField();
		textField_8.setBounds(300, 70, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		btnNewButton = new JButton("Adicionar Trecho de Voo");
		btnNewButton.setBounds(242, 162, 202, 23);
		contentPane.add(btnNewButton);
	}
}
