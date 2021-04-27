package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{

}
