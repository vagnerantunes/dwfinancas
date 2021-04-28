package com.dwfinancas.programa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dwfinancas.programa.entities.Cliente;
import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.repositories.ClienteRepository;
import com.dwfinancas.programa.repositories.FaturaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	private FaturaRepository faturaRepository;

	@Override
	public void run(String... args) throws Exception {
		Fatura fatura = new Fatura(null, null, null, null, null, null, null, null, null, null, null, null);
		faturaRepository.saveAll(Arrays.asList(fatura));	
		
		Cliente cliente = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);
		clienteRepository.saveAll(Arrays.asList(cliente));
		
		
	}
	
	
}