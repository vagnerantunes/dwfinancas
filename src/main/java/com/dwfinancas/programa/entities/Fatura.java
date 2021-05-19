package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dwfinancas.programa.enums.PagamentoStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_fatura")
public class Fatura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FAT_ID;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "FAT_FPG_ID")
	private FormaPagamento pagamentos;
	@Getter
	@Setter
	private Instant FAT_DATALANCAMENTO;
	@Getter
	@Setter
	private Double FAT_VALORTOTAL;
	@Getter
	@Setter
	private Double FAT_DESCONTO;
	@Getter
	@Setter
	private Double FAT_JUROS;
	@Getter
	@Setter
	private Double FAT_VALORPAGO;
	@Getter
	@Setter
	private Instant FAT_VENCIMENTO;
	@Getter
	@Setter
	private Integer FAT_ATRASO;
	@Getter
	@Setter
	private PagamentoStatus FAT_STS_PAG;	
	
	@Getter
	@OneToMany(mappedBy = "id.fatura")
	private Set<ParcelaBoleto> parcelaBoletos = new HashSet<>();

	public Fatura() {
		super();
	}

	public Fatura(Long fAT_ID, FormaPagamento pagamentos, Instant fAT_DATALANCAMENTO, Double fAT_VALORTOTAL,
			Double fAT_DESCONTO, Double fAT_JUROS, Double fAT_VALORPAGO, Instant fAT_VENCIMENTO, Integer fAT_ATRASO,
			PagamentoStatus fAT_STS_PAG) {
		super();
		FAT_ID = fAT_ID;
		this.pagamentos = pagamentos;
		FAT_DATALANCAMENTO = fAT_DATALANCAMENTO;
		FAT_VALORTOTAL = fAT_VALORTOTAL;
		FAT_DESCONTO = fAT_DESCONTO;
		FAT_JUROS = fAT_JUROS;
		FAT_VALORPAGO = fAT_VALORPAGO;
		FAT_VENCIMENTO = fAT_VENCIMENTO;
		FAT_ATRASO = fAT_ATRASO;
		FAT_STS_PAG = fAT_STS_PAG;
	}	
	
}