package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.fatura_pessoal_negocios;

@Repository
public interface fatura_pessoal_necociosRepository extends JpaRepository<fatura_pessoal_negocios, Long>{

}
