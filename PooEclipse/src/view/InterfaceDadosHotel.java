package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InterfaceDadosHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtStandard;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceDadosHotel frame = new InterfaceDadosHotel();
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
	public InterfaceDadosHotel() {
		setTitle("Dados do Hotel");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dados do Hotel:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 140, 11);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço:");
		lblNewLabel_1.setBounds(16, 48, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(77, 45, 344, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Permitido Pets");
		chckbxNewCheckBox.setBounds(16, 140, 111, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Número de Estrelas:");
		lblNewLabel_2.setBounds(139, 144, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(265, 140, 40, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Horário do Check-in:");
		lblNewLabel_3.setBounds(16, 113, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Horário do Check-out:");
		lblNewLabel_4.setBounds(205, 113, 128, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(129, 109, 40, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(364, 109, 40, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(326, 109, 40, 22);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(165, 109, 40, 22);
		contentPane.add(comboBox_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cidade:");
		lblNewLabel_5.setBounds(431, 144, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(477, 141, 152, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Mensagem de \r\n");
		lblNewLabel_6.setBounds(39, 187, 111, 23);
		contentPane.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(155, 186, 474, 63);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Informações sobre os Quartos:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 257, 241, 14);
		contentPane.add(lblNewLabel_7);
		
		txtStandard = new JTextField();
		txtStandard.setToolTipText("");
		txtStandard.setBounds(77, 309, 86, 20);
		contentPane.add(txtStandard);
		txtStandard.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("SINGLE");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(21, 312, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Cancelamentos");
		chckbxNewCheckBox_1.setBounds(311, 140, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
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
		lblNewLabel_12.setBounds(410, 112, 95, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_5 = new JTextField();
		textField_5.setBounds(509, 109, 33, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(552, 109, 33, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(595, 109, 33, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(546, 112, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(589, 112, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("DUPLO");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(21, 334, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("TRIPLO");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(21, 359, 46, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("LUXO");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(21, 381, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		textField_8 = new JTextField();
		textField_8.setBounds(77, 332, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(77, 355, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(77, 378, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Quantidade");
		lblNewLabel_18.setBounds(87, 284, 70, 14);
		contentPane.add(lblNewLabel_18);
		
		textField_11 = new JTextField();
		textField_11.setToolTipText("");
		textField_11.setColumns(10);
		textField_11.setBounds(182, 309, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(182, 332, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(182, 355, 86, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(182, 378, 86, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Diária");
		lblNewLabel_19.setBounds(203, 284, 65, 14);
		contentPane.add(lblNewLabel_19);
		
		textField_15 = new JTextField();
		textField_15.setBounds(287, 309, 86, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(287, 332, 86, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(287, 355, 86, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(287, 378, 86, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Desconto");
		lblNewLabel_20.setBounds(299, 284, 86, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Divulgação:");
		lblNewLabel_21.setBounds(39, 212, 88, 14);
		contentPane.add(lblNewLabel_21);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(561, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(462, 416, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
