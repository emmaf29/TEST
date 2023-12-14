package ciu.objetos2.patterns.mvc.rest.model;

import java.io.Serializable;

public abstract class Integrante implements Serializable{

	protected static final Integer HONOR_CAPO = Integer.valueOf(100);
	protected String nombre;
	protected Integer puntosDeHonor;
	protected Integer id;
	
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Integrante(String nombre, Integer puntosDeHonor,Integer id) {
		this.nombre = nombre;
		this.puntosDeHonor = puntosDeHonor;
		this.id = id;
	}
	public Integrante() {
		
	}

	public abstract Integer honor();
	public abstract Boolean esCapo();

	public void imprimirNombre() {
		System.out.println(this.nombre);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected Boolean tieneHonorParaSerCapo() {
		return this.honor()>HONOR_CAPO;
	}

	public String getNombre() {
		return nombre;
	}
}
