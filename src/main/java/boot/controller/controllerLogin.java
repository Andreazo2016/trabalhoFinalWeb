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
		
			
		if(usuario.getisAdmin()){
			session.setAttribute("usuario_logado", usuario);
			//session.setAttribute("nome_user", usuario.getNome());
			
			return "redirect:/adm";
			}
		session.setAttribute("usuario_logado", usuario);
		return "index";
		
	 
	} 
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.removeAttribute("usuario_logado");
		session.removeAttribute("carroCompra");
		session.invalidate();
		return "redirect:/";
	}
	
	
	
}
