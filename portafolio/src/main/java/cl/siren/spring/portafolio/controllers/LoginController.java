package cl.siren.spring.portafolio.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
    public ModelAndView mostrarLogin() {
        return new ModelAndView("login");
    }
	
	@PostMapping(value = "/login")
    public ModelAndView mostrarLogin_() {
        return new ModelAndView("login");
    }
	
	@RequestMapping(value = "/error")
    public ModelAndView errorLogin() {
        return new ModelAndView("error","error",true);
    }
	
	
}
