package boot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionFactory {
	private String url = "jdbc:postgresql://localhost:5432/trabalho_final";
	private String user = "postgres";
	private String password = "postgres";
	
	public Connection getConnection () throws SQLException, ClassNotFoundException{
		System.out.println("conexao realizada com sucesso!");
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(url, user, password);
	}

}
