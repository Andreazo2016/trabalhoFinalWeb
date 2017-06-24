
package boot.controller;

import java.util.*;

import javax.naming.Binding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.dao.GameDAO;
import boot.model.Game;
import boot.repository.GameRepository;
import boot.service.GameService;

@Controller
public class controllerGame {
	
	
	
	@Autowired
	private GameRepository contatoR;

	@RequestMapping("/Game/add")
	public String cadastrarGame(@Valid Game game, BindingResult result) throws ClassNotFoundException, SQLException{
		if(result.hasErrors()){
			return "erro";
		}
		//funcionando inserindo no banco de dados
		System.out.println("ID Chegando:" + game.getCodGame());
		 contatoR.save(game);
		//new GameDAO().adicionarGame(game);
		return "redirect:/adm";
	}
	@RequestMapping("/Game/{id}/delete")
	public String deletarGame(Model model,@PathVariable(value = "id") int id) throws ClassNotFoundException, SQLException{
		contatoR.delete(new Game(id));
		 return "redirect:/adm";
		
	}
	
	@RequestMapping("/Game/update")
	public String updateGame(Game game) throws ClassNotFoundException, SQLException{
		contatoR.save(game);
		return "redirect:/adm";
	}
	@RequestMapping("/GameCategoria/{categoria}")
	@ResponseBody
	public List<Game> GameCategoria(@PathVariable(value = "categoria") String categoria){
		return contatoR.findGameByCategoria(categoria);
		
	}
	@RequestMapping("/Game")
	@ResponseBody
	public List<Game> getAllGame() throws ClassNotFoundException, SQLException{
		//return new GameDAO().allGame();
		return contatoR.findAll();
	}
	
	@RequestMapping("/verGame")
	public String verGame(){
		return "ver_produtos";
	}
	
}
