package com.practica.model;

public class Usuario {
	public int id;
	public String nombre;
	public String correo;
	public String password;
	public Usuario(int id, String nombre, String correo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}
	public Usuario(String nombre, String correo, String password) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}
	
	public Usuario() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
