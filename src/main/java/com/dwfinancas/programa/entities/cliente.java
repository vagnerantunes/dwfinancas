package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;				
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CLI_ID;
	@Column(length = 45, nullable = false)
	private String CLI_NOME;
	@Column(length = 15, nullable = false)
	private String CLI_TIPO;
	@Column(length = 15)
	private String CLI_CFPCNPJ;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant CLI_DATANASCIMENTO;	
	@Column(length = 15)
	private String CLI_CONTATO;	
	@Column(length = 45)
	private String CLI_EMAIL;	
	@Column(length = 45)
	private String CLI_RAZAOSOCIAL;	
	@Column(length = 45)
	private String CLI_NOMEFANTASIA;	
	@Column(length = 45)
	private String CLI_ENDERECO;	
	@Column(length = 45)
	private String CLI_SEGMENTO;
	


}