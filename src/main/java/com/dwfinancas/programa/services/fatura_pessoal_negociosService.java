package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.fatura_pessoal_negocios;
import com.dwfinancas.programa.repositories.fatura_pessoal_necociosRepository;

@Service
public class fatura_pessoal_negociosService {
	
	@Autowired
	fatura_pessoal_necociosRepository repository;
	
	public List<fatura_pessoal_negocios> findAll(){
		return repository.findAll();
	}

}
