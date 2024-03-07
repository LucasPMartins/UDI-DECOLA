
public class Cliente extends Pessoa{
	
	private String email;
	private Data data_cadastro;
	private Pesquisa_Do_Cliente registro;
	private static int certa_qtd_compras; // quantidade fixa de compras, que atingida o cliente se torna vip
	
	
	
	public Cliente(String cpf, String nome,String email, Data data_cadastro, String endereco,Data nascimento, Data virou_VIP) {
		super(cpf,endereco, nome,nascimento);
		this.email = email;
		this.data_cadastro = data_cadastro;
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
