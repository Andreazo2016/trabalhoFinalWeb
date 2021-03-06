package boot.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

@Entity(name = "usuario")
public class User implements Serializable{

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id;
	@Id
	@Column(name = "cpf_user")
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String email;
	@NotNull
	private String endereco;
	private boolean isAdmin = false;
	@NotNull
	private String login;
	@NotNull
	private String senha;
	
	
	
//	public long getId() {
//		return id;
//	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
	public boolean getisAdmin(){
		return this.isAdmin;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setisAdmin(boolean isAdmin){
		 this.isAdmin = isAdmin;
 	}
	public String getLogin() {
		return this.login;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public String toString() {
		return "Game [id=" + this.cpf + ",login=" + this.login + "senha=" + this.senha + ", nome=" + this.nome + ", email=" + this.email + ", endereco=" + this.endereco + "]";
	}

}
