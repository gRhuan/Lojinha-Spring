package com.loja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.dto.RequisicaoNovoFuncionario;
import com.loja.model.Funcionarios;
import com.loja.repository.FuncionariosRepository;

@Service
public class FuncionarioService {

    private EncryptService encryptService;
    private FuncionariosRepository funcionariosRepository;

    @Autowired
    public void setEncryptService(EncryptService encryptService) {
        this.encryptService = encryptService;
    }

    @Autowired
    public void setFuncionarioRepository(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    // Salvar um novo funcionário
    public Funcionarios save(RequisicaoNovoFuncionario dto) {
        Funcionarios funcionario = dto.toFuncionario();
        funcionario.setSenha(encryptService.encrypt(funcionario.getSenha())); // Criptografar a senha
        return funcionariosRepository.save(funcionario);
    }

    // Buscar todos os funcionários
    public List<Funcionarios> findAll() {
        return funcionariosRepository.findAll();
    }

    // Buscar funcionário por ID
    public Funcionarios findById(Long id) {
        return funcionariosRepository.findById(id).orElse(null);
    }

    // Atualizar funcionário por ID
    public void updateById(Long id, RequisicaoNovoFuncionario requisicao) {
        Optional<Funcionarios> optional = funcionariosRepository.findById(id);
        if (optional.isPresent()) {
            Funcionarios funcionario = optional.get(); // Preservar o ID atual
            funcionario.setNome(requisicao.getNome());
            funcionario.setCpf(requisicao.getCpf());
            funcionario.setEmail(requisicao.getEmail());
            funcionario.setSalario(requisicao.getSalario());
            funcionario.setCargo(requisicao.getCargo());
            funcionario.setSenha(encryptService.encrypt(requisicao.getSenha())); // Criptografar a nova senha
            funcionariosRepository.save(funcionario); // Salvar alterações
        }
    }

    // Deletar funcionário por ID
    public void deleteById(Long id) {
        if (funcionariosRepository.existsById(id)) {
            funcionariosRepository.deleteById(id);
        }
    }
    //oi
}
