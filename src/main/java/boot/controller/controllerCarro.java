package boot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.CarroCompra;
import boot.model.Game;
import boot.model.User;
import boot.model.Venda;
import boot.repository.CarroRepository;
import boot.repository.GameRepository;
import boot.repository.VendaRepository;

@Controller
public class controllerCarro {
	
	@Autowired
	private GameRepository contatoR;
	@Autowired
	private VendaRepository vendaR;
	@Autowired
	private CarroRepository carroR;
	
	
	@RequestMapping("/addGameCarro/{id}")
	public String addProdutoCarro(HttpSession session, @PathVariable(value="id") long id){
		List<Game> lista;
		Game game =  contatoR.findGamebyId(id);
		CarroCompra carro = (CarroCompra) session.getAttribute("carroCompra");
		if(carro == null){
			carro = new CarroCompra();
			lista =  new ArrayList<Game>();
			lista.add(game);
			carro.setGames(lista);
			session.setAttribute("carroCompra", carro);
			System.out.println("carro nulo");
		}
		 lista = carro.getGames();
		 lista.add(game);
		 carro.setGames(lista);
		 session.setAttribute("carroCompra", carro);
		
		System.out.println("normal");

		String page = "/verGame/" + id;
		String url = "redirect:" + page;
		return url;
	}
	@RequestMapping("addCarro/{id}")
	public String addCarro(HttpSession session,@PathVariable(value ="id") long id){
		List<Game> lista;
		Game game =  contatoR.findGamebyId(id);
		User user = (User) session.getAttribute("usuario_logado");
		CarroCompra carro = (CarroCompra) session.getAttribute("carroCompra");
		if(carro == null){
			carro = new CarroCompra();
			lista =  new ArrayList<Game>();
			lista.add(game);
			carro.setGames(lista);
			session.setAttribute("carroCompra", carro);
			System.out.println("carro nulo");
		}
//		 lista = carro.getGames();
//		 lista.add(game);
//		// game.setCarrinho(carro);
//		 carro.setGames(lista);
//		 carro.setUser(user);
//		 user.setCarro(carro);
//		
//		 Venda venda = new Venda();
//		 venda.setCarro(carro);
//		 vendaR.save(venda);
		 return "redirect: /";
	}
	
	
}
