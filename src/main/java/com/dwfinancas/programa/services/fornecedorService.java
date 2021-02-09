package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.fornecedor;
import com.dwfinancas.programa.repositories.fornecedorRepository;

@Service
public class fornecedorService {
	
	@Autowired
	fornecedorRepository repository;
	
	public List<fornecedor> findAll(){
		return repository.findAll();
	}
}
