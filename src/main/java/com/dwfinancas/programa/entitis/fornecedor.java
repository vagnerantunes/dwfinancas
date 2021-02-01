package com.dwfinancas.programa.entitis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FOR_ID;
	private String FOR_NOME;
	private String FOR_TIPO;
	private String FOR_CPF_CNPJ;
	private String FOR_FANTASIA;
	private String FOR_ENDERECO;
	private String FOR_CONTATO;
	private Integer FOR_EMAIL;
	
	
}
