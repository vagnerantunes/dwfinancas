package com.dwfinancas.programa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.repositories.ParcelaVendaRepository;

@Service
public class ParcelaVendaServica {
	
	@Autowired
	ParcelaVendaRepository parcelaVendaRepository;
	
	
}
