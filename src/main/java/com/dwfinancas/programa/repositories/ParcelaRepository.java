package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Parcela;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, Long>{

}
