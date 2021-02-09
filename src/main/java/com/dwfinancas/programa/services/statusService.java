package com.dwfinancas.programa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.status;
import com.dwfinancas.programa.repositories.statusRepository;

@Service
public class statusService {
	
	@Autowired
	statusRepository repository;
	
	
	public List<status> findAll(){
		return repository.findAll();
	}

}
