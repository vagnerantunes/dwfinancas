package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Parcela;
import com.dwfinancas.programa.repositories.ParcelaRepository;

@Service
public class ParcelaService {
	
	@Autowired
	ParcelaRepository repository;
	
	public List<Parcela> findAll(){
		return repository.findAll();
	}	
}
