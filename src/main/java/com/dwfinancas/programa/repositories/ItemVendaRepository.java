package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.ItemVenda;
import com.dwfinancas.programa.entities.pk.ItemVendaPK;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, ItemVendaPK>{
	
}
