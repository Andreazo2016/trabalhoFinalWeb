package boot.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import boot.model.User;
import boot.repository.UserRepository;
@Controller
public class controllerLogin {
	
	@Autowired
	private UserRepository usuarioR;
	
	@RequestMapping("/login")
	public String login(User user,HttpSession session){
		
		User usuario = (User) usuarioR.findLoginAndSenha(user.getLogin(), user.getSenha()); 
		System.out.println(user.getLogin() );
		System.out.println(user.getSenha());
		if(usuario.getisAdmin()){
			session.setAttribute("usuario_logado", user);
			return "redirect:/adm";
		}
	session.setAttribute("usuario_logado", user);
		return "redirect:/";
		
	
	} 
	
	
	
}
