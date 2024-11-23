package com.loja.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.model.Funcionarios;

public interface FuncionariosRepository extends JpaRepository<Funcionarios, Long>{
    Optional<Funcionarios> findByEmail(String email);
}


