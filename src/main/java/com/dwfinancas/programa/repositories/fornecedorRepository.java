package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Fornecedor;

@Repository
public interface fornecedorRepository extends JpaRepository<Fornecedor, Long>{

}
