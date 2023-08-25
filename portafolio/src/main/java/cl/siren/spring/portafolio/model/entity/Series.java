package cl.siren.spring.portafolio.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="series")
public class Series {

	@Id
	@Column(name="id")
	private int idSerie;
	private String tituloSerie;
	private int anoInicio;
	private int anoFin;
	private String generoSerie;
	private String descripcionSerie;
	private int calificacionSerie;
	
	public Series() {
		super();
	}

	public Series(int idSerie, String tituloSerie, int anoInicio, int anoFin, String generoSerie,
			String descripcionSerie, int calificacionSerie) {
		super();
		this.idSerie = idSerie;
		this.tituloSerie = tituloSerie;
		this.anoInicio = anoInicio;
		this.anoFin = anoFin;
		this.generoSerie = generoSerie;
		this.descripcionSerie = descripcionSerie;
		this.calificacionSerie = calificacionSerie;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public String getTituloSerie() {
		return tituloSerie;
	}

	public void setTituloSerie(String tituloSerie) {
		this.tituloSerie = tituloSerie;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFin() {
		return anoFin;
	}

	public void setAnoFin(int anoFin) {
		this.anoFin = anoFin;
	}

	public String getGeneroSerie() {
		return generoSerie;
	}

	public void setGeneroSerie(String generoSerie) {
		this.generoSerie = generoSerie;
	}

	public String getDescripcionSerie() {
		return descripcionSerie;
	}

	public void setDescripcionSerie(String descripcionSerie) {
		this.descripcionSerie = descripcionSerie;
	}

	public int getCalificacionSerie() {
		return calificacionSerie;
	}

	public void setCalificacionSerie(int calificacionSerie) {
		this.calificacionSerie = calificacionSerie;
	}

	@Override
	public String toString() {
		return "Series [idSerie=" + idSerie + ", tituloSerie=" + tituloSerie + ", anoInicio=" + anoInicio + ", anoFin="
				+ anoFin + ", generoSerie=" + generoSerie + ", descripcionSerie=" + descripcionSerie
				+ ", calificacionSerie=" + calificacionSerie + "]";
	}
	
	
}
