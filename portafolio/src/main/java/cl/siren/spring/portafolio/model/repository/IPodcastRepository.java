package cl.siren.spring.portafolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.siren.spring.portafolio.model.entity.Podcast;

public interface IPodcastRepository extends JpaRepository<Podcast,Integer>{

}
