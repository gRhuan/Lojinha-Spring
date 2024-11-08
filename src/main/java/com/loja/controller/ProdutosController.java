package com.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loja.model.Produtos;
import com.loja.service.ProdutosService;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService; // Injetando o serviço

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

}
