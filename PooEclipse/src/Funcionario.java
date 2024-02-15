
public abstract class Funcionario extends Pessoa{
	
	private String nro;
	private static float salario_func;


	public Funcionario(String cpf, String endereco, String nome, String data_nasc, String nro) {
		super(cpf, endereco, nome, data_nasc);
		this.nro = nro;
	}
	
	
	
}
