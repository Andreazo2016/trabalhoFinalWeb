package boot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class GameAlugavel {
	@Id
	@GeneratedValue
	private Integer codGame;
	@NotNull
	@Size(max= 15 , message ="Valor muito alto")
	private String nomeGame;

	@NotNull
	private float precoGame;

	@NotNull
	private String categoriaGame;
	
	@NotNull
	private Date fimALuguel;

	public GameAlugavel(){

	}
	public GameAlugavel(Integer id,String nome,float preco, String descricao){
		this.codGame = id;
		this.nomeGame = nome;
		this.precoGame = preco;
		this.categoriaGame = descricao;
	}
	public GameAlugavel(Integer id){
		this.codGame = id;
	}


	public Integer getCodGame() {
		return codGame;
	}
	public String getNomeGame() {
		return nomeGame;
	}
	public float getPrecoGame() {
		return precoGame;
	}
	public String getCategoriaGame() {
		return categoriaGame;
	}
	public Date getFimALuguel() {
		return this.fimALuguel;
	}
	public void setCodGame(Integer codGame) {
		this.codGame = codGame;
	}
	public void setNomeGame(String nomeGame) {
		this.nomeGame = nomeGame;
	}
	public void setPrecoGame(float precoGame) {
		this.precoGame = precoGame;
	}
	public void setCategoriaGame(String categoriaGame) {
		this.categoriaGame = categoriaGame;
	}
	public void setFimALuguel(Date fimALuguel) {
		this.fimALuguel = fimALuguel;
	}
	
	@Override
	public String toString() {

		return "Game [id=" + this.codGame + ", nome=" + this.nomeGame + ", preco=" + this.precoGame + ", categoria=" + this.categoriaGame + "]";
	}

}
