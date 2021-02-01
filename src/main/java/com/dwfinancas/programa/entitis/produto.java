package com.dwfinancas.programa.entitis;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long PRO_ID;
	private String PRO_DESCRICAO; 
	private Double PRO_PRECOCUSTO;
	private Double PRO_PRECODEVENDA;
	private Double PRO_MARGEMDELUCRO;		

}
