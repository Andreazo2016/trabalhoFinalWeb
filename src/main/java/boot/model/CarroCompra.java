package boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "carrinho")
public class CarroCompra   {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codCarrinho;
	@OneToOne
	private User user;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Game> games;
	
	public CarroCompra() {
		games = new ArrayList<Game>();
	}
	public long getCod_carro() {
		return this.codCarrinho;
	}
	public User getUser() {
		return this.user;
	}
	public List<Game> getGames() {
		return this.games;
	}
	public void setCod_carro(long cod_carro) {
		this.codCarrinho = cod_carro;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public void  addProdutoToList(Game game){
		this.games.add(game);
	}
}
