package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.forma_pagamento;

@Repository
public interface forma_pagamentoRepository extends JpaRepository<forma_pagamento, Long>{

}
