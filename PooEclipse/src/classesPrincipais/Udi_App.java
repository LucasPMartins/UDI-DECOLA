package classesPrincipais;


import javax.swing.JOptionPane;
import dados.*;
import view.InterfaceCadastroCliente;
import view.InterfaceCadastroFuncionario;
import view.InterfaceCadastroHotel;

import java.io.*;

public class Udi_App {
	private static DadosCliente clientes; // Dados que armazena o arraylist e suas operações
	private DadosFuncionarios funcionarios;
	private DadosHoteis hoteis;
	private DadosTrechoVoo trechoVoo;
	private DadosVoo voo;
	private DadosCompanhiaAerea CompAerea;
	private DadosCompra compra;
	private static Cliente cliente;
	private static Funcionario_Parceiro funcionario;
	private static Hotel hotel;
	
	public static void main(String[] args) {
		try {
            InterfaceCadastroCliente tela1 = new InterfaceCadastroCliente();
            cliente = tela1.retornaCliente();
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, cliente.toString());
                String path = "ArqClientes.txt";
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
                    bw.write(cliente.mostrarDados());
                } catch (IOException e) {
                    // Trate exceções de E/S
                	e.printStackTrace();
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "O cliente não foi cadastrado ou é nulo.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a execução do programa:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
		InterfaceCadastroFuncionario tela2 = new InterfaceCadastroFuncionario();
		funcionario = tela2.retornaFuncionario();
		if(funcionario != null) {
			JOptionPane.showMessageDialog(null, funcionario.toString());
		}else {
            JOptionPane.showMessageDialog(null, "O funcionário não foi cadastrado ou é nulo.");
        }
		InterfaceCadastroHotel tela3 = new InterfaceCadastroHotel();
		hotel = tela3.retornaHotel();
		if(hotel != null) {
			JOptionPane.showMessageDialog(null,hotel.toString());
			funcionario.addHotel(hotel);
		}else {
            JOptionPane.showMessageDialog(null, "O hotel não foi cadastrado ou é nulo.");
        }
		
	}
	

	public DadosCliente getClientes() {
		return clientes;
	}

	public void setClientes(DadosCliente clientes) {
		Udi_App.clientes = clientes;
	}

	public DadosFuncionarios getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(DadosFuncionarios funcionarios) {
		this.funcionarios = funcionarios;
	}

	public DadosHoteis getHoteis() {
		return hoteis;
	}

	public void setHoteis(DadosHoteis hoteis) {
		this.hoteis = hoteis;
	}

	public DadosTrechoVoo getTrechoVoo() {
		return trechoVoo;
	}

	public void setTrechoVoo(DadosTrechoVoo trechoVoo) {
		this.trechoVoo = trechoVoo;
	}

	public DadosVoo getVoo() {
		return voo;
	}

	public void setVoo(DadosVoo voo) {
		this.voo = voo;
	}

	public DadosCompanhiaAerea getCompAerea() {
		return CompAerea;
	}

	public void setCompAerea(DadosCompanhiaAerea compAerea) {
		CompAerea = compAerea;
	}

	public DadosCompra getCompra() {
		return compra;
	}

	public void setCompra(DadosCompra compra) {
		this.compra = compra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		Udi_App.cliente = cliente;
	}

}
