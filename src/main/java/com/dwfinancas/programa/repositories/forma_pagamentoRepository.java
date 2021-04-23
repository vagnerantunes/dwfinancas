package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.FormaPagamento;

@Repository
public interface forma_pagamentoRepository extends JpaRepository<FormaPagamento, Long>{

}
