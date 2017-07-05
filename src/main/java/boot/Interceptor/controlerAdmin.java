package boot.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import boot.model.User;
@Component
public class controlerAdmin extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session  =  request.getSession();
		User user = (User) session.getAttribute("usuario_logado");
		String uri = request.getRequestURI();
		System.out.println(uri);
		if(uri.startsWith("/adm") && session.getAttribute("usuario_logado") == null){
			
			response.sendRedirect("/");
			return true;
		}else{
			
			if(uri.startsWith("/adm") && user.getisAdmin()){
			
				return true;
			}
		return true;
		
		}
		
		
	}

}
