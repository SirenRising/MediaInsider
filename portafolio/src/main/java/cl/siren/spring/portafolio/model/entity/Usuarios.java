package cl.siren.spring.portafolio.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	@Column(name="id")
	private int idUsuario;
	private String nombreUsuario;
	private String emailUsuario;
	@Column(name="contraseña")
	private String passUsuario;
	private String fechaRegistro;
	
	
	public Usuarios() {
		super();
	}


	public Usuarios(int idUsuario, String nombreUsuario, String emailUsuario, String passUsuario,
			String fechaRegistro) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.emailUsuario = emailUsuario;
		this.passUsuario = passUsuario;
		this.fechaRegistro = fechaRegistro;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getEmailUsuario() {
		return emailUsuario;
	}


	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}


	public String getPassUsuario() {
		return passUsuario;
	}


	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}


	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", emailUsuario="
				+ emailUsuario + ", passUsuario=" + passUsuario + ", fechaRegistro=" + fechaRegistro + "]";
	}
	
	
	
}
