package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Boleto;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long>{
	
}
