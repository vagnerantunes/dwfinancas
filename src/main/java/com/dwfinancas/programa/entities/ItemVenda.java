package com.dwfinancas.programa.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dwfinancas.programa.entities.pk.ItemVendaPK;

@Entity
@Table(name = "tb_item_venda")
public class ItemVenda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ItemVendaPK id = new ItemVendaPK();
	
	private Double VPR_QTD;
	private Double VPR_PRECOVENDA;
	private Double VPR_PRECOCUSTO;
	
	public ItemVenda() {	
	}

	public ItemVenda(ItemVendaPK id, Double vPR_QTD, Double vPR_PRECOVENDA, Double vPR_PRECOCUSTO) {
		super();
		this.id = id;
		VPR_QTD = vPR_QTD;
		VPR_PRECOVENDA = vPR_PRECOVENDA;
		VPR_PRECOCUSTO = vPR_PRECOCUSTO;
	}
	
	
	
}
