package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Produto;
import com.dwfinancas.programa.repositories.produtoRepository;

@Service
public class produtoService {
	
	@Autowired
	produtoRepository repository;
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
}
