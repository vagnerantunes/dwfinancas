package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.FormaPagamento;
import com.dwfinancas.programa.repositories.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {
	
	@Autowired
	FormaPagamentoRepository repository;
	
	public List<FormaPagamento> findAll(){
		return repository.findAll();
	}

}