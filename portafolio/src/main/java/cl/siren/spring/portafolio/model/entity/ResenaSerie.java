package cl.siren.spring.portafolio.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResenaSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String contenido;
    private int calificacion;
	
    public ResenaSerie() {
		super();
	}

	public ResenaSerie(Long id, String titulo, String contenido, int calificacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
		this.calificacion = calificacion;
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

	@Override
	public String toString() {
		return "ResenaSerie [id=" + id + ", titulo=" + titulo + ", contenido=" + contenido + ", calificacion="
				+ calificacion + "]";
	}
    
    

    
    
}

