package com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

   @RequestMapping("/")
    public String home() {
        return "home/index";
    }

    @RequestMapping("/sobre")
    public String sobre() {
        return "home/sobre";
    }
}
