package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long COM_ID;
	private Integer COM_PRO_ID;
	private Integer COM_FOR_ID;
	private String COM_DESCRICAO;
	private LocalDate COM_DATA;
	private Integer COM_QTD;
	private BigDecimal COM_VALORTOTAL;
	private BigDecimal COM_DESCONTO;
	private BigDecimal COM_JUROS;
}