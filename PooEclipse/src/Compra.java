
public class Compra{

    private Cliente cliente;
    private int qtdCompras; //quantidade de compras na operacao
    private Voo voo;
    private Hotel hotel;
    private int qtdComprasCliente //contador de compras feita pelo cliente
    private float valorFinal //valor final da compra

    public Compra(Cliente cliente, int qtdCompras, Voo voo, Hotel hotel){
        this.cliente = cliente;
        this.hotel = hotel;
        this.qtdCompras = qtdCompras;
        this.voo = voo;
    }

    public Boolean realizarCompra(Compra compra){
        if(qtdCompras <= 0){
            return false;
        }
        //valorFinal =

        qtdComprasCliente++;
    }
    return true;
}
