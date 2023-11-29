package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Eventos")
public class Lugar_Evento {
    
    @Id
    private String id_lugar;

    private String nombre;
    private String direccion;
    private Ciudad ciudad;
}
