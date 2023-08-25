package cl.siren.spring.portafolio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.siren.spring.portafolio.model.service.SeriesService;

@Controller
public class SeriesController {
	
	@Autowired 
	private SeriesService seriesService;

	@RequestMapping(path = "/series", method = RequestMethod.GET)
    public ModelAndView mostrarSeries() {
        return new ModelAndView("series");

	    }
	}


