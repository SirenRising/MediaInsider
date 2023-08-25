package cl.siren.spring.portafolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.siren.spring.portafolio.model.entity.Usuarios;

public interface IUsuariosRepository extends JpaRepository<Usuarios,Integer>{

}
