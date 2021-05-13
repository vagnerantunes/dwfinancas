package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.ParcelaVenda;
import com.dwfinancas.programa.repositories.ParcelaVendaRepository;

@Service
public class ParcelaVendaService {
	
	@Autowired
	ParcelaVendaRepository repository;
	
	public List<ParcelaVenda> findAll(){
		return repository.findAll();
	}	
}
