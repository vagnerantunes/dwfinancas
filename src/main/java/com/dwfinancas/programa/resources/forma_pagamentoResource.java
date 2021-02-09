package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.forma_pagamento;
import com.dwfinancas.programa.services.forma_pagamentoService;

@RestController
@RequestMapping(value = "/fpg")
public class forma_pagamentoResource {
	
	@Autowired
	private forma_pagamentoService service;
	
	@GetMapping
	public ResponseEntity<List<forma_pagamento>> findAll(){
		List<forma_pagamento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
