package com.dwfinancas.programa.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.dwfinancas.programa.entities.pk.ItemVendaPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_item_venda")
public class ItemVenda implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ItemVendaPK id = new ItemVendaPK();
	
	@Getter
	@Setter
	private Double VPR_QTD;
	
	@Getter
	@Setter
	private Double VPR_PRECOVENDA;
	
	@Getter
	@Setter
	private Double VPR_PRECOCUSTO;
	
	public ItemVenda() {	
	}

	public ItemVenda(Venda venda, Produto produto, Double VPR_QTD, Double VPR_PRECOVENDA, Double VPR_PRECOCUSTO) {
		super();
		id.setVenda(venda);
		id.setProduto(produto);
		this.VPR_QTD = VPR_QTD;
		this.VPR_PRECOVENDA = VPR_PRECOVENDA;
		this.VPR_PRECOCUSTO = VPR_PRECOCUSTO;
	}
	
	@JsonIgnore
	public Venda getVenda() {
		return id.getVenda();
	}
	
	public void setVenda(Venda venda) {
		id.setVenda(venda);
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}
	
}