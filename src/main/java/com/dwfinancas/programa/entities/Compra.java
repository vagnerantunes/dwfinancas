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

import com.dwfinancas.programa.enums.DocumentoStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_compra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long COM_ID;	

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "COM_FOR_ID")
	private Fornecedor fornecedor;	
	
	@Getter
	@OneToMany(mappedBy = "id.compra")
	private Set<ItemCompra> itemCompras = new HashSet<>();				
	
	@Getter
	@Setter
	private Instant COM_DATA;
	
	@Getter
	@Setter
	private Double COM_VALORTOTAL;
	
	@Getter
	@Setter
	private Double COM_DESCONTO;
	
	@Getter
	@Setter
	private Double COM_JUROS;
	
	@Getter
	@Setter
	private DocumentoStatus COM_STS_DOC;
	
	public Compra() {		
	}

	public Compra(Long cOM_ID, Fornecedor fornecedor, Instant cOM_DATA, Double cOM_VALORTOTAL,
			Double cOM_DESCONTO, Double cOM_JUROS, DocumentoStatus cOM_STS_DOC) {
		super();
		COM_ID = cOM_ID;
		this.fornecedor = fornecedor;		
		COM_DATA = cOM_DATA;
		COM_VALORTOTAL = cOM_VALORTOTAL;
		COM_DESCONTO = cOM_DESCONTO;
		COM_JUROS = cOM_JUROS;
		COM_STS_DOC = cOM_STS_DOC;
	}

	
}