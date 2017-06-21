package boot.model;

public class User {
	private String cpf;
	private String nome;
	private String email;
	private String endereco;
	private boolean isAdmin =  false;
	private String login;
	private String senha;
	
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

}
