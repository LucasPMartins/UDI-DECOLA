
public class Funcionario_Parceiro extends Funcionario{
	
	
	private Hotel hoteis_cadastro;
	private static float porcentagem_por_hotel;

	public Funcionario_Parceiro(String cpf, String endereco, String nome, String data_nasc, String nro) {
		super(cpf, endereco, nome, data_nasc, nro);

	}

	public Hotel getHoteis_cadastro() {
		return hoteis_cadastro;
	}

	public void setHoteis_cadastro(Hotel hoteis_cadastro) {
		this.hoteis_cadastro = hoteis_cadastro;
	}

	public static float getPorcentagem_por_hotel() {
		return porcentagem_por_hotel;
	}

	public static void setPorcentagem_por_hotel(float porcentagem_por_hotel) {
		Funcionario_Parceiro.porcentagem_por_hotel = porcentagem_por_hotel;
	}



	
}
