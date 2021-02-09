package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.venda;
import com.dwfinancas.programa.services.vendaService;

@RestController
@RequestMapping(value = "/venda")
public class vendaResource {

	@Autowired
	private vendaService service;
	
	@GetMapping
	public ResponseEntity<List<venda>> findAll(){
		List<venda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
