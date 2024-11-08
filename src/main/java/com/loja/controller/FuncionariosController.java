package com.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loja.model.Funcionarios;
import com.loja.service.FuncionariosService;

@Controller
public class FuncionariosController {

    @Autowired
    private FuncionariosService funcionariosService; // Injetando o serviço

    @GetMapping("/api/funcionarios")
    public List<Funcionarios> getAllFuncionarios() {
        return funcionariosService.getAllFuncionarios(); // Chamando o serviço
    }

    @GetMapping("/funcionarios")
    public ModelAndView index() {
        List<Funcionarios> funcionarios = funcionariosService.getAllFuncionarios(); // Chamando o serviço

        ModelAndView mv = new ModelAndView("funcionarios/index");
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }
}