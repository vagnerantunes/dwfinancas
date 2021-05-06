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
import com.dwfinancas.programa.enums.PagamentoStatus;
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
		
		Cliente cli1 = new Cliente(null, "Vagner Antunes de Souza", "PF", "097.551.319-22", Instant.parse("1994-01-07T10:00:00Z"), "(43) 99139-7159", "vagner.antunes0701@outlook.com", null, null, "RUA SOFIA KUSKOSK MENDES, N°134", null, null);
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		//Cliente(Long, String, String, String, Instant, String, String, String, String, String, String, List<Venda>)
		
		FormaPagamento fpg1 = new FormaPagamento(null, "PAGAMENTO", "DAS", "MENSAL", 1, 0.00, null, null);
		formaPagamentoRepository.saveAll(Arrays.asList(fpg1));
				
		Fatura fat2 = new Fatura(null, fpg1, PagamentoStatus.PENDENTE, Instant.parse("2021-05-06T08:15:00Z"), 61.00, 0.00, 0.00, 0.00, Instant.parse("2021-06-06T00:00:00Z"), null);
		faturaRepository.saveAll(Arrays.asList(fat2));
		//Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		//Fatura(Long, FormaPagamento, PagamentoStatus, String, Instant, String, String, Double, Double, Double, Instant, Integer)								
	}		
}