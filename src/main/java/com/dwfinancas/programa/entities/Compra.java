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

import com.dwfinancas.programa.enums.DocumentoStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_compra")
@AllArgsConstructor
@NoArgsConstructor
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long COM_ID;	
	
	@ManyToOne
	@JoinColumn(name = "COM_FOR_ID")
	private Fornecedor fornecedor;
	
	private Integer COM_PRO_ID;	
	private Instant COM_DATA;	
	private Double COM_VALORTOTAL;
	private Double COM_DESCONTO;
	private Double COM_JUROS;
	private DocumentoStatus COM_STS_DOC;	
}