package boot.ui;

import boot.model.CarroCompra;
import boot.model.Game;
import boot.model.User;

public class persistencia {
	public static void main(String[] args) {
		CarroCompra carrinho = new CarroCompra();
		Game game =  new Game();
		User u = new User();
		u.setCpf("06121699361");
		u.setNome("Andreazo");
		u.setEmail("andreazo@gmail.com");
		u.setEndereco("Solonopole");
		u.setLogin("andre");
		u.setSenha("solon");
		carrinho.setUser(u);
		game.setNomeGame("Last");
		game.setPrecoGame(234);
		game.setCategoriaGame("PC");
		
		carrinho.addProdutoToList(game);
		new teste().add(carrinho);
		
		
	}
}
