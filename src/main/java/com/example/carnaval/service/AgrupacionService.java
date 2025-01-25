package com.example.carnaval.service;

import com.example.carnaval.model.Agrupacion;
import com.example.carnaval.model.Componente;
import com.example.carnaval.repository.AgrupacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgrupacionService {

    @Autowired
    private AgrupacionRepository agrupacionRepository;

    public List<Agrupacion> getAllAgrupaciones() {
        return agrupacionRepository.findAll(); // Asegúrate de que esto no retorne null
    }

    public void saveAgrupacion(Agrupacion agrupacion) {
        agrupacionRepository.save(agrupacion);
    }

    public void deleteAgrupacion(Long id) {
        agrupacionRepository.deleteById(id);
    }


    // Obtener solo los componentes de las agrupaciones con rol 'Director'
    public List<String> getNombresDirectores() {
        List<Agrupacion> agrupaciones = agrupacionRepository.findAll();
        return agrupaciones.stream()
                .flatMap(agrupacion ->
                        agrupacion.getComponentes().stream()
                                .filter(componente -> "Director".equals(componente.getRol()))
                                .map(Componente::getNombre)
                )
                .collect(Collectors.toList());
    }

    public Agrupacion getAgrupacionById(Long id) {
        return agrupacionRepository.findById(id).orElse(null);
    }

}
