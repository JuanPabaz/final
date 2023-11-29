package com.eventos.eventos.Modelos.Entidad;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Asistente")
public class Asistentes {
    
    @Id
    private String id_asistente;

    private String nombre_asistente;
    private String apellido_asistente;
    private String email;
    private Ciudad ciudad;
    private String codigo_sede; 
    private String contrato;
    private String empleado;
    private Facultad facultad;
}

