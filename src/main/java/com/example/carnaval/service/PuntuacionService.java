package com.example.carnaval.service;

import com.example.carnaval.model.Fase;
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
    public PuntuacionService(PuntuacionRepository puntuacionRepository) {
        this.puntuacionRepository = puntuacionRepository;
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


    public List<Puntuacion> getPuntuacionesByFase(String fase) {
        try {
            Fase faseEnum = Fase.valueOf(fase); // Convierte el String en Enum
            return puntuacionRepository.findByFase(faseEnum);
        } catch (IllegalArgumentException e) {
            return List.of(); // Retorna una lista vacía si la fase no es válida
        }
    }


}