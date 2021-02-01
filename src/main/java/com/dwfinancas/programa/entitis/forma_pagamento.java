package com.dwfinancas.programa.entitis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class forma_pagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FPG_ID;
	private String FPG_TIPO_CONTA;
	private String FPG_DESCRICAO;
	private String FPG_TIPO;
	private Integer FPG_QTDPARCELA;
	private Double FPG_PORCENTAGEM;

}
