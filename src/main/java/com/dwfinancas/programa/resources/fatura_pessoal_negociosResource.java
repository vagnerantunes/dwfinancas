package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.services.fatura_pessoal_negociosService;

@RestController
@RequestMapping(value = "/faturas")
public class fatura_pessoal_negociosResource {

	@Autowired
	private fatura_pessoal_negociosService service;
	
	@GetMapping
	public ResponseEntity<List<Fatura>> findAll(){
		List<Fatura> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
