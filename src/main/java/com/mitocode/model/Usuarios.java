package com.mitocode.model;
// Generated 5 abr. 2022 18:03:57 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios", schema = "public")
public class Usuarios implements java.io.Serializable {

	private String id;
	private String nombre;
	private String password;

	public Usuarios() {
	}

	public Usuarios(String id, String nombre, String password) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, length = 16)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 64)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "password", nullable = false, length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
