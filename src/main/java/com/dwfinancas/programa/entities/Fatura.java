package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dwfinancas.programa.enums.FaturaStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_fatura")
@AllArgsConstructor
@NoArgsConstructor
public class Fatura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FAT_ID;
	
	@ManyToOne
	@JoinColumn(name = "FAT_FPG_ID")
	private FormaPagamento pagamentos;		
	private FaturaStatus faturaStatus;	
	private String FAT_DESCRICAO;
	private Instant FAT_DATALANCAMENTO;	
	private String FAT_CONTA;
	private String FAT_OBSERVACAO;
	private Double FAT_VALORPARCELA;
	private Double FAT_VALORPAGO;
	private Double FAT_SALDO;	
	private Instant FAT_VENCIMENTO;
	private Integer FAT_ATRASO;
	
}
