package boot.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String addProdutoCarro(HttpSession session, @PathVariable(value="id") long id,RedirectAttributes rm){
		User user = (User) session.getAttribute("usuario_logado");
		if(user == null){
			rm.addFlashAttribute("ver1", "failed");
			rm.addFlashAttribute("msg-carro", "Não foi possivel Adicionar ao Carrinho!");
			String page = "/verGame/" + id;
			String url = "redirect:" + page;
			return url;
		}
		List<Item> lista;
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
		session.setAttribute("gameConfirmacao", game);
		
		System.out.println("normal");


		String page = "/verGame/" + id;
		String url = "redirect:" + page;
		return url;
	}
	@RequestMapping("addCarro")
	public String addCarro(HttpSession session,@RequestParam(value = "codGame") long codGame,@RequestParam(value = "qtd_produto") int qtd_produto,RedirectAttributes rm){
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
			session.removeAttribute("carroCompra");
			rm.addFlashAttribute("msgError", "Compra Realizada com sucesso!");
		 return "venda";
	}
	@RequestMapping("vendaCarro")
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
	public String vendaCarro(HttpSession session,RedirectAttributes rm){
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
		rm.addFlashAttribute("teste", "failed");
		rm.addFlashAttribute("nomeComprador", carro.getUser().getNome());
		rm.addFlashAttribute("msgError", "Compra Realizada com sucesso!");
		session.removeAttribute("carroCompra");
		return "venda";
		
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
	@RequestMapping("removeGameCarro/{id}")
	public String removeGameCarro(HttpSession session ,@PathVariable(value = "id") long id,RedirectAttributes rm){
		CarroCompra carro  =  (CarroCompra) session.getAttribute("carroCompra");
		List<Item> itens = carro.getItens();
		for(Iterator<Item> l = itens.iterator();l.hasNext();){
			Item iten = l.next();
			if(iten.getGame().getCodGame() == id){
				l.remove();
				break;
			}
			
		}
//		for(Item i: itens){
//			if(i.getGame().getCodGame() == id){
//				itens.remove(i);
//			}
//		}
		carro.setItens(itens);
		session.setAttribute("carroCompra", carro);
		rm.addFlashAttribute("msg", "Game Removido com Sucesso!");
		String page = "/verGame/" + id;
		String url = "redirect:" + page;
		return url;
		
	}

	
	
	
}
