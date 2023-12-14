package ciu.objetos2.patterns.mvc.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import ciu.objetos2.patterns.mvc.rest.model.Persona;







@RestController
public class PersonaController {
	@GetMapping("Lista")
	public List<Persona>lista(){
		Persona p1 = new Persona("Ricardo","Espinoza",33);
		Persona p2 = new Persona("Ricardo","Iorio",33);
		Persona p3 = new Persona("Ruben","Moraglio",40);
		
		List<Persona>personas = Arrays.asList(p1,p2,p3);
		return personas;
	}
}
