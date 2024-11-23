package com.loja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.loja.dto.RequisicaoNovoProduto;
import com.loja.model.Produtos;
import com.loja.repository.ProdutosRepository;

@Service
public class ProdutoService {

    private final ProdutosRepository produtosRepository;

    public ProdutoService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    // Buscar todos os produtos
    public List<Produtos> findAll() {
        return produtosRepository.findAll();
    }

    // Salvar um novo produto
    public Produtos save(RequisicaoNovoProduto requisicao) {
        Produtos produto = requisicao.toProdutos();
        return produtosRepository.save(produto);
    }

    // Buscar produto por ID
    public Produtos findById(Long id) {
        return produtosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
    }

    // Deletar produto por ID
    public void deleteById(Long id) {
        if (produtosRepository.existsById(id)) {
            produtosRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado com o ID: " + id);
        }
    }

    // Atualizar produto por ID
    public void updateById(Long id, RequisicaoNovoProduto requisicao) {
        Optional<Produtos> optional = produtosRepository.findById(id);
        if (optional.isPresent()) {
            Produtos produtos = optional.get(); // Preservar o ID atual
            produtos.setNome(requisicao.getNome());
            produtos.setDescricao(requisicao.getDescricao());
            produtos.setEstoque(requisicao.getEstoque());
            produtos.setValor(requisicao.getValor());
            produtosRepository.save(produtos); // Salvar alterações
        }
    }
}
