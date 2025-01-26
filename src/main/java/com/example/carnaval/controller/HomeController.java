package com.example.carnaval.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // Mapea la ruta principal ("/")
    public String index() {
        return "index"; // Devuelve la vista "index.html"
    }
}
