package com.loja.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.loja.dto.RequisicaoNovoFuncionario;
import com.loja.model.Funcionarios;
import com.loja.service.FuncionarioService;

@Controller
public class FuncionariosController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/#/funcionarios")
    public List<Funcionarios> getAllFuncionarios() {
        return funcionarioService.findAll();
    }

    @GetMapping("/funcionarios")
    public ModelAndView index() {
        List<Funcionarios> funcionarios = funcionarioService.findAll();
        // Controla oque vai ser exibido
        ModelAndView mv = new ModelAndView("funcionarios/index");
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @PostMapping("/funcionarios/adicionar")
    public String criar(RequisicaoNovoFuncionario requisicao) {
        funcionarioService.save(requisicao);
        return "redirect:/funcionarios";
    }

    @GetMapping("/funcionarios/{id}")
    @ResponseBody
    public Funcionarios getProduto(@PathVariable Long id) {
        return funcionarioService.findById(id);
    }

    @PostMapping("/funcionarios/{id}/atualizar")
    public String atualizar(@PathVariable Long id, RequisicaoNovoFuncionario requisicao) {
        funcionarioService.updateById(id, requisicao);
        return "redirect/funcionarios";
    }

    @PostMapping("/funcionarios/{id}/deletar")
    public String deletar(@PathVariable Long id) {
        funcionarioService.deleteById(id);
        return "redirect:/funcionarios";
    }

}
