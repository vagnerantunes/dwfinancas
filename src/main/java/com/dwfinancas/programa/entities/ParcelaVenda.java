package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dwfinancas.programa.enums.PagamentoStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_parcelaVenda")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParcelaVenda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PVD_ID;
	private Integer PVD_PARCELA;
	private Double PVD_VRPARCELA;
	private Double PVD_VRPAGO;
	private Instant PVD_DTVENCIMENTO;
	private Integer PVD_ATRASO;
	private PagamentoStatus PVD_SITUACAO;
	
}