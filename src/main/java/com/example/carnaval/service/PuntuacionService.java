package com.example.carnaval.service;


import com.example.carnaval.model.Puntuacion;
import com.example.carnaval.repository.PuntuacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuntuacionService {
    @Autowired
    private PuntuacionRepository puntuacionRepository;

    public List<Puntuacion> getAllPuntuaciones() {
        return puntuacionRepository.findAll();
    }

    public Puntuacion getPuntuacionById(Long id) {
        return puntuacionRepository.findById(id).orElse(null);
    }

    public Puntuacion savePuntuacion(Puntuacion puntuacion) {
        return puntuacionRepository.save(puntuacion);
    }

    public void deletePuntuacion(Long id) {
        puntuacionRepository.deleteById(id);
    }
}
