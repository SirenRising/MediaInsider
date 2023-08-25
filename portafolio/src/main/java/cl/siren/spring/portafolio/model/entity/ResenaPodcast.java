package cl.siren.spring.portafolio.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResenaPodcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;
    private int calificacion;
    private String fecha_creacion;
	
    public ResenaPodcast() {
		super();
	}

	public ResenaPodcast(Long id, String titulo, String contenido, int calificacion, String fecha_creacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		this.calificacion = calificacion;
		this.fecha_creacion = fecha_creacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	@Override
	public String toString() {
		return "ResenaPodcast [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + ", calificacion="
				+ calificacion + ", fecha_creacion=" + fecha_creacion + "]";
	}

    

}
