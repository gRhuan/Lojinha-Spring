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
    @ResponseBody
    public String autenticar(@RequestParam String email, @RequestParam String senha) {
        boolean autenticado = loginService.autenticar(email, senha);
        if (autenticado) {
            return "Autenticação bem-sucedida!";
        }
        return "E-mail ou senha inválidos!";
    }
}

