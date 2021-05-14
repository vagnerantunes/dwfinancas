package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_produto")
@AllArgsConstructor
@NoArgsConstructor
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PRO_ID;
	
	@Getter
	@Setter
	private String PRO_DESCRICAO;
	
	@Getter
	@Setter
	private Double PRO_PRECOCUSTO;
	
	@Getter
	@Setter
	private Double PRO_PRECODEVENDA;
	
	@Getter
	@Setter
	private Double PRO_ESTOQUE;
	
	@Getter
	@Setter
	private Double PRO_ESTVENDIDO;
	
	@Getter
	@Setter
	private String PRO_FLAG;	
	
	@Getter
	@OneToMany(mappedBy = "id.produto")
	private Set<ItemVenda> itemVendas = new HashSet<>();		

}