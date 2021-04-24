package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.repositories.FaturaRepository;

@Service
public class FaturaService {
	
	@Autowired
	FaturaRepository repository;
	
	public List<Fatura> findAll(){
		return repository.findAll();
	}

}
