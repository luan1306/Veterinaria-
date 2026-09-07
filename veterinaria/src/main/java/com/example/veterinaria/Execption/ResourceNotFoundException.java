package com.example.veterinaria.Execption;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
