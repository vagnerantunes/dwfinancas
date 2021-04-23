package com.dwfinancas.programa.entities;

import java.io.Serializable;

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
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PRO_ID;
	private String PRO_DESCRICAO; 
	private Double PRO_PRECOCUSTO;
	private Double PRO_PRECODEVENDA;
	private Double PRO_MARGEMDELUCRO;		

}
