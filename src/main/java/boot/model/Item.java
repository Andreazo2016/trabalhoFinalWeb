package boot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		@OneToOne
		@JoinColumn(name = "codGame")
		private Game game;
		
		@ManyToOne(optional = false)
		@JoinColumn(name="codCarro",referencedColumnName = "codcarro")
		private CarroCompra carrinho;
		
		int qtd_produto;
		
		private String fimALuguel;
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public Game getGame() {
			return game;
		}
		public void setGame(Game game) {
			this.game = game;
		}
		public int getQtd_produto() {
			return qtd_produto;
		}
		public void setQtd_produto(int qtd_produto) {
			this.qtd_produto = qtd_produto;
		}
		public CarroCompra getCarro() {
			return carrinho;
		}
		public void setCarro(CarroCompra carro) {
			this.carrinho = carro;
		}
		public String getFimALuguel() {
			return fimALuguel;
		}
		public void setFimALuguel(String fimALuguel) {
			this.fimALuguel = fimALuguel;
		}
}
