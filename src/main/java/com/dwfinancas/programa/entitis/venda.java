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
public class venda implements Serializable{		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long VEN_ID;
	private Integer VEN_CLI_ID;
	private Integer VEN_PRO_ID;
	private LocalDate VEN_DATA;
	private Integer VEN_QTD;
	private Double VEN_TOTAL;
	private Double VEN_DESCONTO;
	private Double VEN_JUROS;
}