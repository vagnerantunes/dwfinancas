package com.dwfinancas.programa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dwfinancas.programa.entities.Cliente;
import com.dwfinancas.programa.repositories.ClienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Cliente cliente = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);

		repository.saveAll(Arrays.asList(cliente));
	}
}