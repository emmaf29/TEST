package ciu.objetos2.patterns.mvc.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Respetable extends Integrante implements Serializable {

	// constantes
	private static final Integer HONOR_POR_TITULO = Integer.valueOf(10);
	
	// atributos
	private Collection<Titulo> titulos;
	private Boolean tieneCargoPolitico;

	// constructores
	public Respetable(String nombre, Integer puntosDeHonor, Integer id, Boolean cargoPolitico) {
		super(nombre, puntosDeHonor,id);
		this.titulos = new ArrayList<Titulo>();
		this.tieneCargoPolitico = cargoPolitico;
	}
	public Respetable() {
		this.titulos = new ArrayList<Titulo>();
	}

	// metodos
	@Override
	public Integer honor() {
		return this.puntosDeHonor + this.honorTitulos();
	}

	@Override
	public Boolean esCapo() {
		return this.tieneHonorParaSerCapo() && this.tieneCargoPolitico;
	}

	private Integer honorTitulos() {
		return this.titulos.size() * HONOR_POR_TITULO;
	}

	public void add(Titulo titulo) {
		this.titulos.add(titulo);
	}

	public Collection<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(Collection<Titulo> titulos) {
		this.titulos = titulos;
	}

	public Boolean getTieneCargoPolitico() {
		return tieneCargoPolitico;
	}

	public void setTieneCargoPolitico(Boolean tieneCargoPolitico) {
		this.tieneCargoPolitico = tieneCargoPolitico;
	}
	}
	
