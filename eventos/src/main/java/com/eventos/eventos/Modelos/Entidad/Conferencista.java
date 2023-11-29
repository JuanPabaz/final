package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Conferencista")
public class Conferencista 
{
    @Id
    private String id_conferencista;

    private String nombre_conferencista;
    private String apellido_conferencista;
    private String email;
    private Ciudad ciudad;
    private String codigo_sede; 
    private String contrato;
    private String empleado;
    private Facultad facultad;
}
