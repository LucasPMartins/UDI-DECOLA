import java.util.ArrayList;

public class Cliente extends Pessoa{
	
	private String email;
	private Data data_cadastro;
	private ArrayList<Pesquisa> registros = new ArrayList<Pesquisa>();
	private ArrayList<Compra> historico = new ArrayList<Compra>();
	private boolean vip;
	private static int nro_limite;
	
	public int getQtdCompras() {
		return historico.size();
	}
	
	public Cliente(String cpf, String nome,String email, Data data_cadastro, String endereco,Data nascimento, Data virou_VIP) {
		super(cpf,endereco, nome,nascimento);
		vip = false;
		this.email = email;
		this.data_cadastro = data_cadastro;
	}
	
	public static int getNro_limite() {
		return nro_limite;
	}
	
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public static void setNro_limite(int nro_limite) {
		Cliente.nro_limite = nro_limite;
	}

	public void addCompra(Compra compra) {
		this.historico.add(compra);
		if(getQtdCompras() >= nro_limite) {
			setVip(true);
		}
	}

	public Cliente(String cpf, String endereco, String nome, Data data_nasc, String email, Data data_cadastro) {
		super(cpf, endereco, nome, data_nasc);
		this.email = email;
		this.data_cadastro = data_cadastro;
		this.setVip(false);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Data data_cadastro) {
		this.data_cadastro = data_cadastro;
	}



	
}
