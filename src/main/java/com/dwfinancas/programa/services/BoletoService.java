package com.dwfinancas.programa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Boleto;
import com.dwfinancas.programa.repositories.BoletoRepository;

@Service
public class BoletoService {
	
	@Autowired
	private BoletoRepository repository;
		
	public List<Boleto> findAll(){
		return repository.findAll();
	}	
	
	public Boleto findById(Long id) {
		Optional<Boleto> obj = repository.findById(id);
		return obj.get();
	}
}