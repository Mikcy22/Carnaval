package com.example.carnaval.service;

import com.example.carnaval.model.Componente;
import com.example.carnaval.repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComponenteService {

    @Autowired
    private ComponenteRepository componenteRepository;

    public List<Componente> obtenerDirectores() {
        return componenteRepository.findByRol("Director");
    }
    public List<Componente> getAllComponentes() {
        return componenteRepository.findAll();
    }

    public Componente getComponenteById(Long id) {
        return componenteRepository.findById(id).orElse(null);
    }

    public Componente saveComponente(Componente componente) {
        return componenteRepository.save(componente);
    }

    public void deleteComponente(Long id) {
        componenteRepository.deleteById(id);
    }

}