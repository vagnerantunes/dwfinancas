package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dwfinancas.programa.enums.PagamentoStatus;
import com.dwfinancas.programa.enums.VendaStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_venda")
public class Venda implements Serializable{		
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long VEN_ID;
	
	@Getter
	@OneToMany(mappedBy = "id.venda")
	private Set<ItemVenda> itemVendas = new HashSet<>();				
	
	@Getter
	@ManyToMany
	@JoinTable(name = "tb_venda_parcela", joinColumns = @JoinColumn(name = "venda_id"), 
	inverseJoinColumns = @JoinColumn(name = "parcela_id"))
	private Set<Parcela> parcelas = new HashSet<>();
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "VEN_CLI_ID")
	private Cliente clientes;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "VEN_FPG_ID")
	private FormaPagamento pagamentos;
	
	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "VEN_USU_ID")
	private Usuario usuarios;
	
	@Getter
	@Setter
	private Instant VEN_DATA;
	
	@Getter
	@Setter
	private Double VEN_VRTOTAL;
	
	@Getter
	@Setter
	private Double VEN_VRPAGO;
	
	@Getter
	@Setter
	private Double VEN_DESCONTO;
	
	@Getter
	@Setter
	private Double VEN_JUROS;	
	
	@Getter
	@Setter
	private PagamentoStatus VEN_STS_PAG;
	
	@Getter
	@Setter
	private VendaStatus VEN_STS_ORC;		
	
	public Venda() {		
	}
	
	public Venda(Long vEN_ID, Cliente clientes, FormaPagamento pagamentos, Usuario usuarios, Instant vEN_DATA, Double vEN_VRTOTAL, Double vEN_VRPAGO, Double vEN_DESCONTO,
			Double vEN_JUROS, PagamentoStatus vEN_STS_PAG, VendaStatus vEN_STS_ORC) {
		super();
		VEN_ID = vEN_ID;
		this.clientes = clientes;
		this.pagamentos = pagamentos;
		this.usuarios = usuarios;		
		VEN_DATA = vEN_DATA;
		VEN_VRTOTAL = vEN_VRTOTAL;
		VEN_VRPAGO = vEN_VRPAGO;
		VEN_DESCONTO = vEN_DESCONTO;
		VEN_JUROS = vEN_JUROS;
		VEN_STS_PAG = vEN_STS_PAG;
		VEN_STS_ORC = vEN_STS_ORC;
	}	
		
}