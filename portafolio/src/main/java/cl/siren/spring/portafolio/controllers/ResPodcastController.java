package cl.siren.spring.portafolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.siren.spring.portafolio.model.entity.ResenaPodcast;
import cl.siren.spring.portafolio.model.repository.IResenaPodcastRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ResPodcastController {

    @Autowired
    private IResenaPodcastRepository repodrep;


    @PostMapping("/guardarrespodcast")
    public String guardarResenaPodcast(
            @RequestParam String titulo,
            @RequestParam String contenido,
            @RequestParam int calificacion,
            Model model) {
        
        ResenaPodcast resena = new ResenaPodcast();
        resena.setTitulo(titulo);
        resena.setContenido(contenido);
        resena.setCalificacion(calificacion);
        
        repodrep.save(resena);

        model.addAttribute("mensaje", "Reseña de Podcast guardada exitosamente");

        return "agregarrespodcast";
    }
}
