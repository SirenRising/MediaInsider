package cl.siren.spring.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutController {

	@RequestMapping(path = "/about", method = RequestMethod.GET)
    public ModelAndView mostrarAbout() {
        return new ModelAndView("about");

	    }
	}


