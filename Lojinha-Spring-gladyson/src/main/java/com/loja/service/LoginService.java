package com.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.model.Funcionarios;
import com.loja.repository.FuncionariosRepository;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Autowired
    private EncryptService encryptService;

    public boolean autenticar(String email, String senha) {
        Optional<Funcionarios> optional = funcionariosRepository.findByEmail(email);

        if (optional.isPresent()) {
            Funcionarios funcionario = optional.get();
            String senhaCriptografada = encryptService.encrypt(senha);
            return funcionario.getSenha().equals(senhaCriptografada);
        }
        return false;
    }
}
