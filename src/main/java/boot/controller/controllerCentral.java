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
import boot.model.Item;
import boot.model.User;
import boot.model.Venda;
import boot.repository.CarroRepository;
import boot.repository.GameRepository;
import boot.repository.UserRepository;
import boot.repository.VendaRepository;
import boot.service.testeLogin;

@Controller
public class controllerCentral {
	@Autowired
	private UserRepository usuarioR;
	@Autowired
	private CarroRepository rep;
	@Autowired
	private VendaRepository vR;
	@Autowired
	private GameRepository gR;
	@RequestMapping("/")
	public String home() throws ClassNotFoundException{	
		
		return "index";
	}
	@RequestMapping("/adm")
	public String adm(){
		return "adm";
	}
//	@RequestMapping("/addCarro")
//	public String carro(){
//		CarroCompra carro = new CarroCompra();
//		Venda v = new Venda();
//		Game game =  new Game(null,"the Last",123,"PC","/URl");
//		Item iten = new Item();
//		User user = new User();
//		List<Item> lista = new ArrayList<Item>();
//		user.setCpf("100.001.001.-31");
//		user.setNome("Amdreazo");
//		user.setEndereco("Solonopole");
//		user.setEmail("andreazo@gami.com");
//		user.setisAdmin(true);
//		user.setLogin("solon");
//		user.setSenha("123");
//		
//		iten.setGame(game);
//		iten.setQtd_produto(3);
//		iten.setCarro(carro);
//		lista.add(iten);
//		carro.setItens(lista);
//		usuarioR.save(user);
//		carro.setUser(user);
//		carro.setUser(user);
//		carro.setVenda(v);
//		v.setCarro(carro);
//		//game.setCarrinho(carro);
//		gR.save(game);
//		rep.save(carro);
//		vR.save(v);
//		
//		return "index";
//		
//		
//	}
//	

	
	
}
