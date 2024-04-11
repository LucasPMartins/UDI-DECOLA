package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaCliente {
	
    public static void main(String[] args) {
    	
        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                         "cpf VARCHAR(20) PRIMARY KEY," +
                         "nome VARCHAR(100)," +
                         "email VARCHAR(100)," +
                         "data_cadastro DATE," +
                         "endereco VARCHAR(200)," +
                         "nascimento DATE," +
                         "virou_vip TIMESTAMP," +
                         "desconto FLOAT," +
                         "vip BOOLEAN" +
                         ")";
            stmt.executeUpdate(sql);
            System.out.println("Tabela cliente criada com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela cliente: " + e.getMessage());
        }
    }
}

