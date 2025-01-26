package com.example.carnaval.controller;


import com.example.carnaval.model.Agrupacion;
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

    @Autowired
    private AgrupacionService agrupacionService;

    // Mostrar formulario para añadir un componente
    @GetMapping("/new/{agrupacionId}")
    public String showComponenteForm(@PathVariable Long agrupacionId, Model model) {
        Agrupacion agrupacion = agrupacionService.getAgrupacionById(agrupacionId);
        if (agrupacion == null) {
            return "redirect:/agrupaciones"; // Redirige si la agrupación no existe
        }
        Componente componente = new Componente();
        componente.setAgrupacion(agrupacion); // Asociar el componente a la agrupación
        model.addAttribute("componente", componente);
        model.addAttribute("agrupacion", agrupacion);
        return "componentes/form";
    }

    // Guardar un componente
    @PostMapping("/save")
    public String saveComponente(@ModelAttribute("componente") Componente componente) {
        // Asociar el componente a la agrupación
        Agrupacion agrupacion = agrupacionService.getAgrupacionById(componente.getAgrupacion().getId());
        componente.setAgrupacion(agrupacion);

        // Guardar el componente
        componenteService.saveComponente(componente);

        // Redirigir a la vista de detalles de la agrupación
        return "redirect:/agrupaciones/detalles/" + agrupacion.getId();
    }

    // Eliminar un componente
    @GetMapping("/delete/{id}")
    public String deleteComponente(@PathVariable Long id) {
        Componente componente = componenteService.getComponenteById(id);
        if (componente != null) {
            Long agrupacionId = componente.getAgrupacion().getId();
            componenteService.deleteComponente(id);
            return "redirect:/agrupaciones/detalles/" + agrupacionId;
        }
        return "redirect:/agrupaciones";
    }
}