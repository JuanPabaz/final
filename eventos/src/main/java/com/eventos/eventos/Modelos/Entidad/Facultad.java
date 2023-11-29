package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Facultad")
public class Facultad {
    
    @Id
    private String id_facultad;

    private String nombre_facultad;
    private Ciudad ciudad;
    private String numero_telefono;
}
