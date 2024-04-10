package dados;
import classesPrincipais.*;
import java.util.ArrayList;

public class DadosCliente {
    private ArrayList<Cliente> vetClientes = new ArrayList<Cliente>();

    public void cadastrar(Cliente c) {
        this.vetClientes.add(c); // ADICIONA O Cliente NO ARRAY
    }

    public void listar() {
        for (Cliente objeto : this.vetClientes) {
            objeto.mostrarDados();
            // método mostrarDados();
        }
    }

    // este método retorna o objeto Cliente caso encontrado, ou null,
    // caso não encontrado
    public Cliente buscar(String email) {
        Cliente c = null;
        for (Cliente objeto : this.vetClientes) {
            if (objeto.getEmail().equals(email)) {
                c = objeto;
                break;
            }
        }
        return c;
    }

    // este método usa o método buscar já implementado
    public boolean excluir(String email) {
        Cliente c = this.buscar(email);
        if (c != null) {
            this.vetClientes.remove(c);
            return true;
        } else {
            return false;
        }
    }
}
