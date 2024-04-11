package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaCliente {
	
    public static void main(String[] args) {
    	
    	
    	String url = "jdbc:postgresql://localhost:5432/postgres";
    	String user = "postgres";
    	String password = "123";
    	
    	 try (Connection conn = Conexao.conectar(url,user,password);
                 Statement stmt = conn.createStatement()) {
                String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                             "cpf VARCHAR(20) PRIMARY KEY," +
                             "nome VARCHAR(100)," +
                             "email VARCHAR(100)," +
                             "endereco VARCHAR(200)," +
                             "nascimento DATE" +
                             ")";
                stmt.executeUpdate(sql);
                System.out.println("Tabela cliente criada com sucesso.");
            } catch (SQLException e) {
                System.err.println("Erro ao criar tabela cliente: " + e.getMessage());
            }
    	 
    	 
    	
    	
    	Conexao conex = new Conexao(url, user, password);
        
        String sql = "INSERT into cliente (cpf, nome, email, endereco, nascimento)" + 
        " values ('193.879.002-43','JAMAL 1', "+" 'jamalPaiva@ufu.br','Vila do chaves', '01/10/2003')";
        
        int res = conex.executaSQL(sql);
        if(res > 0)
            System.out.println("Cadastrado com sucesso!!");
        else
            System.out.println("Erro cadastro");
            	
    

    }
}

