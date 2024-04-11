package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
    private static final String URL = "jdbc:postgresql://localhost:5432/banco_cliente";
    private static final String USER = "1";
    private static final String PASSWORD = "1";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void fechar(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

	
	/*
	public Connection getConnection() throws SQLException{
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco_cliente", "postgres", "1");
		return conexao;
	}
	*/
}