package cl.siren.spring.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactoController {

	@RequestMapping(path = "/contacto", method = RequestMethod.GET)
    public ModelAndView mostrarAbout() {
        return new ModelAndView("contacto");

	    }
	}


