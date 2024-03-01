/*Busca por hoteis, ATRIBUTOS: CNPJ, 
 *nome oficial, nome divulgacao, endereco completo, ano de criacao, 
 *nro de estrelas, aceita pets,nro total de quartos, horario do check-in e check-out. 
 *MÉTODOS: msg divulgacao exibida na busca e descricao(breve).*/

import java.util.ArrayList;

public class Hotel extends Empresa {
	private String end_completo;
	private float nmr_estrelas;
	private boolean pets;
	private Tempo check_in;
	private Tempo check_out;
	private String cidade;
	private String msg_divulgacao;
	private ArrayList<Quarto> quarto;
	
	public Hotel(String cnpj, String nome_oficial, String nome_divulgacao, Data data_criacao, String end_completo,
			float nmr_estrelas, boolean pets, Tempo check_in, Tempo check_out, String cidade, String msg_divulgacao) {
		super(cnpj, nome_oficial, nome_divulgacao, data_criacao);
		this.end_completo = end_completo;
		this.nmr_estrelas = nmr_estrelas;
		this.pets = pets;
		this.check_in = check_in;
		this.check_out = check_out;
		this.cidade = cidade;
		this.msg_divulgacao = msg_divulgacao;
		this.quarto = new ArrayList<Quarto>();
	}

	public String msg_descricao() {
		return ("Endereço: "+getEnd_completo()+"\tCidade: "+getCidade()+"\nPermitido PETS:"+isPets()+"\tEstrelas: "+getNmr_estrelas()+"\nCheck-in: "+getCheck_in()+"\tCheck-out: "+getCheck_out());
	}

	public String getEnd_completo() {
		return end_completo;
	}

	public void setEnd_completo(String end_completo) {
		this.end_completo = end_completo;
	}

	public float getNmr_estrelas() {
		return nmr_estrelas;
	}

	public void setNmr_estrelas(float nmr_estrelas) {
		this.nmr_estrelas = nmr_estrelas;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public Tempo getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Tempo check_in) {
		this.check_in = check_in;
	}

	public Tempo getCheck_out() {
		return check_out;
	}

	public void setCheck_out(Tempo check_out) {
		this.check_out = check_out;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getMsg_divulgacao() {
		return msg_divulgacao;
	}

	public void setMsg_divulgacao(String msg_divulgacao) {
		this.msg_divulgacao = msg_divulgacao;
	}

	public ArrayList<Quarto> getQuarto() {
		return quarto;
	}

	public void setQuarto(ArrayList<Quarto> quarto) {
		this.quarto = quarto;
	}
	  
	public int total_quartos() {
		return quarto.size();
	}
	
	public int quartos_disponiveis() {
		int count = 0;
		for(Quarto q : quarto ) {
			if(q.isDisponivel()) {
				count++;
			}
		}
		return count;
	}

	public int quartos_disponiveis(Data data) {
		int count = 0;
		for(Quarto q : quarto ) {
			if(q.isDisponivel() && q.getData().equals(data)) {
				count++;
			}
		}
		return count;
	}
	
	
}
