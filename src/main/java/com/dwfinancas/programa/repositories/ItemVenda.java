package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwfinancas.programa.entities.pk.ItemVendaPK;

public interface ItemVenda extends JpaRepository<ItemVenda, ItemVendaPK>{

}
