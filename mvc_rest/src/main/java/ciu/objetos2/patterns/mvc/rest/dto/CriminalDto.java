package ciu.objetos2.patterns.mvc.rest.dto;

import java.util.ArrayList;
import java.util.Collection;

import ciu.objetos2.patterns.mvc.rest.model.Ametralladora;
import ciu.objetos2.patterns.mvc.rest.model.Bomba;
import ciu.objetos2.patterns.mvc.rest.model.Criminal;
import ciu.objetos2.patterns.mvc.rest.model.Cuchillo;

public class CriminalDto {
	private Integer id;
	private String nombre;
	private Integer puntosDeHonor;
	private Collection<ArmaDTO>armas;
	private String tipo = "Criminal";

	
	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public CriminalDto(Integer id, String nom, Integer punt) {
		this.id = id;
		this.nombre = nom;
		this.puntosDeHonor = punt;
		
		this.armas = new ArrayList<ArmaDTO>();
	}
	
	public Criminal toModel() {
		Criminal cr7 = new Criminal();
		cr7.setId(this.id);
		cr7.setNombre(this.nombre);
		cr7.setPuntosDeHonor(this.puntosDeHonor);
		this.armas.forEach(a -> {
			if(a.getDescripcion().equals("Cuchillo")) {
				cr7.add(new Cuchillo(1));
			} else if (a.getDescripcion().equals("Bomba")) {
				cr7.add(new Bomba());
				}
			else {
				cr7.add(new Ametralladora(5)); 
			}
		});
		return cr7;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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


	public Collection<ArmaDTO> getArmas() {
		return armas;
	}

	public void setArmas(Collection<ArmaDTO> armas) {
		this.armas = armas;
	}

	
}
