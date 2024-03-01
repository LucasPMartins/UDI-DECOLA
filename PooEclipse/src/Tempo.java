
public class Tempo {
	private int hora, minuto, segundo;

	public Tempo(int hora, int minuto, int segundo) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
		if(minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
		if(segundo < 0 || segundo > 59)
			this.segundo = 0;
		else
			this.segundo = segundo;
	}
	
	public Tempo(int hora, int minuto) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
		if(minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
		this.segundo = 0;
	}
	
	public Tempo(int hora) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public String mostrar() {
		return (getHora()+":"+getMinuto()+":"+getSegundo());
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo > 59)
			this.segundo = 0;
		else
			this.segundo = segundo;
	}
	
	public void incrementa_minuto() {
		if(getMinuto() == 59) {
			setHora(getHora()+1);
			setMinuto(0);
		}
		else setMinuto(getMinuto()+1);
	}
	
	public void decrementa_minuto() {
		if(getMinuto() == 0) {
			setSegundo(0);
		}
		else setMinuto(getMinuto()-1);
	}
	
}
