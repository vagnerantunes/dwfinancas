package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long>{

}
