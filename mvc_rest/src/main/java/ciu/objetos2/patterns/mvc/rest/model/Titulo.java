package ciu.objetos2.patterns.mvc.rest.model;

import java.io.Serializable;

public class Titulo implements Serializable {

	private String descripcion;

	public Titulo(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Titulo() {
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
