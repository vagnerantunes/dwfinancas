package com.dwfinancas.programa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dwfinancas.programa.entities.Cliente;
import com.dwfinancas.programa.entities.Fatura;
import com.dwfinancas.programa.entities.FormaPagamento;
import com.dwfinancas.programa.enums.FaturaStatus;
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
		Fatura fat2 = new Fatura(null, null, FaturaStatus.PENDENTE, "BOLETO VIVO", Instant.parse("2019-06-20T21:53:07Z"), "PESSOAL", "obs teste", 34.90, 0.00, 34.90, Instant.parse("2021-05-10T23:00:00Z"), 1);
		faturaRepository.saveAll(Arrays.asList(fat1, fat2));
		//Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		//Fatura(Long, FormaPagamento, FaturaStatus, String, Instant, String, String, Double, Double, Double, Instant, Integer)
		
		Cliente c1 = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);
		clienteRepository.saveAll(Arrays.asList(c1));
		
		
		
	}
	
	
}