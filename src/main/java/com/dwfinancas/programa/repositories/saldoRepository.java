package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.saldo;

@Repository
public interface saldoRepository extends JpaRepository<saldo, Long>{

}
