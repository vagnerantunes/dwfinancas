package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.forma_pagamento;
import com.dwfinancas.programa.repositories.forma_pagamentoRepository;

@Service
public class forma_pagamentoService {
	
	@Autowired
	forma_pagamentoRepository repository;
	
	public List<forma_pagamento> findAll(){
		return repository.findAll();
	}

}
