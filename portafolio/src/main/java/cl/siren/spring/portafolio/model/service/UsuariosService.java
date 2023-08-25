package cl.siren.spring.portafolio.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.siren.spring.portafolio.model.entity.Usuarios;
import cl.siren.spring.portafolio.model.repository.IUsuariosRepository;


@Service
public class UsuariosService {

	public UsuariosService() {
		super();
	}
	@Autowired
	private IUsuariosRepository userRepo;
	
	
	public ArrayList<Usuarios> obtenerUsuarios(){
		return (ArrayList<Usuarios>) userRepo.findAll();
	}
	
	public Usuarios obtenerUsuario(int id) {
		return userRepo.findById(id).get();
	}
	
	public void actualizar(Usuarios usu) {
		userRepo.save(usu);
	}
	
	public void borrarUsuario(int id) {
		userRepo.delete(userRepo.getOne(id));
	}

}
