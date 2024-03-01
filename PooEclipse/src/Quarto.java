
public class Quarto {
	private int numero;
	private Data data;
	private boolean disponivel;
	private boolean standard;
	private boolean luxo;
	private boolean single;
	private boolean dublo;
	private boolean triplo;
	private boolean cancelamento;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data d) {
		this.data = d;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public boolean isStandard() {
		return standard;
	}
	public void setStandard(boolean standard) {
		this.standard = standard;
	}
	public boolean isLuxo() {
		return luxo;
	}
	public void setLuxo(boolean luxo) {
		this.luxo = luxo;
	}
	public boolean isSingle() {
		return single;
	}
	public void setSingle(boolean single) {
		this.single = single;
	}
	public boolean isDublo() {
		return dublo;
	}
	public void setDublo(boolean dublo) {
		this.dublo = dublo;
	}
	public boolean isTriplo() {
		return triplo;
	}
	public void setTriplo(boolean triplo) {
		this.triplo = triplo;
	}
	public boolean isCancelamento() {
		return cancelamento;
	}
	public void setCancelamento(boolean cancelamento) {
		this.cancelamento = cancelamento;
	}
	
	
}
