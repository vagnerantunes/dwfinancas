package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.cliente;
import com.dwfinancas.programa.repositories.clienteRepository;

@Service
public class clienteService {
	
	@Autowired
	clienteRepository repository;
	
	public List<cliente> findall(){
		return repository.findAll();		
	}
	
}
