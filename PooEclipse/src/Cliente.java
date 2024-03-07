import java.util.ArrayList;

public class Cliente extends Pessoa{
	
	private String email;
	private Data data_cadastro;
	private ArrayList<Pesquisa> registros;
	private ArrayList<Compra> historico;
	private boolean vip;
	private static int nro_limite;
	
	
	
	public Cliente(String cpf, String nome,String email, Data data_cadastro, String endereco,Data nascimento, Data virou_VIP) {
		super(cpf,endereco, nome,nascimento);
		vip = false;
		this.email = email;
		this.data_cadastro = data_cadastro;
		historico = new ArrayList<Compra>();
		registros = new ArrayList<Pesquisa>();
		
	}
	
	public Cliente(String cpf, String nome) {
		super(cpf,null, nome,null);
		email = null;
		data_cadastro = null;
	}
	
	
	public ArrayList<Pesquisa> getRegistros() {
		return registros;
	}



	public void setRegistros(ArrayList<Pesquisa> registros) {
		this.registros = registros;
	}



	public ArrayList<Compra> getHistorico() {
		return historico;
	}



	public void setHistorico(ArrayList<Compra> historico) {
		this.historico = historico;
	}



	public boolean isVip() {
		return vip;
	}



	public void setVip(boolean vip) {
		this.vip = vip;
	}



	public static int getNro_limite() {
		return nro_limite;
	}

	public static void setNro_limite(int nro_limite) {
		Cliente.nro_limite = nro_limite;
	}
	
	public void addCompra(Compra compra) {
		this.historico.add(compra);
		if(historico.size() >= nro_limite) {
			setVip(true);
		}
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
