package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_formaPagamento")
@AllArgsConstructor
@NoArgsConstructor
public class FormaPagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FPG_ID;
	
	@Getter
	@Setter
	private String FPG_TIPO_CONTA;
	
	@Getter
	@Setter
	private String FPG_DESCRICAO;
	
	@Getter
	@Setter
	private String FPG_TIPO;
	
	@Getter
	@Setter
	private Integer FPG_QTDPARCELA;
	
	@Getter
	@Setter
	private Double FPG_PORCENTAGEM;
	
	@Getter
	@JsonIgnore
	@OneToMany(mappedBy = "pagamentos")
	private List<Venda> vendas = new ArrayList<>();
	
	@Getter
	@JsonIgnore
	@OneToMany(mappedBy = "pagamentos")
	private List<Fatura> faturas = new ArrayList<>();
}
