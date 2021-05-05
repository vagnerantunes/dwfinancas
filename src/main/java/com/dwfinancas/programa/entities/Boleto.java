package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_boleto")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Boleto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long BOL_ID;	
	private String BOL_DESCRICAO;
	private Instant BOL_DATA;
	private Double BOL_VALOR;
	private Integer BOL_QTDPARCELAS;
	private String BOL_CONTAPFPJ;
	private String BOL_OBS;
	
}