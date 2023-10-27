package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrdenamientoService;

@RestController
public class ServicesController {
	
	//Dependency Injection - Aqui sucede la inyección de dependencias
	@Autowired //- Primera forma de inyectar dependencia
	OrdenamientoService ordenamientoService;

	//La segunda forma de inyectar dependencias es mediante un constructor, solo hay que crearlo
	//y Spring automaticamente inyecta la(s) dependencias.
	/*public ServicesController(OrdenamientoService ordenamientoService) {
		super();
		this.ordenamientoService = ordenamientoService;
	}*/

	@PostMapping("/")
	public ResponseEntity<List<String>> ordenamiento(@RequestBody List<String> lista){

		List<String> listaOrdenada = ordenamientoService.ordenar(lista);
		
		//return ResponseEntity.status(HttpStatus.OK).body(listaOrdenada);
		return ResponseEntity.ok(listaOrdenada);
		
	}

}
