package com.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.loja.dto.RequisicaoNovoCliente;
import com.loja.model.Clientes;
import com.loja.service.ClienteService;

@Controller
@RequestMapping("/clientes") // Agrupando rotas relacionadas a clientes
public class ClientesController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/api")
    @ResponseBody
    public List<Clientes> clientesApi() {
        return clienteService.findAll();
    }

    @GetMapping
    public ModelAndView index() {
        List<Clientes> clientes = clienteService.findAll();
        ModelAndView mv = new ModelAndView("clientes/index");
        mv.addObject("clientes", clientes);
        return mv;
    }

    @PostMapping("/adicionar")
    public String criar(RequisicaoNovoCliente requisicao) {
        clienteService.save(requisicao);
        return "redirect:/clientes";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Clientes getCliente(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        Clientes cliente = clienteService.findById(id);
        ModelAndView mv = new ModelAndView("clientes/editar");
        mv.addObject("clientes", cliente);
        return mv;
    }

    @PostMapping("/{id}/atualizar")
    public String atualizar(@PathVariable Long id, RequisicaoNovoCliente requisicao) {
        clienteService.updateById(id, requisicao);
        return "redirect:/clientes";
    }

    @PostMapping("/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        clienteService.deleteById(id);
        return "redirect:/clientes";
    }
}
