package boot.controller;



import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.dao.GameDAO;
import boot.model.Game;
import boot.service.testeLogin;

@Controller
public class controllerCentral {
	@Autowired
	private testeLogin serviceLogin;
	
	@RequestMapping("/")
	public String home(Model model) throws ClassNotFoundException{	
		return "index";
	}
	@RequestMapping("/adm")
	public String adm(){
		return "adm";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/user")
	public String user(){
		return "cadastro-usuario";
	}
	
	
	
	
}
