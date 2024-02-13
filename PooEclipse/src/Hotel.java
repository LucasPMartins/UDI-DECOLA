/*Busca por hoteis, ATRIBUTOS: CNPJ, 
 *nome oficial, nome divulgacao, endereco completo, ano de criacao, 
 *nro de estrelas, aceita pets,nro total de quartos, horario do check-in e check-out. 
 *MÉTODOS: msg divulgacao exibida na busca e descricao(breve).*/

import java.util.ArrayList;

public class Hotel extends Empresa {
	private String end_completo;
	private float nmr_estrelas;
	private boolean pets;
	private float check_in,check_out;
	private String cidade;
	private String msg_divulgacao;
	private String msg_descricao;
	private ArrayList<Quartos> quartos;
	  
	//Construtor
	public Hotel(String cnpj, String nome_oficial, String nome_divulgacao, String data_criacao, String end_completo,
			float nmr_estrelas, boolean pets, float check_in, float check_out, String cidade, String msg_divulgacao,
			String msg_descricao, Quartos quartos) {
		super(cnpj, nome_oficial, nome_divulgacao, data_criacao);
		this.end_completo = end_completo;
		this.nmr_estrelas = nmr_estrelas;
		this.pets = pets;
		this.check_in = check_in;
		this.check_out = check_out;
		this.cidade = cidade;
		this.msg_divulgacao = msg_divulgacao;
		this.msg_descricao = msg_descricao;
		this.quartos = new ArrayList<>();
        this.quartos.add(quartos);
	}
	
	public void addQuartos(Quartos quartos) {
	    for (Quartos quartoExistente : this.quartos) {
	        if (quartos.getAno() == quartoExistente.getAno()) {
	            // Se os quartos já existem para o mesmo ano
	        	System.out.println("Já existe um quarto para o ano " + quartos.getAno());
	            return; // Não precisa continuar o loop
	        }
	    }
	    // Se nenhum dos quartos com o mesmo ano foi encontrado, adiciona novos quartos à lista
	    this.quartos.add(quartos);
	}	

	public String getMsg_descricao() {
		return msg_descricao;
	}
	public void setMsg_descricao(String msg_descricao) {
		this.msg_descricao = msg_descricao;
	}
	public String getMsg_divulgacao() {
		return msg_divulgacao;
	}
	public void setMsg_divulgacao(String msg_divulgacao) {
		this.msg_divulgacao = msg_divulgacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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
	public float getCheck_in() {
		return check_in;
	}
	public void setCheck_in(float check_in) {
		this.check_in = check_in;
	}
	public float getCheck_out() {
		return check_out;
	}
	public void setCheck_out(float check_out) {
		this.check_out = check_out;
	}
	
}
