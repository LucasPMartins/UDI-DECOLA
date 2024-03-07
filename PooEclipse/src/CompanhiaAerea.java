
public class CompanhiaAerea extends Empresa{
	public CompanhiaAerea(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao) {
		super(cnpj,nome_oficial,nome_divulgacao,data_criacao);
	}
	private static int taxa_da_udi_decola = 1000;
	
}