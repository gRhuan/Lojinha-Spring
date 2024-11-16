package com.loja.dto;
import java.math.BigDecimal;
import com.loja.model.Produtos;

public class RequisicaoNovoProduto {

    private String nome;
    private String descricao;
    private int estoque;
    private BigDecimal valor;

    public Produtos toProdutos(){
        Produtos produtos = new Produtos();
        produtos.setNome(this.nome);
        produtos.setDescricao(this.descricao);
        produtos.setEstoque(this.estoque);
        produtos.setValor(this.valor);
        return produtos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    

}
