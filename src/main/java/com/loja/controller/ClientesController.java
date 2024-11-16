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

import com.loja.dto.RequisicaoNovoCliente;
import com.loja.model.Clientes;
import com.loja.repository.ClientesRepository;
import com.loja.service.ClientesService;

@Controller
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/api/clientes")
    public List<Clientes> clientes() {
        return clientesService.getAllClientes();
    }

    @GetMapping("/clientes")
    public ModelAndView index() {
        List<Clientes> clientes = clientesService.getAllClientes();

        ModelAndView mv = new ModelAndView("clientes/index");

        mv.addObject("clientes", clientes);

        return mv;
    }

    @PostMapping("/clientes/adicionar")
    public String criar(RequisicaoNovoCliente requisicao) {
        Clientes cliente = requisicao.toClientes();
        this.clientesRepository.save(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/{id}")
    @ResponseBody
    public Clientes getProduto(@PathVariable Long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    @GetMapping("/produtos/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        Optional<Clientes> optional = this.clientesRepository.findById(id);
        if (optional.isPresent()) {
            Clientes clientes = optional.get();
            ModelAndView mv = new ModelAndView("clientes/editar");
            mv.addObject("clientes", clientes);
            return mv;
        } else {
            return new ModelAndView("redirect:/clientes");
        }
    }

    @PostMapping("/clientes/{id}/atualizar")
    public String atualizar(@PathVariable Long id, RequisicaoNovoCliente requisicao) {
        Optional<Clientes> optional = this.clientesRepository.findById(id);
        if (optional.isPresent()) {
            Clientes clientes = optional.get();
            clientes.setNome(requisicao.getNome());
            clientes.setCpf(requisicao.getCpf());
            clientes.setEmail(requisicao.getEmail());
            clientes.setEndereco(requisicao.getEndereco());
            this.clientesRepository.save(clientes);
        }
        return "redirect:/clientes";
    }

    @PostMapping("/clientes/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        Optional<Clientes> optional = this.clientesRepository.findById(id);
        if (optional.isPresent()) {
            this.clientesRepository.deleteById(id);
        }
        return "redirect:/clientes";
    }


}
