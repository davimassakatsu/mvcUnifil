package com.biblioteca.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.biblioteca.model.Autor;

@Controller
@RequestMapping("/autores")
public class AutorController {

    // Armazenamento temporário em memória (some ao reiniciar a aplicação)
    private final List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("autores", autores);
        return "autor/lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("autor", new Autor());
        return "autor/form";
    }

    @PostMapping
    public String salvar(@ModelAttribute Autor autor) {
        autores.add(autor);
        return "redirect:/autores";
    }
}
