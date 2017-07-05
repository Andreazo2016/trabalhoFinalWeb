package boot.Interceptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class ConfigIntercepts extends WebMvcConfigurerAdapter{
	
	@Autowired
	private controlerAdmin AdminIntercept;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(AdminIntercept).addPathPatterns("/adm");
		//registry.addInterceptor(new Intercept());
	}
}
