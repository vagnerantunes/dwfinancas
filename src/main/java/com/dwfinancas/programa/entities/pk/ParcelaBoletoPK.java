package com.dwfinancas.programa.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.dwfinancas.programa.entities.Boleto;
import com.dwfinancas.programa.entities.Fatura;

import lombok.Data;

@Embeddable
@Data
public class ParcelaBoletoPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "fatura_id")
	private Fatura fatura;
	
	@ManyToOne
	@JoinColumn(name = "boleto_id")
	private Boleto boleto;

}
