package boot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ForeignKey;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name ="game")

public class Game implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="codGame")
	private Integer codGame;
	@NotNull
	@Size(max= 15 , message ="Valor muito alto")
	private String nomeGame;
	
	@NotNull
	private float precoGame;

	@NotNull
	private String categoriaGame;
	
	private String url;
	
	
	

	

	public Game(){

	}
	public Game(Integer id,String nome,float preco, String descricao,String url){
		this.codGame = id;
		this.nomeGame = nome;
		this.precoGame = preco;
		this.categoriaGame = descricao;
		this.url = url;
	}
	public Game(Integer id){
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
	public String getUrl() {
		return this.url;
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
	public void setUrl(String url) {
		this.url = url;
	}
	

	@Override
	public String toString() {

		return "Game [id=" + this.codGame + ", nome=" + this.nomeGame + ", preco=" + this.precoGame + ", categoria=" + this.categoriaGame + "]";
	}
}
