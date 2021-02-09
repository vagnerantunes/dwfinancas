package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	public cliente(String cLI_NOME, String cLI_TIPO, String cLI_CFP_CNPJ, LocalDate cLI_DATA_NASCIMENTO,
			String cLI_CONTATO, String cLI_EMAIL, String cLI_RAZAOSOCIAL, String cLI_NOME_FANTASIA, String cLI_ENDERECO,
			String cLI_SEGMENTO) {		
		CLI_NOME = cLI_NOME;
		CLI_TIPO = cLI_TIPO;
		CLI_CFP_CNPJ = cLI_CFP_CNPJ;
		CLI_DATA_NASCIMENTO = cLI_DATA_NASCIMENTO;
		CLI_CONTATO = cLI_CONTATO;
		CLI_EMAIL = cLI_EMAIL;
		CLI_RAZAOSOCIAL = cLI_RAZAOSOCIAL;
		CLI_NOME_FANTASIA = cLI_NOME_FANTASIA;
		CLI_ENDERECO = cLI_ENDERECO;
		CLI_SEGMENTO = cLI_SEGMENTO;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CLI_ID;
	private String CLI_NOME;
	private String CLI_TIPO;
	private String CLI_CFP_CNPJ;
	private LocalDate CLI_DATA_NASCIMENTO;
	private String CLI_CONTATO;
	private String CLI_EMAIL;
	private String CLI_RAZAOSOCIAL;
	private String CLI_NOME_FANTASIA;
	private String CLI_ENDERECO;
	private String CLI_SEGMENTO;

}
