package com.dwfinancas.programa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data	
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long USU_ID;
	
	@Column(length = 45, nullable = false)
	private String USU_NOME;
	
	@Column(length = 1, nullable = false)
	private String USU_FLAG;
	
	@Column(length = 15, nullable = false)
	private String USU_FUNCAO;
	
	@Column(length = 11, nullable = false)
	private String USU_SENHA;
	
	@Getter
	@JsonIgnore
	@OneToMany(mappedBy = "usuarios")
	private List<Usuario> usuarios = new ArrayList<>();	
}