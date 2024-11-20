package com.loja.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.loja.dto.RequisicaoNovoProduto;
import com.loja.model.Produtos;
import com.loja.repository.ProdutosRepository;
import com.loja.service.ProdutosService;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService; // Injetando o serviço
    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping("/api/produtos")
    public List<Produtos> getAllProdutos() {
        return produtosService.getAllProdutos(); // Chamando o serviço
    }

    @GetMapping("/produtos")
    public ModelAndView index() {
        List<Produtos> produtos = produtosService.getAllProdutos();

        ModelAndView mv = new ModelAndView("produtos/index");

        mv.addObject("produtos", produtos);
        return mv;
    }

    @PostMapping("/produtos/adicionar")
    public String criar(RequisicaoNovoProduto requisicao) {
        Produtos produto = requisicao.toProdutos();
        this.produtosRepository.save(produto);
        return "redirect:/produtos";
    }

    @GetMapping("/produtos/{id}") // Aqui ele busca as informações do produto pelo id
    @ResponseBody
    public Produtos getProduto(@PathVariable Long id) {
        return produtosRepository.findById(id).orElse(null);
    }

    @PostMapping("/produtos/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        Optional<Produtos> optional = this.produtosRepository.findById(id);
        if (optional.isPresent()) {
            Produtos produto = optional.get();
            ModelAndView mv = new ModelAndView("produtos/editar");
            mv.addObject("produto", produto);
            return mv;
        } else {
            return new ModelAndView("redirect:/produtos");
        }
    }

    @PostMapping("/produtos/{id}/atualizar")
    public String atualizar(@PathVariable Long id, RequisicaoNovoProduto requisicao) {
        Optional<Produtos> optional = this.produtosRepository.findById(id);
        if (optional.isPresent()) {
            Produtos produto = optional.get();
            produto.setNome(requisicao.getNome());
            produto.setDescricao(requisicao.getDescricao());
            produto.setValor(requisicao.getValor());
            produto.setEstoque(requisicao.getEstoque());
            this.produtosRepository.save(produto);
        }
        return "redirect:/produtos";
    }

    @PostMapping("/produtos/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        Optional<Produtos> optional = this.produtosRepository.findById(id);
        if (optional.isPresent()) {
            this.produtosRepository.deleteById(id);
        }
        return "redirect:/produtos";
    }
}
