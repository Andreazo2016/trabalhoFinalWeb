package boot.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.dao.GameDAO;
import boot.model.User;
import boot.repository.UserRepository;
import boot.service.testeLogin;

@Controller
public class controllerUser {
	@Autowired
	private UserRepository usuario;
	
	
	

	@RequestMapping("/CadastroUser")
	public String cadastrarUser(HttpSession session,@Valid User user){
		 usuario.save(user);
		 session.setAttribute("usuario_logado", user);
		 return "redirect:/";
	}
	
	
}
