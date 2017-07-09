package boot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "carrinho")
public class CarroCompra  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codCarrinho;
	
	@OneToOne
	private User user;
	@OneToMany(mappedBy = "carrinho",targetEntity = Game.class,cascade = CascadeType.ALL)
	private List<Game> games;
	
	
	@JoinColumn(name="codCarrinho",referencedColumnName = "codVenda")
	private Venda venda;
	@NotNull
	private double preco;
	
	public CarroCompra() {
	
	}
	public long getCod_carro() {
		return this.codCarrinho;
	}
	public User getUser() {
		return this.user;
	}
	public double getPreco() {
		return preco;
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
		double preco = 0;
		for(Game g:games){
			preco += g.getPrecoGame();
		}
		setPreco(preco);
		this.games = games;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
}
