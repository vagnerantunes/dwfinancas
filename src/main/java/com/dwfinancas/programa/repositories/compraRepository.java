package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.compra;

@Repository
public interface compraRepository extends JpaRepository<compra, Long>{

}
