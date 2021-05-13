package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Cliente;
import com.dwfinancas.programa.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repository;
	
	public List<Cliente> findall(){
		return repository.findAll();		
	}	
	
}