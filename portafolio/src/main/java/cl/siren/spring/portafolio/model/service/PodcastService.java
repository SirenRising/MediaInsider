package cl.siren.spring.portafolio.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.siren.spring.portafolio.model.entity.Podcast;
import cl.siren.spring.portafolio.model.repository.IPodcastRepository;

@Service
public class PodcastService {

	public PodcastService() {
		super();
	}
	
	@Autowired
	private IPodcastRepository pdcRepo;
	
	public ArrayList<Podcast> obtenerAdministrativos(){
		return (ArrayList<Podcast>) pdcRepo.findAll();
	}
	
	public Podcast obtenerAdministrativo(int id) {
		return pdcRepo.findById(id).get();
	}
	
	public void crearAdministrativo(Podcast pl) {
		pdcRepo.save(pl);
	}
	
	public void actualizar(Podcast pl) {
		pdcRepo.save(pl);
	}
	
	public void borrarAdministrativo(int id) {
		pdcRepo.delete(pdcRepo.getOne(id));
	}
}
