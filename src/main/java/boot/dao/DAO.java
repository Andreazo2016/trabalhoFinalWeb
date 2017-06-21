package boot.dao;

import java.sql.SQLException;
import java.util.List;

import boot.model.Game;

public interface DAO {
	void adicionarGame(Game game)  throws SQLException;
	void atualizarGame(Game game)  throws SQLException;
	void excluirGame(int id)  throws SQLException;
	List<Game> allGame()  throws SQLException;
}
