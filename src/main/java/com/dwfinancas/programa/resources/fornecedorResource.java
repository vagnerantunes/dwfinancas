package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.fornecedor;
import com.dwfinancas.programa.services.fornecedorService;

@RestController
@RequestMapping(value = "/fornecedores")
public class fornecedorResource {

	@Autowired
	private fornecedorService service;
	
	@GetMapping
	public ResponseEntity<List<fornecedor>> findAll(){
		List<fornecedor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
