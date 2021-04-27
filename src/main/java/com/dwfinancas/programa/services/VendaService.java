package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Venda;
import com.dwfinancas.programa.repositories.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	VendaRepository repository;
	
	public List<Venda> findAll(){
		return repository.findAll();
	}

}
