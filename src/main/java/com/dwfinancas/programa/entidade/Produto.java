package com.dwfinancas.programa.entidade;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Produto {
	
	private long PRO_ID;
	private String PRO_DESCRICAO; 
	private Double PRO_PRECOCUSTO;
	private Double PRO_PRECODEVENDA;
	private Double PRO_MARGEMDELUCRO;		

}
