package com.eventos.eventos.Modelos.Entidad;


import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Eventos")
public class Eventos 
{
    @Id
    private Long id_evento;

    private String titulo;
    private String descripcion;
    private List<String> categoria;
    private Date fecha;
    private Lugar_Evento Lugar;
    private List<Asistentes> asistentes;
    private List<Conferencista> conferencistas;
    private List<Facultad> facultad;
    private List<Programa> programas;
    private List<Comentario> comentarios;

}
