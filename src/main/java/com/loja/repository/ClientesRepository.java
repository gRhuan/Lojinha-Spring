package com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
