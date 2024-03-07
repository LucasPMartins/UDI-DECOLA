
public class CompanhiaAerea extends Empresa{
	public CompanhiaAerea(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao) {
		super(cnpj,nome_oficial,nome_divulgacao,data_criacao);
	}
	private static float taxa_da_udi_decola = 1000f;
	
	public static float getTaxa_da_udi_decola() {
		return taxa_da_udi_decola;
	}
	public static void setTaxa_da_udi_decola(float taxa_da_udi_decola) {
		CompanhiaAerea.taxa_da_udi_decola = taxa_da_udi_decola;
	}
	
	
}