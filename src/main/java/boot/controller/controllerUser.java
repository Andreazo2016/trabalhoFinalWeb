package boot.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import boot.dao.GameDAO;
import boot.service.testeLogin;

@Controller
public class controllerUser {
	@Autowired
	private testeLogin serviceLogin;
	
	
	@RequestMapping("/validarUser")
	public String validarUser(Model model,@RequestParam(value = "user") String user,@RequestParam(value = "senha") String senha) throws ClassNotFoundException, SQLException{
			
			return serviceLogin.teste(user, senha);
	}

	@RequestMapping("/CadastroUser")
	@ResponseBody
	public String cadastrarUser(Model model,@RequestParam(value = "user_cpf") String cpf,@RequestParam(value = "user_name") String nome,@RequestParam(value="user_email") String email,@RequestParam(value = "user_endereco") String endereco){
		
		return "teste";
	}
	
	
}
