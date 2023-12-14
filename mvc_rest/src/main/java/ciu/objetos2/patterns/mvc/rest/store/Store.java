package ciu.objetos2.patterns.mvc.rest.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import ciu.objetos2.patterns.mvc.rest.model.Integrante;


public class Store {
	private static Store instance;
	private Collection<Integrante>integrantes;
	
	private Store() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	
	
	public static Store getInstance() {
		if(instance == null) {
			instance = new Store();
		}
		
		return instance;
	}
	
	public Collection<Integrante> findAll(){
		return this.integrantes;
	}
	
	public Integrante add(Integrante i) {
		this.integrantes.add(i);
		return i;
	}
	
	public void delete(Integer id) {
		Integrante usuarioABorrar = this.integrantes.stream()
														.filter(i -> i.getId().equals(id))
														.findFirst()
														.orElse(null); 
		this.integrantes.remove(usuarioABorrar);
	}
	
	public Integrante findById(Integer id) {
		Integrante usuarioABuscar = this.integrantes.stream()
								 .filter(i -> i.getId().equals(id))
								 .findFirst()
								 .orElse(null);
		return usuarioABuscar;
	}
	
	public Integrante update(Integer id, String nombre) {
		Integrante integrante = this.findById(id);
		integrante.setNombre(nombre);
		return integrante;
	}
}
