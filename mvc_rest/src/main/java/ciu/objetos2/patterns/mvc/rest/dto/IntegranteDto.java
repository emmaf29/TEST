package ciu.objetos2.patterns.mvc.rest.dto;

import java.util.Collection;

import ciu.objetos2.patterns.mvc.rest.model.Titulo;

public class IntegranteDto {
	protected String nombre;
	protected Integer puntosDeHonor;
	protected Integer id;
	protected Collection<Titulo>titulos;
	protected Collection<ArmaDTO>armas;
	protected Boolean tieneCargoPolitico;
	protected String tipo;
	
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}
	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPuntos() {
		return puntosDeHonor;
	}
	public void setPuntos(Integer puntos) {
		this.puntosDeHonor = puntos;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Collection<Titulo> getTitulos() {
		return titulos;
	}
	public void setTitulos(Collection<Titulo> titulos) {
		this.titulos = titulos;
	}
	public Collection<ArmaDTO> getArmas() {
		return armas;
	}
	public void setArmas(Collection<ArmaDTO> armas) {
		this.armas = armas;
	}
	public Boolean getTieneCargoPolitico() {
		return tieneCargoPolitico;
	}
	public void setTieneCargoPolitico(Boolean tieneCargoPolitico) {
		this.tieneCargoPolitico = tieneCargoPolitico;
	}
	
}
