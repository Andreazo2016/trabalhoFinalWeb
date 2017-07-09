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
public class CarroCompra implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codCarro")
	private long codCarrinho;
	
	@OneToOne
	@JoinColumn(name = "cpf_user") 
	private User user;
	
	@OneToMany(mappedBy = "carrinho", targetEntity = Item.class,cascade = CascadeType.ALL)
	private List<Item> itens;
	
	
	@JoinColumn(name="codCarro")
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
	public List<Item> getItens() {
		return this.itens;
	}
	public void setCod_carro(long cod_carro) {
		this.codCarrinho = cod_carro;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setItens(List<Item> itens) {
		double preco = 0;
		for(Item i:itens){
			preco += i.getQtd_produto() * i.getGame().getPrecoGame(); 
		}
		setPreco(preco);
		 this.itens = itens;
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
