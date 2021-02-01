package com.dwfinancas.programa.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class venda {	
	private long VEN_ID;
	private Integer VEN_CLI_ID;
	private Integer VEN_PRO_ID;
	private LocalDate VEN_DATA;
	private Integer VEN_QTD;
	private Double VEN_TOTAL;
	private Double VEN_DESCONTO;
	private Double VEN_JUROS;
}