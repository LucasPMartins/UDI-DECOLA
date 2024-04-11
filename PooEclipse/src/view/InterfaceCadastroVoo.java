package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import dados.DadosVoo;
import classesPrincipais.*;

public class InterfaceCadastroVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField diaField;
	private JTextField mesField;
	private JTextField anoField;
	private JTextField hpartidaField;
	private JLabel lblNewLabel_3;
	private JTextField mpartidaField;
	private JTextField mchegadaField;
	private JTextField hchegadaField;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4;
	private JTextField vagasField;
	private JLabel lblNewLabel_5;
	private JTextField precoField;
	private JButton adicionarTrechoVoo;

	int retorno; // usado na função retornaVoo, a depender do try catch da instanciação do objeto.
	Voo voo;
	
	
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
		
		diaField = new JTextField();
		diaField.setColumns(10);
		diaField.setBounds(53, 42, 33, 20);
		contentPane.add(diaField);
		
		JLabel lblNewLabel_13 = new JLabel("/");
		lblNewLabel_13.setBounds(90, 45, 21, 14);
		contentPane.add(lblNewLabel_13);
		
		mesField = new JTextField();
		mesField.setColumns(10);
		mesField.setBounds(96, 42, 33, 20);
		contentPane.add(mesField);
		
		JLabel lblNewLabel_14 = new JLabel("/");
		lblNewLabel_14.setBounds(133, 45, 21, 14);
		contentPane.add(lblNewLabel_14);
		
		anoField = new JTextField();
		anoField.setColumns(10);
		anoField.setBounds(139, 42, 33, 20);
		contentPane.add(anoField);
		
		JLabel lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setBounds(20, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horário de Partida:");
		lblNewLabel_2.setBounds(20, 73, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Horário de Chegada:");
		lblNewLabel_2_1.setBounds(20, 98, 134, 14);
		contentPane.add(lblNewLabel_2_1);
		
		hpartidaField = new JTextField();
		hpartidaField.setColumns(10);
		hpartidaField.setBounds(133, 70, 33, 20);
		contentPane.add(hpartidaField);
		
		lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(172, 72, 21, 14);
		contentPane.add(lblNewLabel_3);
		
		mpartidaField = new JTextField();
		mpartidaField.setColumns(10);
		mpartidaField.setBounds(182, 70, 33, 20);
		contentPane.add(mpartidaField);
		
		mchegadaField = new JTextField();
		mchegadaField.setColumns(10);
		mchegadaField.setBounds(192, 98, 33, 20);
		contentPane.add(mchegadaField);
		
		hchegadaField = new JTextField();
		hchegadaField.setColumns(10);
		hchegadaField.setBounds(143, 98, 33, 20);
		contentPane.add(hchegadaField);
		
		lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(182, 100, 21, 14);
		contentPane.add(lblNewLabel_3_1);
		
		lblNewLabel_4 = new JLabel("Vagas:");
		lblNewLabel_4.setBounds(256, 45, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		vagasField = new JTextField();
		vagasField.setBounds(300, 42, 46, 20);
		contentPane.add(vagasField);
		vagasField.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Preço:");
		lblNewLabel_5.setBounds(256, 73, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		precoField = new JTextField();
		precoField.setBounds(300, 70, 86, 20);
		contentPane.add(precoField);
		precoField.setColumns(10);
		
		adicionarTrechoVoo = new JButton("Adicionar Trecho de Voo");
		adicionarTrechoVoo.setBounds(242, 162, 202, 23);
		contentPane.add(adicionarTrechoVoo);
	}
	
	public Voo retornaVoo() {
		setVisible(true);
		// Aguarda até que o cliente seja retornado pela interface
        while (voo == null && retorno != 3) {
            try {
                Thread.sleep(100); // Aguarda 100 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(retorno == 3) {
        	return null;
        }
        return voo;
	}
	
	public Voo obterVoo() {
		/*
		 
		 
		String id = idField.getText();
		String origem = origemField.getText();
		String destino = destinoField.getText();
		
		CompanhiaAerea comp = new CompanhiaAerea();
		
		
		int dia,mes,ano;
		
		Data d = new Data(dia,mes,ano);
		int h = Integer.parseInt(hpartidaField.getText());
		int m = Integer.parseInt(mpartidaField.getText());
		Tempo hInicio = new Tempo(h,m);
		
		h = Integer.parseInt(hchegadaField.getText());
		m = Integer.parseInt(mchegadaField.getText());
		Tempo hChegada = new Tempo(h,m);
		
        return new Voo(id,origem,destino,comp,hInicio,hChegada);
        */
    }
	
	
}
