package com.example.carnaval.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "puntuaciones") // Nombre de la tabla en la base de datos
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La fase es obligatoria")
    @Enumerated(EnumType.STRING)
    @Column(name = "fase", nullable = false)
    private Fase fase;

    @NotNull(message = "Los puntos son obligatorios")
    @Column(name = "puntos", nullable = false)
    private double puntos;

    @ManyToOne
    @JoinColumn(name = "agrupacion_id", nullable = false)
    private Agrupacion agrupacion;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public Agrupacion getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }
}

enum Fase {
    Preliminares, Cuartos, Semifinales, Final
}