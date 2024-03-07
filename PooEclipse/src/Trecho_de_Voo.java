
public class Trecho_de_Voo {
	private String codigoID;
	private String origem;
	private String destino;
	private CompanhiaAerea companhia;
	

    public Trecho_de_Voo(String codigoID, String origem, String destino, CompanhiaAerea companhia) {
		this.codigoID = codigoID;
		this.origem = origem;
		this.destino = destino;
		this.companhia = companhia;
	}
    
	public String getCodigoID() {
        return codigoID;
    }
    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public CompanhiaAerea getCompanhia() {
        return companhia;
    }
    public void setCompanhia(CompanhiaAerea companhia) {
        this.companhia = companhia;
    }
	
	
}
