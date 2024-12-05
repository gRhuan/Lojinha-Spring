package com.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.loja.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public String autenticar(@RequestParam String email, @RequestParam String senha) {
        boolean autenticado = loginService.autenticar(email, senha);
        if (autenticado) {
            return "redirect:/clientes"; // Redireciona para a rota "/clientes"
        }
        return "redirect:/login?error=true"; // Redireciona de volta para "/login" com um parâmetro de erro
    }
}

