
public class Cliente extends Pessoa{
	
	private String email;
	private String data_cadastro;
	private Pesquisa_Do_Cliente registro;
	
	
	public Cliente(String cpf, String nome) {
		super(cpf,"", nome,"");
		email = "";
		data_cadastro = "";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Pesquisa_Do_Cliente getRegistro() {
		return registro;
	}

	public void setRegistro(Pesquisa_Do_Cliente registro) {
		this.registro = registro;
	}
	
	
	

	
}
