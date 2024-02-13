/*Busca por hoteis, ATRIBUTOS: CNPJ, 
 *nome oficial, nome divulgacao, endereco completo, ano de criacao, 
 *nro de estrelas, aceita pets,nro total de quartos, horario do check-in e check-out. 
 *MÉTODOS: msg divulgacao exibida na busca e descricao(breve).*/

import java.util.Random;

public class Hotel extends Empresa {
	private String end_completo;
	private float nmr_estrelas;
	private boolean pets;
	private int nmr_quartos;
	private float check_in,check_out;
	private String cidade;
	
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
	public int getNmr_quartos() {
		return nmr_quartos;
	}
	public void setNmr_quartos(int nmr_quartos) {
		this.nmr_quartos = nmr_quartos;
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
	
	public String msg_divugacao() {
		Random rand = new Random();
        // Gerar um número inteiro aleatório entre 0 e 13
        int aleatorio = rand.nextInt(14); 
        switch (aleatorio) {
        case 0:
            return "Experimente o luxo e o conforto incomparável do nosso hotel!";
        case 1:
            return "Descubra uma estadia memorável em nosso hotel!";
        case 2:
            return "Venha se encantar com nossas vistas deslumbrantes e serviços de classe mundial.";
        case 3:
        	return "Relaxe, recarregue e rejuvenesça em nosso oásis de tranquilidade. Bem-vindo ao nosso hotel.";
        case 4:
        	return ("Sua escapada dos sonhos começa aqui! " + "Hotel: " + Float.toString(nmr_estrelas));
        case 5:
        	return "Celebre a vida e crie memórias inesquecíveis conosco.";
        case 6:
        	return "Reserve sua estadia conosco hoje mesmo!";
        case 7:
        	return "Descubra um mundo de elegância e sofisticação em nosso hotel.";
        case 8:
        	return "Sua jornada de bem-estar começa aqui.";
        case 9:
        	return "Acolhimento caloroso, experiências autênticas e momentos inesquecíveis";
        case 10:
        	return "Nossa missão é transformar sua estadia em uma experiência extraordinária.";
        case 11:
        	return "Venha descobrir o que nos torna únicos.";
        case 12:
        	return "Nosso hotel é o cenário perfeito para suas aventuras!";
        case 13:
        	return "Desfrute de uma hospitalidade impecável e uma experiência inesquecível.";
        default:
            return "";
        }
	}
	
	public String msg_descricao() {
		String descricao;
		descricao = "Bem-vindo ao nosso hotel!\n\n"
				+ "  Nome:" + 
	}
}
