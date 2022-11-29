package com.medic.org_medic.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String Nombre;
	
	private String Apellido;
	
	private String Domicilio;
	
	private String Email;
	
	private Integer Contacto;
	
	private Integer Cuil;
	
	private Integer FechaDeAlta;
	
	public Medico ( ) {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getContacto() {
		return Contacto;
	}

	public void setContacto(Integer contacto) {
		Contacto = contacto;
	}

	public Integer getCuil() {
		return Cuil;
	}

	public void setCuil(Integer cuil) {
		Cuil = cuil;
	}

	public Integer getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(Integer fechaDeAlta) {
		FechaDeAlta = fechaDeAlta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
