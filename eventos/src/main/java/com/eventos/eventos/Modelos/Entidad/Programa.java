package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Programa")
public class Programa {
    
    @Id
    private String id_programa;

    private String nombre_programa;
}
