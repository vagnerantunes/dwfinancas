package com.dwfinancas.programa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.repositories.FaturaRepository;
import com.dwfinancas.programa.services.exceptions.ResourceNotFoundException;

@Service
public class FaturaService {
	
	@Autowired
	private FaturaRepository repository;

	public List<Fatura> findAll(){
		return repository.findAll();
	}
	
	public Fatura findById(Long id) {
		Optional<Fatura> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}

}
