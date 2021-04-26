package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_venda")
@AllArgsConstructor
@NoArgsConstructor
public class Venda implements Serializable{		
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