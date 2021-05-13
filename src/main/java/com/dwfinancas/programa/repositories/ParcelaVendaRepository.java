package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.ParcelaVenda;

@Repository
public interface ParcelaVendaRepository extends JpaRepository<ParcelaVenda, Long>{

}