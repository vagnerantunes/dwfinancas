package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.Boleto;
import com.dwfinancas.programa.services.BoletoService;

@RestController
@RequestMapping(value = "/boleto")
public class BoletoResource {

	@Autowired
	BoletoService service;
	
	@GetMapping
	public ResponseEntity<List<Boleto>> findAll(){
		List<Boleto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
