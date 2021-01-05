package model;

import java.util.Date;

public class Visita {

	private int id;
	private String fecha;
	private String rut;
	private String nombre;
	private String direccion;
	private Boolean realizada;
	
	public Visita() {
		
	}
	
	
	public Visita(int id, String fecha, String rut, String nombre, String direccion, Boolean realizada) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.rut = rut;
		this.nombre = nombre;
		this.direccion = direccion;
		this.realizada = realizada;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Boolean getRealizada() {
		return realizada;
	}
	public void setRealizada(Boolean realizada) {
		this.realizada = realizada;
	}
	
	
	
	
}
