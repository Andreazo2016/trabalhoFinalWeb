package boot.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.CarroCompra;
import boot.model.Game;
import boot.model.Item;
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
		List<Item> lista;
		User user = (User) session.getAttribute("usuario_logado");
		Game game =  contatoR.findGamebyId(id);
		Item item =  new Item();
		CarroCompra carro = (CarroCompra) session.getAttribute("carroCompra");
		if(carro == null){
			carro = new CarroCompra();
			lista =  new ArrayList<Item>();
			item.setGame(game);
			item.setQtd_produto(1);
			item.setCarro(carro);
			lista.add(item);
			carro.setItens(lista);
			carro.setUser(user);
			carro.setCod_carro(0);
			item.setId(0);
			session.setAttribute("carroCompra", carro);
			
			System.out.println("carro nulo");
		}
		item.setGame(game);
		item.setCarro(carro);
		item.setQtd_produto(1);
		lista = carro.getItens();
		if(!lista.contains(item)){
		lista.add(item);
		}
		carro.setItens(lista);
		carro.setUser(user);
		session.setAttribute("carroCompra", carro);
		
		System.out.println("normal");


		String page = "/verGame/" + id;
		String url = "redirect:" + page;
		return url;
	}
	@RequestMapping("addCarro")
	public String addCarro(HttpSession session,@RequestParam(value = "codGame") long codGame,@RequestParam(value = "qtd_produto") int qtd_produto){
		User user = (User) session.getAttribute("usuario_logado");
		Game game = contatoR.findGamebyId(codGame);
		CarroCompra carro  = new CarroCompra();
		List<Item> lista = new ArrayList<Item>();
		Venda v = new Venda();
		Item item = new Item();
		item.setGame(game);
		item.setQtd_produto(qtd_produto);
		item.setCarro(carro);
				
			lista.add(item);
			carro.setItens(lista);
			carro.setUser(user);
			carro.setVenda(v);
			v.setCarro(carro);
			carroR.save(carro);
			vendaR.save(v);
			
		 return "index";
	}
	@RequestMapping("vendaCarro")
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
	public String vendaCarro(HttpSession session){
		CarroCompra carro  = (CarroCompra) session.getAttribute("carroCompra");
		System.out.println("Cod Carro "+carro.getCod_carro());
		Venda venda =  new Venda();
		Calendar c = Calendar.getInstance();
		for(Item i : carro.getItens()){
			i.setId(0);
			System.out.println("prodtu " + i.getGame().getNomeGame());
		}
		carro.setCod_carro(0);
		venda.setCarro(carro);
		venda.setDataVenda(c);
		carro.setVenda(venda);
		carroR.save(carro);
		vendaR.save(venda);
		return "index";
		
	}
	
	@RequestMapping("/addGameData")
	public String addGameData(HttpSession session,@RequestParam(value ="id") long id,@RequestParam(value ="data") String data) throws ParseException{
		List<Item> lista;
		User user = (User) session.getAttribute("usuario_logado");
		Game game =  contatoR.findGamebyId(id);
		Item item =  new Item();
		CarroCompra carro = (CarroCompra) session.getAttribute("carroCompra");
		if(carro == null){
			carro = new CarroCompra();
			lista =  new ArrayList<Item>();
			item.setGame(game);
			item.setQtd_produto(1);
			item.setCarro(carro);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			 String convertedCurrentDate =sdf.format(sdf.parse(data));
			 System.out.println(convertedCurrentDate);
			item.setFimALuguel(data);
			lista.add(item);
			carro.setItens(lista);
			carro.setUser(user);
			carro.setCod_carro(0);
			item.setId(0);
			session.setAttribute("carroCompra", carro);
			
			System.out.println("carro nulo");
		}
		item.setGame(game);
		item.setCarro(carro);
		item.setQtd_produto(1);
		item.setFimALuguel(data);
		lista = carro.getItens();
		if(!lista.contains(item)){
		lista.add(item);
		}
		carro.setItens(lista);
		carro.setUser(user);
		session.setAttribute("carroCompra", carro);
		
		System.out.println("normal");
		String page = "/verGame/" + id;
		String url = "redirect:" + page;
		return url;
		
		
	}

	
	
	
}
