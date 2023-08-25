package cl.siren.spring.portafolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.siren.spring.portafolio.model.entity.ResenaSerie;

public interface IResenaSerieRepository extends JpaRepository<ResenaSerie, Long> {
	
}
