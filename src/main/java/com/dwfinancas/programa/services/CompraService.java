package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Compra;
import com.dwfinancas.programa.repositories.CompraRepository;

@Service
public class CompraService {

	@Autowired
	CompraRepository repository;
	
	public List<Compra> findAll(){
		return repository.findAll();		
	}
}