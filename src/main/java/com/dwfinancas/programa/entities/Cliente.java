package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_cliente")
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;				
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long CLI_ID;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_NOME;
	@Getter
	@Setter
	@Column(length = 15)
	private String CLI_TIPO;
	@Getter
	@Setter
	@Column(length = 15)
	private String CLI_CFPCNPJ;
	@Getter
	@Setter
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant CLI_DATANASCIMENTO;
	@Getter
	@Setter
	@Column(length = 15)
	private String CLI_CONTATO;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_EMAIL;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_RAZAOSOCIAL;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_NOMEFANTASIA;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_ENDERECO;
	@Getter
	@Setter
	@Column(length = 45)
	private String CLI_SEGMENTO;
	
	@Getter
	@Setter
	@Column(length = 1)
	private String CLI_FLAG;
	
	//Lista não tem Set, somente Get.
	@Getter
	@JsonIgnore
	@OneToMany(mappedBy = "clientes")
	private List<Venda> vendas = new ArrayList<>();
}