package com.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.model.Funcionarios;
import com.loja.repository.FuncionariosRepository;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    public List<Funcionarios> getAllFuncionarios() {
        return funcionariosRepository.findAll();
    }

}
