package com.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja.dto.RequisicaoNovoCliente;
import com.loja.model.Clientes;
import com.loja.repository.ClientesRepository;

@Service
public class ClienteService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> findAll() {
        return clientesRepository.findAll();
    }

    public Clientes findById(Long id) {
        return clientesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }

    public Clientes save(RequisicaoNovoCliente requisicao) {
        Clientes cliente = requisicao.toClientes();
        return clientesRepository.save(cliente);
    }

    public void updateById(Long id, RequisicaoNovoCliente requisicao) {
        Clientes cliente = this.findById(id);
        cliente.setNome(requisicao.getNome());
        cliente.setCpf(requisicao.getCpf());
        cliente.setEmail(requisicao.getEmail());
        cliente.setEndereco(requisicao.getEndereco());
        clientesRepository.save(cliente);
    }

    public void deleteById(Long id) {
        if (clientesRepository.existsById(id)) {
            clientesRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }
}
