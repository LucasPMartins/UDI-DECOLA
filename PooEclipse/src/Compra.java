
public class Compra {

	private Cliente cliente;
	private int qtdCompras; // quantidade de compras na operacao

	private float valorFinal; // valor final da compra

	private Voo voo;

	private Hotel hotel;
	private int tipo_Quarto;
	private ArrayList<Quartos> estadia;

	private Data data_compra;

	public Compra(Cliente cliente, Voo vo, Hotel hotel) {
		this.cliente = cliente;
		this.hotel = hotel;
		this.voo = vo;
	}

	public Boolean realizarCompra(Hotel hotel,Data data,int dias,int tipo){
		setHotel(hotel);
    	setTipo_Quarto = tipo;
    	setEstadia(this.hotel.reservar(data,dias,tipo))
		float r = 0;
		for (Quartos q : this.estadia) {
			if(getTipo_Quarto() == 1) {
				r += q.getDiariaSingle();
			}else if (getTipo_Quarto() == 2) {
				r += q.getDiariaDuplo();
			}else if (getTipo_Quarto() == 3) {
				r += q.getDiariaTriplo();
			}else if (getTipo_Quarto() == 4) {
				r += q.getDiariaLuxo();
			}
		}
		setValorFinal(r);
        return true; 
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
		if (getCliente.isVip()) {
			this.valorFinal = 0.9 * valorFinal;
		}
		this.valorFinal = valorFinal;
	}

}
