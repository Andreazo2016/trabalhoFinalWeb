package boot.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import boot.dao.GameDAO;
import boot.dao.GameJPA;
import boot.model.Game;

@Component
public class GameService {

	public String addGame(Game game) throws ClassNotFoundException{
		
		
		try {
			
			new GameJPA().adicionarGame(game);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "adm";
		
	}
	
	public boolean updateGame(Game game){
		try {
			new GameDAO().atualizarGame(game);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
	public boolean deleteGame(int id){
		try {
			new GameDAO().excluirGame(id);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public List<Game> allGame(){
		try {
			return new GameDAO().allGame();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
