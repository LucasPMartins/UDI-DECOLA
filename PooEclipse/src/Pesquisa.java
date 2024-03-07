

import java.time.LocalDateTime;

public class Pesquisa {
	
    private String origem;
    private String destino;
    private LocalDateTime dat_inicial;
    private LocalDateTime dataFim;
    private LocalDateTime dat_hora_pesquisa;
    private ArrayList<Hotel> hotel;
    private ArrayList<Voo> voos;
    
    public Pesquisa(ArrayList<Hotel> hoteis, String destino, LocalDateTime dat_inicial, LocalDateTime dataFim,
    		LocalDateTime dat_hora_pesquisa) {
    	//HOTEL
    	for(Hotel h : hoteis) {
    		if(h.getCidade() == destino) {
    			hotel.add(h);
    		}
    	}
    	this.origem = "";
    	this.destino = destino;
    	this.dat_inicial = dat_inicial;
    	this.dataFim = dataFim;
    	this.dat_hora_pesquisa = LocalDateTime.now();
    }
    
    public Pesquisa(ArrayList<Voo> voos,String origem, String destino, LocalDateTime dat_inicial, LocalDateTime dataFim,
    		LocalDateTime dat_hora_pesquisa) {
    	//VOO
    	for(Voo h : voos) {
    		h.
    		for(Trecho_de_Voo l :h.getTrecho())
    		if(l.getDestino() == destino) {
    			this.voos.add(h);
    		}
    	}
    	
    	this.origem = origem;
    	this.destino = destino;
    	this.dat_inicial = dat_inicial;
    	this.dataFim = dataFim;
    	this.dat_hora_pesquisa = LocalDateTime.now();
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


	public LocalDateTime getDat_inicial() {
		return dat_inicial;
	}


	public void setDat_inicial(LocalDateTime dat_inicial) {
		this.dat_inicial = dat_inicial;
	}


	public LocalDateTime getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}


	public LocalDateTime getDat_hora_pesquisa() {
		return dat_hora_pesquisa;
	}


	public void setDat_hora_pesquisa(LocalDateTime dat_hora_pesquisa) {
		this.dat_hora_pesquisa = dat_hora_pesquisa;
	}
    
    
    

}
