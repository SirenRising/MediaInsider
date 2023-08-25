package cl.siren.spring.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.siren.spring.portafolio.model.entity.ResenaSerie;
import cl.siren.spring.portafolio.model.repository.IResenaSerieRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ResSeriesController {

    @Autowired
    private IResenaSerieRepository reserep;


    @PostMapping("/guardarresseries")
    public String guardarResenaSerie(
            @RequestParam String titulo,
            @RequestParam String contenido,
            @RequestParam int calificacion,
            Model model) {
        
        ResenaSerie resena = new ResenaSerie();
        resena.setTitulo(titulo);
        resena.setContenido(contenido);
        resena.setCalificacion(calificacion);
        
        reserep.save(resena);

        model.addAttribute("mensaje", "Reseña de serie guardada exitosamente");

        return "agregarresseries";
    }
}
