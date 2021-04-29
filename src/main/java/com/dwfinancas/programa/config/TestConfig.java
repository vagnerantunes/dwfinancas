package com.dwfinancas.programa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dwfinancas.programa.entities.Cliente;
import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.entities.FormaPagamento;
import com.dwfinancas.programa.repositories.ClienteRepository;
import com.dwfinancas.programa.repositories.FaturaRepository;
import com.dwfinancas.programa.repositories.FormaPagamentoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FaturaRepository faturaRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository; 

	@Override
	public void run(String... args) throws Exception {
		
		FormaPagamento fpg1 = new FormaPagamento(null, null, null, null, null, null, null, null);
		formaPagamentoRepository.saveAll(Arrays.asList(fpg1));
		
		Fatura fat1 = new Fatura(null, null, null, null, null, null, null, null, null, null, null, null);		
		faturaRepository.saveAll(Arrays.asList(fat1));
		
		//Fatura(Long, FormaPagamento, FaturaStatus, String, LocalDate, String, String, BigDecimal, BigDecimal, BigDecimal, LocalDate, Integer)
		Cliente c1 = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);
		clienteRepository.saveAll(Arrays.asList(c1));
		
		
	}
	
	
}