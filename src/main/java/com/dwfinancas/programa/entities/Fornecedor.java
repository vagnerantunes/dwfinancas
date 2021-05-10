package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tb_fornecedor")
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long FOR_ID;
	private String FOR_NOME;
	private String FOR_TIPO;
	private String FOR_CPF_CNPJ;
	private String FOR_FANTASIA;
	private String FOR_ENDERECO;
	private String FOR_CONTATO;
	private Integer FOR_EMAIL;
	private String FOR_FLAG;
	
	@Getter
	@JsonIgnore	
	@OneToMany(mappedBy = "fornecedor")
	private List<Compra> compras;
}
