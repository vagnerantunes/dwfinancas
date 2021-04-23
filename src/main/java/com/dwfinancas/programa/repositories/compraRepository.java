package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.Compra;

@Repository
public interface compraRepository extends JpaRepository<Compra, Long>{

}
