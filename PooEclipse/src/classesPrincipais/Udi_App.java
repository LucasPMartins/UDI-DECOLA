package classesPrincipais;

import javax.swing.JOptionPane;

import dados.DadosCliente;
import dados.DadosCompanhiaAerea;
import dados.DadosCompra;
import dados.DadosFuncionarios;
import dados.DadosHoteis;
import dados.DadosTrechoVoo;
import dados.DadosVoo;
import view.InterfaceCadastroCliente;

public class Udi_App {
	private static DadosCliente clientes;
	private DadosFuncionarios funcionarios;
	private DadosHoteis hoteis;
	private DadosTrechoVoo trechoVoo;
	private DadosVoo voo;
	private DadosCompanhiaAerea CompAerea;
	private DadosCompra compra;
	private static Cliente cliente;
	
	public static void main(String[] args) {
		InterfaceCadastroCliente tela1 = new InterfaceCadastroCliente();
		cliente = tela1.retornaCliente();
		if (cliente != null) {
		    System.out.println(cliente.toString());
		} else {
		    System.out.println("O cliente não foi cadastrado ou é nulo.");
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
