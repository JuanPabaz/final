package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Ciudad")
public class Ciudad {
    
    @Id
    private String id_ciudad;

    private String nombre;
    private String Departamento;
    private String pais;
}
