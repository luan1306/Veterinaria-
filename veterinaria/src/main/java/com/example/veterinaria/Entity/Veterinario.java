package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "veterinario")
@Getter
@Setter
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Debe ingresar el nombre del veterinario")
    private String nombre;

    @NotBlank(message = "Debe ingresar la tarjeta profesional")
    private String tarjetaProfesional;

    @NotBlank(message = "Debe ingresar la especialidad")
    private String especialidad;

    @NotBlank(message = "Debe ingresar el correo")
    @Email(message = "Ingrese un correo electrónico válido")
    private String correo;

    @ManyToMany(mappedBy = "veterinarios")
    private List<Mascota> mascotas;
}