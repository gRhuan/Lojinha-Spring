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

import com.loja.dto.RequisicaoNovoFuncionario;
import com.loja.model.Funcionarios;
import com.loja.repository.FuncionariosRepository;
import com.loja.service.FuncionariosService;


@Controller
public class FuncionariosController {

    @Autowired
    private FuncionariosService funcionariosService; // Injetando o serviço

    @Autowired
    private FuncionariosRepository funcionariosRepository;

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

    @PostMapping("/funcionarios/adicionar")
    public String criar(RequisicaoNovoFuncionario requisicao) {
        Funcionarios funcionario = requisicao.toFuncionario();
        this.funcionariosRepository.save(funcionario);
        return "redirect:/funcionarios";
    }

    @GetMapping("/funcionarios/{id}")
    @ResponseBody
    public Funcionarios getProduto(@PathVariable Long id) {
        return funcionariosRepository.findById(id).orElse(null);
    }

    @GetMapping("/funcionarios/{id}/editar")
    public ModelAndView editar(@PathVariable Long id) {
        Optional<Funcionarios> optional = this.funcionariosRepository.findById(id);
        if (optional.isPresent()) {
            Funcionarios funcionarios = optional.get();
            ModelAndView mv = new ModelAndView("funcionarios/editar");
            mv.addObject("funcionarios", funcionarios);
            return mv;
        } else {
            return new ModelAndView("redirect:/funcionarios");
        }
    }

    @PostMapping("/funcionarios/{id}/atualizar")
    public String atualizar(@PathVariable Long id, RequisicaoNovoFuncionario requisicao) {
        Optional<Funcionarios> optional = this.funcionariosRepository.findById(id);
        if (optional.isPresent()) {
            Funcionarios funcionarios = optional.get();
            funcionarios.setNome(requisicao.getNome());
            funcionarios.setCpf(requisicao.getCpf());
            funcionarios.setEmail(requisicao.getEmail());
            funcionarios.setSalario(requisicao.getSalario());
            funcionarios.setSenha(requisicao.getSenha());
            this.funcionariosRepository.save(funcionarios);
        }
        return "redirect:/funcionarios";
    }

    @PostMapping("/funcionarios/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        Optional<Funcionarios> optional = this.funcionariosRepository.findById(id);
        if (optional.isPresent()) {
            this.funcionariosRepository.deleteById(id);
        }
        return "redirect:/funcionarios";
    }

}
