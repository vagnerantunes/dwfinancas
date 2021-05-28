package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.services.FaturaService;

@RestController
@RequestMapping(value = "/faturas")
public class FaturaResource {

	@Autowired
	private FaturaService service;
	
	@GetMapping
	public ResponseEntity<List<Fatura>> findAll(){
		List<Fatura> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Fatura> findById(@PathVariable Long id){
		Fatura obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
