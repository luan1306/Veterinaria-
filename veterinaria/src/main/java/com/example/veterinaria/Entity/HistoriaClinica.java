package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "historia_clinica")
@Getter
@Setter
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Debe indicar la fecha de apertura")
    @PastOrPresent(message = "La fecha no puede ser posterior a la fecha actual")
    private LocalDate fechaApertura;

    @NotBlank(message = "Debe registrar los antecedentes")
    private String antecedentes;

    @NotBlank(message = "Debe registrar las observaciones")
    private String observaciones;

    @OneToOne(mappedBy = "historiaClinica")
    private Mascota mascota;
}