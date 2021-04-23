package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Fatura;

@Repository
public interface fatura_pessoal_necociosRepository extends JpaRepository<Fatura, Long>{

}
