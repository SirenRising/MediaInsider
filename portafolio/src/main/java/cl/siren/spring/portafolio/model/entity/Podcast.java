package cl.siren.spring.portafolio.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="podcast")
public class Podcast {

	@Id
	@Column(name="id")
	private int idPodcast;
	private String tituloPodcast;
	private String presentador;
	private String duracionPodcast;
	
	public Podcast() {
		super();
	}

	public Podcast(int idPodcast, String tituloPodcast, String presentador, String duracionPodcast) {
		super();
		this.idPodcast = idPodcast;
		this.tituloPodcast = tituloPodcast;
		this.presentador = presentador;
		this.duracionPodcast = duracionPodcast;
	}

	public int getIdPodcast() {
		return idPodcast;
	}

	public void setIdPodcast(int idPodcast) {
		this.idPodcast = idPodcast;
	}

	public String getTituloPodcast() {
		return tituloPodcast;
	}

	public void setTituloPodcast(String tituloPodcast) {
		this.tituloPodcast = tituloPodcast;
	}

	public String getPresentador() {
		return presentador;
	}

	public void setPresentador(String presentador) {
		this.presentador = presentador;
	}

	public String getDuracionPodcast() {
		return duracionPodcast;
	}

	public void setDuracionPodcast(String duracionPodcast) {
		this.duracionPodcast = duracionPodcast;
	}

	@Override
	public String toString() {
		return "Podcast [idPodcast=" + idPodcast + ", tituloPodcast=" + tituloPodcast + ", presentador=" + presentador
				+ ", duracionPodcast=" + duracionPodcast + "]";
	}
	
	
	
	
}
