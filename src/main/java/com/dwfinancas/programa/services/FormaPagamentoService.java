package com.dwfinancas.programa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.FormaPagamento;
import com.dwfinancas.programa.repositories.FormaPagamentoRepository;
import com.dwfinancas.programa.services.exceptions.ResourceNotFoundException;

@Service
public class FormaPagamentoService {
	
	@Autowired
	private FormaPagamentoRepository repository;
	
	public List<FormaPagamento> findAll(){
		return repository.findAll();
	}
	
	public FormaPagamento findById(Long id) {
		Optional<FormaPagamento> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));	
    }	
	
	public FormaPagamento insert(FormaPagamento obj) {
		return repository.save(obj);
	}
	
}