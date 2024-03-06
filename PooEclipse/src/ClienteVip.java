
public class ClienteVip extends Cliente {
    private float desconto;

    public ClienteVip(String cpf, String nome, float desconto) {
        super(cpf, nome);
        this.desconto = desconto;
    }

    public float getDesconto() {
        return desconto;
    }
}