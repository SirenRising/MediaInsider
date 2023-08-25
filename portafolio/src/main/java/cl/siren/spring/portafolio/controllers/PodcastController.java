package cl.siren.spring.portafolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.siren.spring.portafolio.model.service.PodcastService;

@Controller
public class PodcastController {
	
	@Autowired 
	private PodcastService podcastService;

	@RequestMapping(path = "/podcast", method = RequestMethod.GET)
    public ModelAndView mostrarPodcast() {
        return new ModelAndView("podcast");

	    }
	}


