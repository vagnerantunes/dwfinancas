package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.status;
import com.dwfinancas.programa.services.statusService;

@RestController
@RequestMapping(value = "/status")
public class statusResource {
	
	@Autowired
	private statusService service;
	
	@GetMapping
	public ResponseEntity<List<status>> findAll(){
		List<status> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
