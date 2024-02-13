
public class Quartos {
	private int singleDisponiveis;
    private int duplosDisponiveis;
    private int triplosDisponiveis;
    private int luxoDisponiveis;
    private float diariaSingle;
    private float diariaDuplo;
    private float diariaTriplo;
    private float diariaLuxo;
    private float desconto;
    private boolean aceitaCancelamento;
    private int ano;
    
    public Quartos(int singleDisponiveis, int duplosDisponiveis, int triplosDisponiveis, int luxoDisponiveis,
			float diariaSingle, float diariaDuplo, float diariaTriplo, float diariaLuxo, float desconto,
			boolean aceitaCancelamento, int ano) {
    	if(singleDisponiveis < 0) this.singleDisponiveis = 0;
    	else this.singleDisponiveis = singleDisponiveis;
		if(duplosDisponiveis < 0) this.duplosDisponiveis = 0;
		else this.duplosDisponiveis = duplosDisponiveis;
		if(triplosDisponiveis < 0) this.triplosDisponiveis = 0;
		else this.triplosDisponiveis = triplosDisponiveis;
		if(luxoDisponiveis < 0) this.luxoDisponiveis = 0;
		else this.luxoDisponiveis = luxoDisponiveis;
		this.diariaSingle = diariaSingle;
		this.diariaDuplo = diariaDuplo;
		this.diariaTriplo = diariaTriplo;
		this.diariaLuxo = diariaLuxo;
		this.desconto = desconto;
		this.aceitaCancelamento = aceitaCancelamento;
		if(ano < 2023) {
			this.ano = 2023;
		}
		this.ano = ano;
	}
       
    public int numero_quartos(){
    	return singleDisponiveis + duplosDisponiveis + triplosDisponiveis + luxoDisponiveis;
    }
	public int getSingleDisponiveis() {
		return singleDisponiveis;
	}
	public void setSingleDisponiveis(int singleDisponiveis) {
		this.singleDisponiveis = singleDisponiveis;
	}
	public int getDuplosDisponiveis() {
		return duplosDisponiveis;
	}
	public void setDuplosDisponiveis(int duplosDisponiveis) {
		this.duplosDisponiveis = duplosDisponiveis;
	}
	public int getTriplosDisponiveis() {
		return triplosDisponiveis;
	}
	public void setTriplosDisponiveis(int triplosDisponiveis) {
		this.triplosDisponiveis = triplosDisponiveis;
	}
	public int getLuxoDisponiveis() {
		return luxoDisponiveis;
	}
	public void setLuxoDisponiveis(int luxoDisponiveis) {
		this.luxoDisponiveis = luxoDisponiveis;
	}
	public float getDiariaSingle() {
		return diariaSingle;
	}
	public void setDiariaSingle(float diariaSingle) {
		this.diariaSingle = diariaSingle;
	}
	public float getDiariaDuplo() {
		return diariaDuplo;
	}
	public void setDiariaDuplo(float diariaDuplo) {
		this.diariaDuplo = diariaDuplo;
	}
	public float getDiariaTriplo() {
		return diariaTriplo;
	}
	public void setDiariaTriplo(float diariaTriplo) {
		this.diariaTriplo = diariaTriplo;
	}
	public float getDiariaLuxo() {
		return diariaLuxo;
	}
	public void setDiariaLuxo(float diariaLuxo) {
		this.diariaLuxo = diariaLuxo;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public boolean isAceitaCancelamento() {
		return aceitaCancelamento;
	}
	public void setAceitaCancelamento(boolean aceitaCancelamento) {
		this.aceitaCancelamento = aceitaCancelamento;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
   
   

    // Métodos para marcar quarto como ocupado/disponível, obter informações do quarto, etc.
}
