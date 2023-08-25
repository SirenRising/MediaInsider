package cl.siren.spring.portafolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.siren.spring.portafolio.model.entity.ResenaPodcast;

public interface IResenaPodcastRepository extends JpaRepository<ResenaPodcast, Long> {
	
}
