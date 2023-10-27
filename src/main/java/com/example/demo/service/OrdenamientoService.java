package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrdenamientoService {
	
	public List<String> ordenar(List<String> desordenada){
		Collections.sort(desordenada, (e1,e2) -> -e1.compareTo(e2));
		List<String> ordenada = desordenada;
		return ordenada;
	}

}
