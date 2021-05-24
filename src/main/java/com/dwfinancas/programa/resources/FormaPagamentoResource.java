package com.dwfinancas.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwfinancas.programa.entities.FormaPagamento;
import com.dwfinancas.programa.services.FormaPagamentoService;

@RestController
@RequestMapping(value = "/fagamentos")
public class FormaPagamentoResource {
	
	@Autowired
	private FormaPagamentoService service;
	
	@GetMapping
	public ResponseEntity<List<FormaPagamento>> findAll(){
		List<FormaPagamento> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
