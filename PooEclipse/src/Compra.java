
public class Compra{

    private Cliente cliente;
    private int qtdCompras; //quantidade de compras na operacao
    private Voo voo;
    private Hotel hotel;
    private int qtdComprasCliente; //contador de compras feita pelo cliente
    private float valorFinal; //valor final da compra

    public Compra(Cliente cliente, int qtdCompras, Voo voo, Hotel hotel){
        this.cliente = cliente;
        this.hotel = hotel;
        this.qtdCompras = qtdCompras;
        this.voo = voo;
    }

    public Boolean realizarCompra(Compra compra){
    	
        if(qtdCompras <= 0){
            return false;
        }
        //valorFinal =

        qtdComprasCliente++;
        return true; 
    }
 
    
    
    public void seTornaVip() {
        if (qtdComprasCliente == Cliente.getCertaQtdCompras()) {
        	
            ClienteVip clienteVip = new ClienteVip(cliente.getCpf(), cliente.getNome(), 0.1f);

            
            this.cliente = clienteVip;
        }
    }

    

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQtdCompras() {
		return qtdCompras;
	}

	public void setQtdCompras(int qtdCompras) {
		this.qtdCompras = qtdCompras;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getQtdComprasCliente() {
		return qtdComprasCliente;
	}

	public void setQtdComprasCliente(int qtdComprasCliente) {
		this.qtdComprasCliente = qtdComprasCliente;
	}

	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}



}
