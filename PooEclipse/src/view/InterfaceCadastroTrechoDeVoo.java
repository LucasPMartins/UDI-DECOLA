package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfaceCadastroTrechoDeVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_2_1;
	private JTextField textField_5;
	private JLabel lblNewLabel_3_1;
	private JTextField textField_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastroTrechoDeVoo frame = new InterfaceCadastroTrechoDeVoo();
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
	public InterfaceCadastroTrechoDeVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Trecho de Voo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 201, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Origem:");
		lblNewLabel_1.setBounds(20, 45, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(70, 42, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Destino:");
		lblNewLabel_2.setBounds(20, 75, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(70, 72, 151, 20);
		contentPane.add(textField_1);
		
		lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setBounds(20, 105, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(44, 102, 151, 20);
		contentPane.add(textField_2);
		
		lblNewLabel_4 = new JLabel("Horário de Partida:");
		lblNewLabel_4.setBounds(20, 136, 109, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 133, 33, 20);
		contentPane.add(textField_3);
		
		lblNewLabel_5 = new JLabel(":");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(172, 135, 21, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 133, 33, 20);
		contentPane.add(textField_4);
		
		lblNewLabel_2_1 = new JLabel("Horário de Chegada:");
		lblNewLabel_2_1.setBounds(20, 161, 134, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 161, 33, 20);
		contentPane.add(textField_5);
		
		lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(182, 163, 21, 14);
		contentPane.add(lblNewLabel_3_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(192, 161, 33, 20);
		contentPane.add(textField_6);
		
		btnNewButton = new JButton("Finalizar");
		btnNewButton.setBounds(180, 246, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Adicionar mais um Voo");
		btnNewButton_1.setBounds(10, 203, 215, 23);
		contentPane.add(btnNewButton_1);
	}

}
