package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.fornecedor;

@Repository
public interface fornecedorRepository extends JpaRepository<fornecedor, Long>{

}
