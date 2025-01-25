package com.example.carnaval.controller;

import com.example.carnaval.model.Agrupacion;
import com.example.carnaval.model.Componente;
import com.example.carnaval.model.Modalidad;
import com.example.carnaval.service.AgrupacionService;
import com.example.carnaval.service.ComponenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/agrupaciones") // Mapea la ruta base /agrupaciones
public class AgrupacionController {

    @Autowired
    private AgrupacionService agrupacionService;

    @Autowired
    private ComponenteService componenteService; // Inyectar ComponenteService


    @GetMapping // Mapea la ruta /agrupaciones
    public String listAgrupaciones(Model model) {
        List<Agrupacion> agrupaciones = agrupacionService.getAllAgrupaciones();
        model.addAttribute("agrupaciones", agrupaciones); // Pasa la lista de agrupaciones a la vista
        return "agrupaciones/list"; // Devuelve la vista list.html
    }


    @GetMapping("/new")
    public String showAgrupacionForm(Model model) {
        model.addAttribute("agrupacion", new Agrupacion());
        model.addAttribute("componentes", componenteService.obtenerDirectores()); // Usar el método de instancia
        model.addAttribute("modalidades", Modalidad.values());
        return "agrupaciones/form";
    }


    @GetMapping("/delete/{id}")
    public String deleteAgrupacion(@PathVariable Long id) {
        agrupacionService.deleteAgrupacion(id);
        return "redirect:/agrupaciones";
    }

    // Método para mostrar el formulario de edición
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Agrupacion agrupacion = agrupacionService.getAgrupacionById(id);
        if (agrupacion == null) {
            return "redirect:/agrupaciones"; // Redirige si la agrupación no existe
        }
        model.addAttribute("agrupacion", agrupacion);
        model.addAttribute("componentes", componenteService.obtenerDirectores());
        model.addAttribute("modalidades", Modalidad.values());
        return "agrupaciones/edit"; // Usa el formulario de edición
    }

    // Método para manejar la actualización
    @PostMapping("/update")
    public String updateAgrupacion(@Valid @ModelAttribute("agrupacion") Agrupacion agrupacion, BindingResult result) {
        if (result.hasErrors()) {
            return "agrupaciones/edit"; // Si hay errores, regresa al formulario de edición
        }
        agrupacionService.saveAgrupacion(agrupacion); // Guarda los cambios
        return "redirect:/agrupaciones"; // Redirige a la lista de agrupaciones
    }

    // Método para guardar (creación)
    @PostMapping("/save")
    public String saveAgrupacion(@Valid @ModelAttribute("agrupacion") Agrupacion agrupacion, BindingResult result) {
        if (result.hasErrors()) {
            return "agrupaciones/form";
        }
        agrupacionService.saveAgrupacion(agrupacion);
        return "redirect:/agrupaciones";
    }







}