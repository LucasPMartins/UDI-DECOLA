
public class Funcionario_Empresa extends Funcionario {

	
	public Funcionario_Empresa(String cpf, String endereco, String nome, Data data_nasc, String nro_carteira) {
		super(cpf, endereco, nome, data_nasc, nro_carteira);
	}

	public float calculaSalario(){
		return super.calculaSalario();
	}
	

}