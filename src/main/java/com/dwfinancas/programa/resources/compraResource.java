package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.compra;
import com.dwfinancas.programa.services.compraService;

@RestController
@RequestMapping(value = "/compras")
public class compraResource {
	
	@Autowired
	private compraService service;
	
	@GetMapping
	public ResponseEntity<List<compra>> findAll(){
		List<compra> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
