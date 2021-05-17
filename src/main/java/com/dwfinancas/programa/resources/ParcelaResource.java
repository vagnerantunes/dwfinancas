package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.Parcela;
import com.dwfinancas.programa.services.ParcelaService;

@RestController
@RequestMapping(value = "/parcela")
public class ParcelaResource {
	
	@Autowired
	private ParcelaService service;
	
	@GetMapping
	public ResponseEntity<List<Parcela>> findAll(){
		List<Parcela> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}