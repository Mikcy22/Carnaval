package com.example.carnaval.controller;

import com.example.carnaval.model.Puntuacion;
import com.example.carnaval.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/puntuaciones")
public class PuntuacionController {
    @Autowired
    private PuntuacionService puntuacionService;

    @GetMapping("/new")
    public String showPuntuacionForm(Model model) {
        model.addAttribute("puntuacion", new Puntuacion());
        return "puntuaciones/form";
    }

    @PostMapping("/save")
    public String savePuntuacion(@ModelAttribute Puntuacion puntuacion) {
        puntuacionService.savePuntuacion(puntuacion);
        return "redirect:/agrupaciones";
    }
}
