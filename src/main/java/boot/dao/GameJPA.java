package boot.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import boot.model.Game;
import boot.repository.GameRepository;


public class GameJPA implements DAO {
	
	@Autowired
	private GameRepository contatoR;

	@Override
	public void adicionarGame(Game game) throws SQLException {
		System.out.println(game.toString());
	
		contatoR.save(game);
		
	}

	@Override
	public void atualizarGame(Game game) throws SQLException {
		contatoR.save(game);
		
	}

	@Override
	public void excluirGame(int id) throws SQLException {
		contatoR.delete(new Game(id));
		
	}

	@Override
	public List<Game> allGame() throws SQLException {
		 Iterable<Game> lista = contatoR.findAll( 
				new Sort(new Sort.Order(Sort.Direction.ASC, "nome")));
		 List<Game> l = (List<Game>) lista;
		return l;
	}

}
