package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.saldo;
import com.dwfinancas.programa.repositories.saldoRepository;

@Service
public class saldoService {
	
	@Autowired
	saldoRepository repository;
	
	public List<saldo> findAll(){
		return repository.findAll();
	}

}
