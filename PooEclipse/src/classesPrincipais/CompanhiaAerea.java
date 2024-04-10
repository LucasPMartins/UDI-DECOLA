package classesPrincipais;

public class CompanhiaAerea extends Empresa{
	
	private static float taxa_da_udi_decola = 1000f; //Essa é a taxa que é paga ao UDI-decola a cada venda de passagem.
	
	public CompanhiaAerea(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao) {
		super(cnpj,nome_oficial,nome_divulgacao,data_criacao);
	}
	
	
	public static float getTaxa_da_udi_decola() {
		return taxa_da_udi_decola;
	}
	public static void setTaxa_da_udi_decola(float taxa_da_udi_decola) {
		CompanhiaAerea.taxa_da_udi_decola = taxa_da_udi_decola;
	}
	
	
}