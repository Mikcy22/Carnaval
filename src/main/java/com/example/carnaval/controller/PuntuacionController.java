package com.example.carnaval.controller;

import com.example.carnaval.model.Puntuacion;
import com.example.carnaval.service.AgrupacionService;
import com.example.carnaval.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/puntuaciones")
public class PuntuacionController {

    @Autowired
    private PuntuacionService puntuacionService;

    @Autowired
    private AgrupacionService agrupacionService;

    @GetMapping
    public String listPuntuaciones(@RequestParam(name = "fase", required = false) String fase, Model model) {
        List<Puntuacion> puntuaciones = (fase == null || fase.isEmpty())
                ? puntuacionService.getAllPuntuaciones()
                : puntuacionService.getPuntuacionesByFase(fase);

        model.addAttribute("puntuaciones", puntuaciones);
        model.addAttribute("faseSeleccionada", fase);
        return "puntuaciones/list";
    }


    @GetMapping("/new")
    public String showPuntuacionForm(Model model) {
        model.addAttribute("puntuacion", new Puntuacion());
        model.addAttribute("agrupaciones", agrupacionService.getAllAgrupaciones()); // Pasar la lista de agrupaciones
        return "puntuaciones/form";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Puntuacion puntuacion = puntuacionService.getPuntuacionById(id);
        model.addAttribute("puntuacion", puntuacion);
        model.addAttribute("agrupaciones", agrupacionService.getAllAgrupaciones()); // Pasar la lista de agrupaciones
        return "puntuaciones/form";
    }



    @GetMapping("/new/{agrupacionId}")
    public String showPuntuacionFormForAgrupacion(@PathVariable Long agrupacionId, Model model) {
        Puntuacion puntuacion = new Puntuacion();
        puntuacion.setAgrupacion(agrupacionService.getAgrupacionById(agrupacionId));
        model.addAttribute("puntuacion", puntuacion);
        model.addAttribute("agrupaciones", agrupacionService.getAllAgrupaciones()); // Pasa la lista de agrupaciones
        return "puntuaciones/form";
    }




    @PostMapping("/save")
    public String savePuntuacion(@ModelAttribute Puntuacion puntuacion) {
        puntuacionService.savePuntuacion(puntuacion);
        return "redirect:/puntuaciones";
    }



    @GetMapping("/delete/{id}")
    public String deletePuntuacion(@PathVariable Long id) {
        puntuacionService.deletePuntuacion(id);
        return "redirect:/puntuaciones";
    }




}