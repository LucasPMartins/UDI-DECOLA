
public abstract class Funcionario extends Pessoa{
	
	private String nro_carteira;
	private static float salario;
	
	public Funcionario(String cpf, String endereco, String nome, Data data_nasc, String nro_carteira) {
		super(cpf, endereco, nome, data_nasc);
		this.nro_carteira = nro_carteira;
	}
	public String getNro_carteira() {
		return nro_carteira;
	}
	public void setNro_carteira(String nro_carteira) {
		this.nro_carteira = nro_carteira;
	}
	public static float getSalario() {
		return salario;
	}
	public static void setSalario(float salario) {
		Funcionario.salario = salario;
	}
	
	public float calculaSalario() {
		return salario;
	}
}
