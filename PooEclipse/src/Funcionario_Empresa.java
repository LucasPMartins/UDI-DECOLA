
public class Funcionario_Empresa extends Funcionario {

	public Funcionario_Empresa(String cpf, String endereco, String nome, String data_nasc, String nro) {
		super(cpf, endereco, nome, data_nasc, nro);

	}
	
	public float calculaSalario(){
		
		return super.calculaSalario();
	}
	

}