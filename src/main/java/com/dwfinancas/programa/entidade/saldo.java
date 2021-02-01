package com.dwfinancas.programa.entidade;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class saldo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long SAL_ID;
	private Integer SAL_FAT_ID;
	private LocalDate SAL_DATA;
	private Double SAL_APAGAR;
	private Double SAL_ARECEBER;
	private Double SAL_DIFERENCA;

}
