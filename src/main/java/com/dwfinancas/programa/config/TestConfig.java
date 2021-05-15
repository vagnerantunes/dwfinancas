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
import com.dwfinancas.programa.entities.ItemVenda;
import com.dwfinancas.programa.entities.ParcelaVenda;
import com.dwfinancas.programa.entities.Produto;
import com.dwfinancas.programa.entities.Usuario;
import com.dwfinancas.programa.entities.Venda;
import com.dwfinancas.programa.enums.PagamentoStatus;
import com.dwfinancas.programa.enums.VendaStatus;
import com.dwfinancas.programa.repositories.ClienteRepository;
import com.dwfinancas.programa.repositories.FaturaRepository;
import com.dwfinancas.programa.repositories.FormaPagamentoRepository;
import com.dwfinancas.programa.repositories.ItemVendaRepository;
import com.dwfinancas.programa.repositories.ParcelaVendaRepository;
import com.dwfinancas.programa.repositories.ProdutoRepository;
import com.dwfinancas.programa.repositories.UsuarioRepository;
import com.dwfinancas.programa.repositories.VendaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private FaturaRepository faturaRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ParcelaVendaRepository parcelaVendaRepository; 
	
	@Autowired
	private ProdutoRepository produtoRepository; 
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private ItemVendaRepository itemVendaRepository; 		
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cli1 = new Cliente(null, "Vagner Antunes de Souza", "PF", "097.551.319-22", 
				Instant.parse("1994-01-07T10:00:00Z"), "(43) 99139-7159", "vagner.antunes0701@outlook.com", null, null, 
				"RUA SOFIA KUSKOSK MENDES, N°134", null, null, null);
		clienteRepository.saveAll(Arrays.asList(cli1));		
		
		FormaPagamento fpg1 = new FormaPagamento(null, "PAGAMENTO", "DAS", "MENSAL", 1, 0.00, null, null, null);
		formaPagamentoRepository.saveAll(Arrays.asList(fpg1));
				
		Fatura fat2 = new Fatura(null, fpg1, Instant.parse("2021-05-06T08:15:00Z"), 61.00, 0.00, 0.00, 0.00, 
				Instant.parse("2021-06-06T00:00:00Z"), null, PagamentoStatus.PENDENTE);		
		faturaRepository.saveAll(Arrays.asList(fat2));
		
		Usuario usu1 = new Usuario(null, "Vagner Antunes", "A", "Proprietario", "123456", null);
		usuarioRepository.saveAll(Arrays.asList(usu1));
		
		Produto pro1 = new Produto(null, "SUMUP TOP", 20.80, 50.80, 3.00, 0.00, "A", null);
		produtoRepository.saveAll(Arrays.asList(pro1));
		
		
		ParcelaVenda pvd1 = new ParcelaVenda(null, 1, 58.80, 58.80, Instant.parse("2021-05-14T00:00:00Z"), 
				1, PagamentoStatus.PENDENTE, null);
		parcelaVendaRepository.saveAll(Arrays.asList(pvd1));				
		
		Venda ven1 = new Venda(null, cli1, fpg1, usu1, null, null, Instant.parse("2021-05-15T00:00:00Z"), 
				58.80, 58.80, 0.00, 0.00, PagamentoStatus.PAGO_TOTAL, VendaStatus.PEDIDO);
		vendaRepository.saveAll(Arrays.asList(ven1));
						
		
		vendaRepository.saveAll(Arrays.asList(ven1));				
		
		ItemVenda vpr1 = new ItemVenda(ven1, pro1, 1.00, 58.80, 20.80);
		itemVendaRepository.saveAll(Arrays.asList(vpr1));
	}		
}