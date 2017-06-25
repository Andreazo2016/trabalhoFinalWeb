package boot.controller;



import java.sql.SQLException;
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
import boot.model.Game;
import boot.model.User;
import boot.repository.UserRepository;
import boot.service.testeLogin;

@Controller
public class controllerCentral {
	@Autowired
	private UserRepository usuarioR;
	
	@RequestMapping("/")
	public String home() throws ClassNotFoundException{	
		
		return "index";
	}
	@RequestMapping("/adm")
	public String adm(){
		return "adm";
	}
	

	
	
}
