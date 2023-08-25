package cl.siren.spring.portafolio.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.siren.spring.portafolio.model.entity.Series;

public interface ISeriesRepository extends JpaRepository<Series,Integer>{

}
