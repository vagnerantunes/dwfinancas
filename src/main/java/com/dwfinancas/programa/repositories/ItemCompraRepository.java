package com.dwfinancas.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwfinancas.programa.entities.ItemCompra;
import com.dwfinancas.programa.entities.pk.ItemCompraPK;

@Repository
public interface ItemCompraRepository extends JpaRepository<ItemCompra, ItemCompraPK>{

}
