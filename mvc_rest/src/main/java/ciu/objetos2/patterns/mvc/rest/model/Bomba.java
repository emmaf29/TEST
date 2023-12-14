package ciu.objetos2.patterns.mvc.rest.model;

import java.io.Serializable;

public class Bomba extends Arma implements Serializable{

	private static final Integer POTENCIA_DESTRUCTIVA = Integer.valueOf(1000);
	private static final Integer PUNTOS_DE_HONOR = Integer.valueOf(0);

	private Bomba(Integer puntosDeHonor, Integer potenciaDestructiva) {
		super(PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}

	public Bomba() {
		this(PUNTOS_DE_HONOR, POTENCIA_DESTRUCTIVA);
	}
	

}
