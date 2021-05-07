package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dwfinancas.programa.enums.PagamentoStatus;

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
	
	@ManyToOne
	@JoinColumn(name = "VEN_CLI_ID")
	private Cliente clientes;
	
	@ManyToOne
	@JoinColumn(name = "VEN_FPG_ID")
	private FormaPagamento pagamentos;
	
	@ManyToOne
	@JoinColumn(name = "VEN_USU_ID")
	private Usuario usuarios;
	
	private LocalDate VEN_DATA;	
	private Double VEN_VRTOTAL;
	private Double VEN_VRPAGO;
	private Double VEN_DESCONTO;
	private Double VEN_JUROS;	
	private PagamentoStatus VEN_STS_PAG;
	//CRIAR VEN_STS_ORC
}