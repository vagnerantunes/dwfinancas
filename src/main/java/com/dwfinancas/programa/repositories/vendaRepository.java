package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.venda;

@Repository
public interface vendaRepository extends JpaRepository<venda, Long>{

}
