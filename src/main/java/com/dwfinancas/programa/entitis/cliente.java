package com.dwfinancas.programa.entitis;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CLI_ID;
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
