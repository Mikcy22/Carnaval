package com.example.carnaval.controller;


import com.example.carnaval.model.Agrupacion;
import com.example.carnaval.model.Componente;
import com.example.carnaval.model.Modalidad;
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


    @GetMapping("/edit/{componenteId}")
    public String showEditComponenteForm(@PathVariable Long componenteId, Model model) {
        Componente componente = componenteService.getComponenteById(componenteId);
        if (componente == null) {
            return "redirect:/componentes"; // Redirige si el componente no existe
        }

        Agrupacion agrupacion = componente.getAgrupacion();
        model.addAttribute("componente", componente);
        model.addAttribute("agrupacion", agrupacion);
        return "componentes/edit"; // Mostrar el formulario de edición
    }


    // Guardar o actualizar un componente
    @PostMapping("/save")
    public String saveComponente(@ModelAttribute("componente") Componente componente) {
        // Verificar si el componente tiene un ID, lo que indica que es una actualización
        if (componente.getId() != null) {
            // Si tiene ID, buscar el componente y actualizarlo
            Componente existingComponente = componenteService.getComponenteById(componente.getId());
            if (existingComponente != null) {
                // Actualizar los valores del componente existente
                existingComponente.setNombre(componente.getNombre());  // Actualizar solo los campos necesarios
                existingComponente.setRol(componente.getRol());
                existingComponente.setEdad(componente.getEdad());
                existingComponente.setInstrumento(componente.getInstrumento());

                // Guardar el componente actualizado
                componenteService.saveComponente(existingComponente);
            }
        } else {
            // Si no tiene ID, significa que es un componente nuevo, así que lo guardamos directamente
            Agrupacion agrupacion = agrupacionService.getAgrupacionById(componente.getAgrupacion().getId());
            componente.setAgrupacion(agrupacion);
            componenteService.saveComponente(componente);
        }

        // Redirigir a la vista de detalles de la agrupación
        return "redirect:/agrupaciones/detalles/" + componente.getAgrupacion().getId();
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