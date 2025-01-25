package com.example.carnaval.controller;


import com.example.carnaval.model.Componente;
import com.example.carnaval.service.ComponenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/componentes")
public class ComponenteController {
    @Autowired
    private ComponenteService componenteService;

    @GetMapping("/new")
    public String showComponenteForm(Model model) {
        model.addAttribute("componente", new Componente());
        return "componentes/form";
    }

    @PostMapping("/save")
    public String saveComponente(@ModelAttribute Componente componente) {
        componenteService.saveComponente(componente);
        return "redirect:/agrupaciones";
    }


    @GetMapping("/agrupaciones/form")
    public String mostrarFormulario(Model model) {
        List<Componente> directores = componenteService.obtenerDirectores();
        model.addAttribute("componentes", directores);  // Pasar los directores al modelo
        return "agrupaciones/form";
    }


}