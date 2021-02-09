package com.dwfinancas.programa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dwfinancas.programa.entities.cliente;
import com.dwfinancas.programa.repositories.clienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private clienteRepository repository;

	@Override
	public void run(String... args) throws Exception {
		cliente cli1 = new cliente(null, null, null, null, null, null, null, null, null, null, null);

		repository.saveAll(Arrays.asList(cli1));
	}

}
