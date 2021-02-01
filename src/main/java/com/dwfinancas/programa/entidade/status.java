package com.dwfinancas.programa.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long STA_ID;
	private String STA_DESCRICAO;
	private String STA_TIPO;
}