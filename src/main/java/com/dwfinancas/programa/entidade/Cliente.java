package com.dwfinancas.programa.entidade;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CLI_ID;
	private String CLI_NOME;
	private String CLI_TIPO;
	private String CLI_CFP_CNPJ;
	private LocalDate CLI_DATA_NASCIMENTO;
	private String CLI_CONTATO;
	private String CLI_EMAIL;
	private String CLI_RAZAOSOCIAL;
	private String CLI_NOME_FANTASIA;
	private String CLI_ENDERECO;
	private String CLI_SEGMENTO;

}
