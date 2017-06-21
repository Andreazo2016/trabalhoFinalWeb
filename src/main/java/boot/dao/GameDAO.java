package boot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import boot.dao.connectionFactory;
import boot.model.Game;

public class GameDAO implements DAO{
	
	Connection con;
	public GameDAO() throws ClassNotFoundException, SQLException {
		con = new connectionFactory().getConnection();
	}
@Override
public void adicionarGame(Game game) throws SQLException {
	
	String sql = "insert into  game (nome_game,preco_game,categoria_game) values (?,?,?)";
	PreparedStatement pre = con.prepareStatement(sql);
	pre.setString(1, game.getNomeGame());
	pre.setFloat(2, game.getPrecoGame());
	pre.setString(3,game.getCategoriaGame());
	pre.executeUpdate();
	pre.close();
	con.close();
	
	
	
}

@Override
public void atualizarGame(Game game) {
	
	try {
		
		String sql = "update game set nome_game = ?, preco_game = ?, categoria_game = ? where cod_game = ?";
		PreparedStatement pre = con.prepareStatement(sql);
		pre.setString(1, game.getNomeGame());
		pre.setFloat(2, game.getPrecoGame());
		pre.setString(3, game.getCategoriaGame());
		pre.setLong(4, game.getCodGame());
		
		pre.executeUpdate();
		pre.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Override
public void excluirGame(int id) {
	
	try {
		List<Game> listaGame =  new ArrayList<Game>();
		String sql = "delete from game where cod_game = " + id;
		PreparedStatement pre = con.prepareStatement(sql);
		pre.executeUpdate();
		pre.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

@Override
public List<Game> allGame() throws SQLException {
	List<Game> listaGame =  new ArrayList<Game>();
	String sql = "select * from game";
	PreparedStatement pre = con.prepareStatement(sql);
	ResultSet resul = pre.executeQuery();
	while(resul.next()){
		Game g = new Game();
		g.setCodGame(resul.getInt("cod_game"));
		g.setCategoriaGame(resul.getString("categoria_game"));
		g.setNomeGame(resul.getString("nome_game"));
		g.setPrecoGame(resul.getFloat("preco_game"));
		listaGame.add(g);
	}
	pre.close();
	con.close();
	return listaGame;
}

}
