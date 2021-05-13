package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Boleto;
import com.dwfinancas.programa.repositories.BoletoRepository;

@Service
public class BoletoService {
	
	@Autowired
	BoletoRepository repository;
	
	public List<Boleto> findAll(){
		return repository.findAll();
	}	

}