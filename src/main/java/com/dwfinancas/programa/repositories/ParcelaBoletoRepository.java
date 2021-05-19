package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.ParcelaBoleto;
import com.dwfinancas.programa.entities.pk.ParcelaBoletoPK;

@Repository
public interface ParcelaBoletoRepository extends JpaRepository<ParcelaBoleto, ParcelaBoletoPK>{

}
