package com.example.carnaval.model;

import jakarta.persistence.*;
        import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "agrupaciones") // Nombre de la tabla en la base de datos
public class Agrupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "director_id")
    private Componente director;

    @NotNull(message = "La modalidad es obligatoria")
    @Enumerated(EnumType.STRING)
    @Column(name = "modalidad", nullable = false)
    private Modalidad modalidad;

    @Column(name = "numero_de_componentes")
    private int numeroDeComponentes;

    @Column(name = "localidad")
    private String localidad;

    @OneToMany(mappedBy = "agrupacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Componente> componentes;

    @OneToMany(mappedBy = "agrupacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Puntuacion> puntuaciones;

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

    public Componente getDirector() {
        return director;
    }

    public void setDirector(Componente director) {
        this.director = director;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public int getNumeroDeComponentes() {
        return numeroDeComponentes;
    }

    public void setNumeroDeComponentes(int numeroDeComponentes) {
        this.numeroDeComponentes = numeroDeComponentes;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public List<Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(List<Puntuacion> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }

    public double getPuntuacionTotal() {
        return puntuaciones.stream()
                .mapToDouble(Puntuacion::getPuntos)
                .sum();
    }

}

