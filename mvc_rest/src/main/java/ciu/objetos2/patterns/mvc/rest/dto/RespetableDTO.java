package ciu.objetos2.patterns.mvc.rest.dto;

import java.util.Collection;

import ciu.objetos2.patterns.mvc.rest.model.Respetable;
import ciu.objetos2.patterns.mvc.rest.model.Titulo;

public class RespetableDTO {
	private Integer id;
	private String nombre;
	private Integer puntosDeHonor;
	private Collection<Titulo>titulos;
	private Boolean tieneCargoPolitico;
	private String tipo = "Respetable";
	
	
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Respetable toModel() {
		Respetable r = new Respetable();
		r.setNombre(this.nombre);
		r.setId(this.id);
		r.setPuntosDeHonor(this.puntosDeHonor);
		r.setTieneCargoPolitico(this.tieneCargoPolitico);
		r.setTitulos(this.titulos);
		
		return r;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	public Collection<Titulo> getTitulos() {
		return titulos;
	}
	public Boolean getTieneCargoPolitico() {
		return tieneCargoPolitico;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	public void setTitulos(Collection<Titulo> titulos) {
		this.titulos = titulos;
	}
	public void setTieneCargoPolitico(Boolean tieneCargoPolitico) {
		this.tieneCargoPolitico = tieneCargoPolitico;
	}
	
}
