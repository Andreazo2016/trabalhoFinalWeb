package boot.controller;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.dao.GameDAO;
import boot.model.CarroCompra;
import boot.model.Game;
import boot.model.User;
import boot.repository.CarroRepository;
import boot.repository.UserRepository;
import boot.service.testeLogin;

@Controller
public class controllerCentral {
	@Autowired
	private UserRepository usuarioR;
	@Autowired
	private CarroRepository rep;
	
	@RequestMapping("/")
	public String home() throws ClassNotFoundException{	
		
		return "index";
	}
	@RequestMapping("/adm")
	public String adm(){
		return "adm";
	}
	@RequestMapping("/addCarro")
	public String carro(){
		CarroCompra carro = new CarroCompra();
		Game game =  new Game(null,"the Last",123,"PC","/URl");
		User user = new User();
		List<Game> lista = new ArrayList<Game>();
		user.setCpf("100.001.001.-31");
		user.setNome("Amdreazo");
		user.setEndereco("Solonopole");
		user.setEmail("andreazo@gami.com");
		user.setisAdmin(true);
		user.setLogin("solon");
		user.setSenha("123");
		lista.add(game);
		carro.setPreco(123);
		carro.setGames(lista);
		carro.setUser(user);
		user.setCarro(carro);
		game.setCarrinho(carro);
		
		rep.save(carro);
		
		return "index";
		
		
	}
	

	
	
}
