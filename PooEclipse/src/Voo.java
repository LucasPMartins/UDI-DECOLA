
public class Voo {
	private Data data;
	private Tempo hora_programada_chegada;
	private Tempo hora_programada_partida;
	private int nro_vagas_disponiveis;
	private Trecho_de_Voo trecho;
	private float preco_da_passagem;
	
	
    public Voo(Data data, Tempo hora_programada_chegada, Tempo hora_programada_partida, int nro_vagas_disponiveis,
			Trecho_de_Voo trecho, float preco_da_passagem) {
		this.data = data;
		this.hora_programada_chegada = hora_programada_chegada;
		this.hora_programada_partida = hora_programada_partida;
		this.nro_vagas_disponiveis = nro_vagas_disponiveis;
		this.trecho = trecho;
		this.preco_da_passagem = preco_da_passagem;
	}

	public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Tempo getHora_programada_chegada() {
        return hora_programada_chegada;
    }

    public void setHora_programada_chegada(Tempo hora_programada_chegada) {
        this.hora_programada_chegada = hora_programada_chegada;
    }

    public Tempo getHora_programada_partida() {
        return hora_programada_partida;
    }

    public void setHora_programada_partida(Tempo hora_programada_partida) {
        this.hora_programada_partida = hora_programada_partida;
    }

    public int getNro_vagas_disponiveis() {
        return nro_vagas_disponiveis;
    }

    public void setNro_vagas_disponiveis(int nro_vagas_disponiveis) {
        this.nro_vagas_disponiveis = nro_vagas_disponiveis;
    }
    
    public float getPreco_da_passagem() {
        return preco_da_passagem;
    }

    public void setPreco_da_passagem(float preco_da_passagem) {
        this.preco_da_passagem = preco_da_passagem;
    }

	public Trecho_de_Voo getTrecho() {
		return trecho;
	}

	public void setTrecho(Trecho_de_Voo trecho) {
		this.trecho = trecho;
	}
    
    
}
