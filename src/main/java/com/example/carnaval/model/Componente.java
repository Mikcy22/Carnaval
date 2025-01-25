package com.example.carnaval.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "componentes") // Nombre de la tabla en la base de datos
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotNull(message = "La edad es obligatoria")
    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "rol")
    private String rol;

    @Column(name = "instrumento")
    private String instrumento;

    @ManyToOne
    @JoinColumn(name = "agrupacion_id")
    private Agrupacion agrupacion;

    // Getters y Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public Agrupacion getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }
}