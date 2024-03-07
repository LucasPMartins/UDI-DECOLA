
public class Compra {

	private Cliente cliente;

	private float valorFinal; // valor final da compra

	private Voo voo;

	private Hotel hotel;
	private int tipo_Quarto;
	private Data inicio;
	private Data fim;

	private Data data_compra;

	public Compra(Cliente cliente, Voo vo, Hotel hotel) {
		this.cliente = cliente;
		this.hotel = hotel;
		this.voo = vo;
	}

	public Boolean realizarCompra(Hotel hotel,Data inicio,Data fim,int tipo){
		setHotel(hotel);
    	setTipo_Quarto(tipo);
    	int count = 0;
    	int dias = inicio.diferencaDeDias(fim);
		float r = 0;
		for (Quartos q : hotel.getQuartos()) {
			if(getTipo_Quarto() == 1) {
				r += q.getDiaria_single();
				count++;
			}else if (getTipo_Quarto() == 2) {
				r += q.getDiaria_duplo();
				count++;
			}else if (getTipo_Quarto() == 3) {
				r += q.getDiaria_triplo();
				count++;
			}else if (getTipo_Quarto() == 4) {
				r += q.getDiaria_luxo();
				count++;
			}
			if(count == dias) {
				hotel.reservar(inicio, dias, tipo); //decrementa os quartos disponiveis do hotel
				break;
			}
		}
		if(count != dias) {
			return false; //não foi possivel alugar os quartos para todos os dias
		}
		setValorFinal(getValorFinal()+r);// somatoria do total a pagar pelos dias no hotel
		return true; 
    }

	
	public int getTipo_Quarto() {
		return tipo_Quarto;
	}

	public void setTipo_Quarto(int tipo_Quarto) {
		this.tipo_Quarto = tipo_Quarto;
	}

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public Data getFim() {
		return fim;
	}

	public void setFim(Data fim) {
		this.fim = fim;
	}

	public Data getData_compra() {
		return data_compra;
	}

	public void setData_compra(Data data_compra) {
		this.data_compra = data_compra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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


	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		if (getCliente().isVip()) {
			this.valorFinal = 0.9f * valorFinal;
		}
		this.valorFinal = valorFinal;
	}

}
