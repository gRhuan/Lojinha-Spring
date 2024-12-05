package com.loja.dto;

import com.loja.model.Clientes;

public class RequisicaoNovoCliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String celular;

    public Clientes toClientes() {
        Clientes clientes = new Clientes();
        clientes.setNome(this.nome);
        clientes.setCpf(this.cpf);
        clientes.setEndereco(this.endereco);
        clientes.setEmail(this.email);
        clientes.setCelular(this.celular);
        return clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

   
}
