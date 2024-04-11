package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classesPrincipais.Cliente;
import classesPrincipais.Data;
import classesPrincipais.Tempo;

import javax.swing.JLabel;
import java.awt.Font;
import java.time.LocalDate;

import javax.swing.JTextField;
import javax.swing.JButton;
import dados.DadosTrechoVoo;
import classesPrincipais.*;

public class InterfaceCadastroTrechoDeVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField origemField;
	private JLabel lblNewLabel_2;
	private JTextField destinoField;
	private JLabel lblNewLabel_3;
	private JTextField idField;
	private JLabel lblNewLabel_4;
	private JTextField hpartidaField;
	private JLabel lblNewLabel_5;
	private JTextField mpartidaField;
	private JLabel lblNewLabel_2_1;
	private JTextField hchegadaField;
	private JLabel lblNewLabel_3_1;
	private JTextField mchegadaField;
	private JButton Finalizar;
	private JButton AdicionarVoo;
	// Declaração do Trecho
	
	private Trecho_de_Voo trecho;
	public int retorno;
	

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
		
		origemField = new JTextField();
		origemField.setBounds(70, 42, 151, 20);
		contentPane.add(origemField);
		origemField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Destino:");
		lblNewLabel_2.setBounds(20, 75, 59, 14);
		contentPane.add(lblNewLabel_2);
		
		destinoField = new JTextField();
		destinoField.setColumns(10);
		destinoField.setBounds(70, 72, 151, 20);
		contentPane.add(destinoField);
		
		lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setBounds(20, 105, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		idField = new JTextField();
		idField.setColumns(10);
		idField.setBounds(44, 102, 151, 20);
		contentPane.add(idField);
		
		lblNewLabel_4 = new JLabel("Horário de Partida:");
		lblNewLabel_4.setBounds(20, 136, 109, 14);
		contentPane.add(lblNewLabel_4);
		
		hpartidaField = new JTextField();
		hpartidaField.setColumns(10);
		hpartidaField.setBounds(133, 133, 33, 20);
		contentPane.add(hpartidaField);
		
		lblNewLabel_5 = new JLabel(":");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(172, 135, 21, 14);
		contentPane.add(lblNewLabel_5);
		
		mpartidaField = new JTextField();
		mpartidaField.setColumns(10);
		mpartidaField.setBounds(182, 133, 33, 20);
		contentPane.add(mpartidaField);
		
		lblNewLabel_2_1 = new JLabel("Horário de Chegada:");
		lblNewLabel_2_1.setBounds(20, 161, 134, 14);
		contentPane.add(lblNewLabel_2_1);
		
		hchegadaField = new JTextField();
		hchegadaField.setColumns(10);
		hchegadaField.setBounds(143, 161, 33, 20);
		contentPane.add(hchegadaField);
		
		lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(182, 163, 21, 14);
		contentPane.add(lblNewLabel_3_1);
		
		mchegadaField = new JTextField();
		mchegadaField.setColumns(10);
		mchegadaField.setBounds(192, 161, 33, 20);
		contentPane.add(mchegadaField);
		
		Finalizar = new JButton("Finalizar");
		Finalizar.setBounds(180, 246, 89, 23);
		contentPane.add(Finalizar);
		
		AdicionarVoo = new JButton("Adicionar mais um Voo");
		AdicionarVoo.setBounds(10, 203, 215, 23);
		contentPane.add(AdicionarVoo);
	}
	
	public Trecho_de_Voo retornaTrechoVoo() {
		setVisible(true);
		// Aguarda até que o cliente seja retornado pela interface
        while (trecho == null && retorno != 3) {
            try {
                Thread.sleep(100); // Aguarda 100 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(retorno == 3) {
        	return null;
        }
        return trecho;
	}
	
	public Trecho_de_Voo obterTrechoVoo() {
		String id = idField.getText();
		String origem = origemField.getText();
		String destino = destinoField.getText();
		
		CompanhiaAerea comp = new CompanhiaAerea();
		
		int h = Integer.parseInt(hpartidaField.getText());
		int m = Integer.parseInt(mpartidaField.getText());
		Tempo hInicio = new Tempo(h,m);
		
		h = Integer.parseInt(hchegadaField.getText());
		m = Integer.parseInt(mchegadaField.getText());
		Tempo hChegada = new Tempo(h,m);
		
        return new Trecho_de_Voo(id,origem,destino,comp,hInicio,hChegada);
    }
	
	
	
	

}
