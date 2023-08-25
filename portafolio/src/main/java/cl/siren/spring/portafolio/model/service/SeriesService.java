package cl.siren.spring.portafolio.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.siren.spring.portafolio.model.entity.Series;
import cl.siren.spring.portafolio.model.repository.ISeriesRepository;

@Service
public class SeriesService {

	public SeriesService() {
		super();
	}
	
	@Autowired
	private ISeriesRepository srRepo;
	
	public ArrayList<Series> obtenerAdministrativos(){
		return (ArrayList<Series>) srRepo.findAll();
	}
	
	public Series obtenerAdministrativo(int id) {
		return srRepo.findById(id).get();
	}
	
	public void crearAdministrativo(Series sr) {
		srRepo.save(sr);
	}
	
	public void actualizar(Series sr) {
		srRepo.save(sr);
	}
	
	public void borrarAdministrativo(int id) {
		srRepo.delete(srRepo.getOne(id));
	}
}
