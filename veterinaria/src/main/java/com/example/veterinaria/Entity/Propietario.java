package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "propietario")
@Getter
@Setter
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Debe ingresar el nombre")
    private String nombre;

    @NotBlank(message = "Debe ingresar el documento")
    private String documento;

    @NotBlank(message = "Debe ingresar el teléfono")
    @Pattern(regexp = "\\d{10}", message = "El teléfono debe contener 10 dígitos")
    private String telefono;

    @NotBlank(message = "Debe ingresar el correo")
    @Email(message = "Ingrese un correo electrónico válido")
    private String correo;

    @OneToMany(mappedBy = "propietario")
    private List<Mascota> mascotas;
}