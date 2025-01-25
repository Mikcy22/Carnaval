package com.example.carnaval.repository;

import com.example.carnaval.model.Componente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComponenteRepository extends JpaRepository<Componente, Long> {
    List<Componente> findByRol(String rol); // Busca componentes por rol
}
