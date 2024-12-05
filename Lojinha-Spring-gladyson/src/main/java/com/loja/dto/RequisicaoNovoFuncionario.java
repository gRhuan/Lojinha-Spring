package com.loja.dto;

import java.math.BigDecimal;

import com.loja.model.Funcionarios;

public class RequisicaoNovoFuncionario {

    private String nome;
    private String cpf;
    private BigDecimal salario;
    private String email;
    private String cargo;
    private String senha;

    public Funcionarios toFuncionario() {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setNome(this.nome);
        funcionarios.setCpf(this.cpf);
        funcionarios.setSalario(this.salario);
        funcionarios.setEmail(this.email);
        funcionarios.setCargo(this.cargo);
        funcionarios.setSenha(this.senha);
        return funcionarios;
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

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
