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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_venda")
@AllArgsConstructor
@NoArgsConstructor
public class Venda implements Serializable{		
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long VEN_ID;
	
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
	@OneToMany(mappedBy = "id.venda")
	private Set<ItemVenda> itemVendas = new HashSet<>();				
	
	@Getter
	@ManyToMany
	@JoinTable(name = "tb_venda_parcela", joinColumns = @JoinColumn(name = "venda_id"), 
	inverseJoinColumns = @JoinColumn(name = "parcela_id"))
	private Set<ParcelaVenda> parcelas = new HashSet<>();	
	
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
	
}