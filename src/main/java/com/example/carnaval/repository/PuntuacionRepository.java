package com.example.carnaval.repository;

import com.example.carnaval.model.Fase;
import com.example.carnaval.model.Puntuacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PuntuacionRepository extends JpaRepository<Puntuacion, Long> {
    List<Puntuacion> findByFase(Fase fase);



}