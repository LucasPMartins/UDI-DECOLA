import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interface01 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton logar; 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interface01 frame = new Interface01();
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
    public Interface01() {
        setTitle("Login");
        setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.decode("#1A1A1A"));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Color[] colors = {Color.decode("#1A1A1A"), Color.decode("#F3F3F3")};
        
        
        JButton botao1 = new JButton("Modo Noturno");
        botao1.setFont(new Font("Arial", Font.PLAIN, 18));
        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//Este campo basicamente troca a cor de cada um dos WIDGETS como, botoes, campos...
                Color cor1 = (contentPane.getBackground().equals(colors[0])) ? colors[1] : colors[0];
                Color cor2 = colors[0];
                if(cor1.equals(colors[0])) {
                    cor2 = colors[1];
                }
                contentPane.setBackground(cor1);
                campoUsuario.setBackground(cor2);
                campoSenha.setBackground(cor2);
                botao1.setBackground(cor2);
                logar.setBackground(cor2);
                
            }
        });
        
        botao1.setBounds(254, 16, 165, 29);
        contentPane.add(botao1);
        
        campoUsuario = new JTextField();
        campoUsuario.setBounds(104, 86, 209, 26);
        contentPane.add(campoUsuario);
        campoUsuario.setColumns(10);
        
        campoSenha = new JPasswordField();
        campoSenha.setBounds(104, 128, 209, 26);
        contentPane.add(campoSenha);
        
        logar = new JButton("Login"); // Removido o tipo de declaração JButton
        logar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
        //logar.setBackground(colors[0]);
        logar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        logar.setBounds(152, 170, 115, 29);
        contentPane.add(logar);
    }
}
