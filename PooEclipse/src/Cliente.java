
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
	}
	
	public static int getNro_limite() {
		return nro_limite;
	}

	public static void setNro_limite(int nro_limite) {
		ClienteVip.nro_limite = nro_limite;
	}
	
	public void addCompra(Compra compra) {
		this.historico.add(compra);
		if(historico.size() >= nro_limite) {
			setVip(True);
		}
	}

	
	public Cliente(String cpf, String nome) {
		super(cpf,"", nome,"");
		email = "";
		data_cadastro = "";
	}
	
	
    public static int getCertaQtdCompras() {
        return certa_qtd_compras;
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

	public Pesquisa_Do_Cliente getRegistro() {
		return registro;
	}

	public void setRegistro(Pesquisa_Do_Cliente registro) {
		this.registro = registro;
	}


	public static int getCerta_qtd_compras() {
		return certa_qtd_compras;
	}


	public static void setCerta_qtd_compras(int certa_qtd_compras) {
		Cliente.certa_qtd_compras = certa_qtd_compras;
	}
	


	
}
