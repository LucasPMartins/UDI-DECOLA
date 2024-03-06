
public class ClienteVip extends Cliente {
	
	private static int nro_limite; 
    private float desconto;

    public ClienteVip(String cpf, String nome, float desconto) {
        super(cpf, nome);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }

	public static int getNro_limite() {
		return nro_limite;
	}

	public static void setNro_limite(int nro_limite) {
		ClienteVip.nro_limite = nro_limite;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
    

}