package com.dwfinancas.programa.entities;

import java.io.Serializable;

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
@Table(name = "tb_formaPagamento")
@AllArgsConstructor
@NoArgsConstructor
public class FormaPagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FPG_ID;
	private String FPG_TIPO_CONTA;
	private String FPG_DESCRICAO;
	private String FPG_TIPO;
	private Integer FPG_QTDPARCELA;
	private Double FPG_PORCENTAGEM;

}
