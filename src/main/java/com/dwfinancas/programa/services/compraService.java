package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.compra;
import com.dwfinancas.programa.repositories.compraRepository;

@Service
public class compraService {

	@Autowired
	compraRepository repository;
	
	public List<compra> findAll(){
		return repository.findAll();		
	}
}
