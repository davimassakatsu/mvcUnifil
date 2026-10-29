package com.biblioteca.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @GetMapping("/novo")
    public String novo() {
        return "livro/form";
    }
}
