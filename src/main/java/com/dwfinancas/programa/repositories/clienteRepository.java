package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.cliente;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Long> {
	

}