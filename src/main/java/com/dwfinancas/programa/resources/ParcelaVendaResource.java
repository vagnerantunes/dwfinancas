package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.ParcelaVenda;
import com.dwfinancas.programa.services.ParcelaVendaService;

@RestController
@RequestMapping(value = "/parcela")
public class ParcelaVendaResource {
	
	@Autowired
	private ParcelaVendaService service;
	
	@GetMapping
	public ResponseEntity<List<ParcelaVenda>> findAll(){
		List<ParcelaVenda> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}