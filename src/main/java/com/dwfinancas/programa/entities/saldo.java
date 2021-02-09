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
public class saldo implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long SAL_ID;	
	private Integer SAL_FAT_ID;
	private LocalDate SAL_DATA;
	private Double SAL_APAGAR;
	private Double SAL_ARECEBER;
	private Double SAL_DIFERENCA;

}
