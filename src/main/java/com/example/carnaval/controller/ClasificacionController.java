package com.example.carnaval.controller;


import com.example.carnaval.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clasificacion")
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping
    public String getClasificacion(Model model) {
        model.addAttribute("clasificacion", clasificacionService.getClasificacion());
        return "clasificacion/list";
    }
}