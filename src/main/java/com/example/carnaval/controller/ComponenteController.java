package com.example.carnaval.controller;


import com.example.carnaval.model.Componente;
import com.example.carnaval.service.AgrupacionService;
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
    private AgrupacionService agrupacionService;

    // Mostrar formulario para crear un componente
    @GetMapping("/new")
    public String showComponenteForm(Model model) {
        model.addAttribute("componente", new Componente());
        model.addAttribute("agrupaciones", agrupacionService.getAllAgrupaciones());
        return "componentes/form";
    }

    // Guardar un componente (crear o actualizar)
    @PostMapping("/save")
    public String saveComponente(@ModelAttribute("componente") Componente componente) {
        componenteService.saveComponente(componente);
        return "redirect:/componentes";
    }

    // Mostrar formulario para editar un componente
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Componente componente = componenteService.getComponenteById(id);
        model.addAttribute("componente", componente);
        model.addAttribute("agrupaciones", agrupacionService.getAllAgrupaciones());
        return "componentes/form";
    }

    // Eliminar un componente
    @GetMapping("/delete/{id}")
    public String deleteComponente(@PathVariable Long id) {
        componenteService.deleteComponente(id);
        return "redirect:/componentes";
    }

    // Listar todos los componentes
    @GetMapping
    public String listComponentes(Model model) {
        model.addAttribute("componentes", componenteService.getAllComponentes());
        return "componentes/list";
    }


    @GetMapping("/agrupaciones/form")
    public String mostrarFormulario(Model model) {
        List<Componente> directores = componenteService.obtenerDirectores();
        model.addAttribute("componentes", directores);  // Pasar los directores al modelo
        return "agrupaciones/form";
    }


}