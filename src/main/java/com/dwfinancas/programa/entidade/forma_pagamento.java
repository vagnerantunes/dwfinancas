package com.dwfinancas.programa.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class forma_pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long FPG_ID;
	private String FPG_TIPO_CONTA;
	private String FPG_DESCRICAO;
	private String FPG_TIPO;
	private Integer FPG_QTDPARCELA;
	private Double FPG_PORCENTAGEM;

}
