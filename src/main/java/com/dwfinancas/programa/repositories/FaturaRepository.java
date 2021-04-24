package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Fatura;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long>{

}
