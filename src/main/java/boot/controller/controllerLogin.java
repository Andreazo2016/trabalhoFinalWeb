package boot.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import boot.model.User;
import boot.repository.UserRepository;
@Controller
public class controllerLogin {
	
	@Autowired
	private UserRepository usuarioR;
	
	@RequestMapping("/loginUser")
	public String login(User user,HttpSession session,RedirectAttributes rm){
		
		User usuario =  usuarioR.findLoginAndSenha(user.getLogin(), user.getSenha()); 
		System.out.println(user.getLogin() );
		System.out.println(user.getSenha());
		
//		if(usuario.getLogin() == null || usuario.getSenha() == null){
//			return "error";
//		}
	
		if(usuario.getisAdmin()){
			session.setAttribute("usuario_logado", user);
			rm.addFlashAttribute("usuario_logado", user);
			return "redirect:/adm";
			}
		rm.addFlashAttribute("usuario_logado", user);
		session.setAttribute("usuario_logado", user);
		return "index";
		
	 
	} 
	
	
	
}
