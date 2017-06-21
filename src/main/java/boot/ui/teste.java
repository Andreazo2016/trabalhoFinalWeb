package boot.ui;

import java.sql.SQLException;

import boot.dao.connectionFactory;

public class teste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new connectionFactory().getConnection();

	}

}
