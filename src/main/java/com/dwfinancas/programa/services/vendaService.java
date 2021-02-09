package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.venda;
import com.dwfinancas.programa.repositories.vendaRepository;

@Service
public class vendaService {
	
	@Autowired
	vendaRepository repository;
	
	public List<venda> findAll(){
		return repository.findAll();
	}

}
