package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerErro implements ErrorController {

	
	@RequestMapping(value ="/error")
	public String erroPage(HttpServletRequest req, Model model){
		String msgErro = "";
		int CodigoErro = getErrorCode(req);
		
		if(CodigoErro == 400){
			msgErro = " Desculpe Solicitação Imprópria";
			model.addAttribute("erro", msgErro);
			return "errorPage";
		}
		else if(CodigoErro == 401){
			msgErro = "Desculpe Você Não Está Autorizado";
			model.addAttribute("erro", msgErro);
			return "errorPage";
		}
		else if(CodigoErro == 404){
			msgErro = "Desculpe Não Conseguimos Encontrar o Que Você Requisitou";
			model.addAttribute("erro", msgErro);
			return "errorPage";
		}
		else if(CodigoErro == 500){
			msgErro = "Desculpe Tivemos um Error no Servidor. Contate o Administrador do Sistema";
			model.addAttribute("erro", msgErro);
			return "errorPage";
		}
		
		else{
			model.addAttribute("erro", msgErro);
			return "errorPage";	
		}
	}
	
	private int getErrorCode(HttpServletRequest httpRequest) {
		return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
	}
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
