package ciu.objetos2.patterns.mvc.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang.StringUtils;




public class Criminal extends Integrante implements Serializable {

	// atributos
	private Collection<Arma> armas;

	// constructores
	public Criminal(String nombre, Integer puntosDeHonor, Integer id) {
		super(nombre, puntosDeHonor,id);
		this.armas = new ArrayList<Arma>();
	}
    public Criminal() {
    	this.armas = new ArrayList<Arma>();
    }
 	
	// metodos
	@Override
	public void imprimirNombre() {
		System.out.println(StringUtils.capitalize(this.nombre));
	}

 	public Collection<Arma> getArmas() {
		return armas;
	}
	public void setArmas(Collection<Arma> armas) {
		this.armas = armas;
	}
	@Override
	public Integer honor() {
		return this.honorArmas() + this.puntosDeHonor;
	}

	@Override
	public Boolean esCapo() {
		return  this.tieneHonorParaSerCapo() && this.tieneArmaHeavy();
	}

	private Boolean tieneArmaHeavy() {
		return this.armas.stream().anyMatch(Arma::isHeavy);
	}

 	private Integer honorArmas() {
 		return this.armas.stream()
 							.mapToInt(Arma::getPuntosDeHonor)
 							.sum();
 	}
 	
	public void add(Arma arma) {
		this.armas.add(arma);
	}
}