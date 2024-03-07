
public abstract class Funcionario extends Pessoa {

	private String nro_carteira;
	private static float salario;
	private Hotel hotel;
	private CompanhiaAerea Aerea;

	public Funcionario(String cpf, String endereco, String nome, Data data_nasc, String nro_carteira, Hotel hotel,
			CompanhiaAerea aerea) {
		super(cpf, endereco, nome, data_nasc);
		setNro_carteira(nro_carteira);
		setHotel(hotel);
		setAerea(aerea);
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
		return getSalario();
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public CompanhiaAerea getAerea() {
		return Aerea;
	}

	public void setAerea(CompanhiaAerea aerea) {
		Aerea = aerea;
	}
}
