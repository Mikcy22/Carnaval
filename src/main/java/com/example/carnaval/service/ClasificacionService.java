package com.example.carnaval.service;

import com.example.carnaval.model.Agrupacion;
import com.example.carnaval.model.Modalidad;
import com.example.carnaval.repository.AgrupacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ClasificacionService {

    @Autowired
    private AgrupacionRepository agrupacionRepository;

    public Map<Modalidad, List<Agrupacion>> getClasificacion() {
        List<Agrupacion> agrupaciones = agrupacionRepository.findAll();

        return agrupaciones.stream()
                .collect(Collectors.groupingBy(Agrupacion::getModalidad,
                        Collectors.collectingAndThen(Collectors.toList(),
                                lista -> lista.stream()
                                        .sorted((a, b) -> Integer.compare(b.getPuntuacionTotal(), a.getPuntuacionTotal()))
                                        .collect(Collectors.toList()))));
    }
}

