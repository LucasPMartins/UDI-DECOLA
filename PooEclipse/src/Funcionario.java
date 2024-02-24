
public abstract class Funcionario extends Pessoa{
	
	private String nro;
	private static float salario_func;


	public Funcionario(String cpf, String endereco, String nome, String data_nasc, String nro) {
		super(cpf, endereco, nome, data_nasc);
		this.nro = nro;
	}


	public String getNro() {
		return nro;
	}


	public void setNro(String nro) {
		this.nro = nro;
	}


	public static float getSalario_func() {
		return salario_func;
	}


	public static void setSalario_func(float salario_func) {
		Funcionario.salario_func = salario_func;
	}
	
	
	public float calculaSalario(){
		
		return salario_func;
	}
	
	
}
