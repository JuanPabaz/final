package com.eventos.eventos.Modelos.Entidad;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Comentario")
public class Comentario {
    
    @Id
    private String id_comentario;
    
    private String texto;
    private String usuario_comentario;
}
