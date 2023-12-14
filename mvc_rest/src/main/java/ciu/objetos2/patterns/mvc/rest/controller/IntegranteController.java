package ciu.objetos2.patterns.mvc.rest.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciu.objetos2.patterns.mvc.rest.dto.ArmaDTO;
import ciu.objetos2.patterns.mvc.rest.dto.CriminalDto;
import ciu.objetos2.patterns.mvc.rest.dto.IntegranteDto;
import ciu.objetos2.patterns.mvc.rest.dto.RespetableDTO;
import ciu.objetos2.patterns.mvc.rest.model.Bomba;
import ciu.objetos2.patterns.mvc.rest.model.Criminal;
import ciu.objetos2.patterns.mvc.rest.model.Cuchillo;
import ciu.objetos2.patterns.mvc.rest.model.Integrante;
import ciu.objetos2.patterns.mvc.rest.model.Respetable;
import ciu.objetos2.patterns.mvc.rest.store.Store;

@RestController
@RequestMapping("/integrantes")
public class IntegranteController {
	
	@GetMapping("/listar")
	public Collection<IntegranteDto>lista(){
		Collection<IntegranteDto> integrantesDto = new ArrayList<>();
		Collection<Integrante> integrantes = Store.getInstance().findAll();
		integrantes.forEach(i -> {
			if(i instanceof Criminal) {
				IntegranteDto iDto = new IntegranteDto();
				iDto.setTipo("Criminal");
				iDto.setNombre(i.getNombre());
				iDto.setId(i.getId());
				iDto.setPuntos(i.getPuntosDeHonor());
				
				Collection<ArmaDTO> armasDto = new ArrayList<>();
				((Criminal)i).getArmas().forEach(arma -> {
					ArmaDTO pp = new ArmaDTO();
						if(arma instanceof Cuchillo){
							pp.setDescripcion("Cuchillo");					}
					else if(arma instanceof Bomba) {
						pp.setDescripcion("Bomba");
					}
					else {
						pp.setDescripcion("Ametralladora");
					}
					armasDto.add(pp);
				});
				
				iDto.setArmas(armasDto);
				integrantesDto.add(iDto);
			}
			else {
				IntegranteDto idto = new IntegranteDto();
				idto.setTipo("Respetable");
				idto.setNombre(i.getNombre());
				idto.setPuntos(i.getPuntosDeHonor());
				idto.setTieneCargoPolitico(((Respetable)i).getTieneCargoPolitico());
				idto.setTitulos(((Respetable)i).getTitulos());
				
				integrantesDto.add(idto);
				
			}
		});
		return integrantesDto;
	}
	
	@PostMapping("/agregarRespetable")
	public RespetableDTO agregarRespetable(@RequestBody RespetableDTO r) {
		Store.getInstance().add(r.toModel());
		
		return r;
	}
	
	@PostMapping("/agregarCriminal")
	public CriminalDto agregarCriminal(@RequestBody CriminalDto c) {
		Store.getInstance().add(c.toModel());
		return c;
	}
	
	@DeleteMapping("/eliminarIntegrante/{Id}")
	public void deleteById(@PathVariable Integer Id) {
		Store.getInstance().delete(Id);
	}
	
	@GetMapping("findById/{Id}")
	public Integrante findById(@PathVariable Integer Id) {
		return Store.getInstance().findById(Id);
	}
	
	@PutMapping("update/{Id}/{Nombre}")
	public Integrante update(@PathVariable Integer Id,@PathVariable String Nombre) {
		return Store.getInstance().update(Id, Nombre);
	}
	
}
