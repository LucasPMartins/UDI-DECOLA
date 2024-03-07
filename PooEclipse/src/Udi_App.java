import java.util.ArrayList;

public class Udi_App {
    private ArrayList<Hotel> hoteisDisponiveis;
    private ArrayList<Voo> voosDisponiveis;
    private Pesquisa pesquisa;
    
    
    public Udi_App() {
        // Inicializa os arrays de hotéis e voos disponíveis
        hoteisDisponiveis = new ArrayList<>();
        voosDisponiveis = new ArrayList<>();
        // Adiciona os hotéis e voos disponíveis ao inicializar a aplicação
        inicializarHoteis();
        inicializarVoos();
    }

    private void inicializarHoteis() {
        // Adiciona os hotéis disponíveis ao array de hoteisDisponiveis
        // Implemente conforme necessário
    }

    private void inicializarVoos() {
        // Adiciona os voos disponíveis ao array de voosDisponiveis
        // Implemente conforme necessário
    }

    public ArrayList<Voo> realizarPesquisaVoo(String origem, String destino, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        // Realiza a pesquisa de hotéis e voos com base nos parâmetros fornecidos
        // Implemente conforme necessário
    	return pesquisa.getVoos();
    }
    
    public ArrayList<Hotel> realizarPesquisaHotel(String origem, String destino, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        // Realiza a pesquisa de hotéis e voos com base nos parâmetros fornecidos
        // Implemente conforme necessário
    	return pesquisa.getHotel();
    }


    public void fazerReservaHotel(Hotel hotel, int tipoQuarto, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        // Faz a reserva de um hotel com base no hotel selecionado, tipo de quarto e datas
        // Implemente conforme necessário
    }

    public void fazerReservaVoo(Voo voo, LocalDateTime dataPartida) {
        // Faz a reserva de um voo com base no voo selecionado e na data de partida
        // Implemente conforme necessário
    }

    // Outros métodos necessários para gerenciar o fluxo do programa
}
