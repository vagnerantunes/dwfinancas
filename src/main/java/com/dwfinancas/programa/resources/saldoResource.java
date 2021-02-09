package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.saldo;
import com.dwfinancas.programa.services.saldoService;

@RestController
@RequestMapping(value = "/saldo")
public class saldoResource {
	
	@Autowired
	private saldoService service;
	
	@GetMapping
	public ResponseEntity<List<saldo>> findAll(){
		List<saldo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
