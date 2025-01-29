package com.example.carnaval.controller;

import com.example.carnaval.model.Agrupacion;
import com.example.carnaval.model.Modalidad;
import com.example.carnaval.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/clasificacion")
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping("/clasificacion")
    public String mostrarClasificacion(Model model) {
        Map<Modalidad, List<Agrupacion>> clasificacion = clasificacionService.obtenerClasificacion();
        model.addAttribute("clasificacion", clasificacion);
        return "clasificacion/list";
    }

    @GetMapping
    public String getClasificacion(Model model) {
        Map<Modalidad, List<Agrupacion>> clasificacion = clasificacionService.getClasificacion();
        if (clasificacion == null || clasificacion.isEmpty()) {
            System.out.println("El mapa de clasificación está vacío o es nulo.");
        }
        model.addAttribute("clasificacion", clasificacion);
        return "clasificacion/list";
    }
}


