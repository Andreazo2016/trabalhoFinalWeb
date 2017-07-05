package boot.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerError {
	 @RequestMapping("/500")
	    public String internalServerError () {
	        return "index";
	    }
	
}
