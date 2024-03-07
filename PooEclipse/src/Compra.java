
public class Compra {

	private Cliente cliente;

	private float valorFinal; // valor final da compra

	private Voo voo;

	private Hotel hotel;
	private int tipo_Quarto;
	private Data inicio;
	private Data fim;

	private Data data_compra;

	

	public Compra(Cliente cliente, Voo voo, Hotel hotel, int tipo_Quarto, Data inicio, Data fim,
			Data data_compra,int qtd_passagem) {
		if(hotel != null) {
			this.hotel = hotel;
			this.tipo_Quarto = tipo_Quarto;
			this.inicio = inicio;
			this.fim = fim;
			reservarHotel(hotel,inicio,fim,tipo_Quarto);
		}else {
			this.hotel = null;
			this.tipo_Quarto = 0;
			this.inicio = null;
			this.fim = null;
		}if(voo != null) {
			if(comprarPassagemAerea(voo, qtd_passagem)) {
				//Aqui seria a companhia pagando para a UDI decola
			}
		}
		this.cliente = cliente;
		this.data_compra = data_compra;	
		
	}


	public Boolean reservarHotel(Hotel hotel,Data inicio,Data fim,int tipo){
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
	
	public Boolean comprarPassagemAerea(Voo vooSelecionado, int qtdPassagens) {
	    if (vooSelecionado.getNro_vagas_disponiveis() >= qtdPassagens) {
	        // Atualiza o atributo voo com o voo selecionado
	        setVoo(vooSelecionado);
	        // Atualiza o número de vagas disponíveis no voo
	        vooSelecionado.setNro_vagas_disponiveis(vooSelecionado.getNro_vagas_disponiveis() - qtdPassagens);
	        // Atualiza o valor final da compra
	        setValorFinal(getValorFinal() + (qtdPassagens * vooSelecionado.getPreco_da_passagem()));
	        return true; // Compra realizada com sucesso
	    } else {
	        return false; // Não há vagas suficientes para a quantidade desejada de passagens
	    }
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
