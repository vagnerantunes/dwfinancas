package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.cliente;
import com.dwfinancas.programa.services.clienteService;

@RestController
@RequestMapping(value = "/clientes")
public class clienteResource {
	
	@Autowired
	private clienteService service;
	
	@GetMapping
	public ResponseEntity<List<cliente>> findAll(){
		List<cliente> list = service.findall();
		return ResponseEntity.ok().body(list);
	}
}
