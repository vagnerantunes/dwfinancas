package com.dwfinancas.programa.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class fornecedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long FOR_ID;
	private String FOR_NOME;
	private String FOR_TIPO;
	private String FOR_CPF_CNPJ;
	private String FOR_FANTASIA;
	private String FOR_ENDERECO;
	private String FOR_CONTATO;
	private Integer FOR_EMAIL;
	
	
}
