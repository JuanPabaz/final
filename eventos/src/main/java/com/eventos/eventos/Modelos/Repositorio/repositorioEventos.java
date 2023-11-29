package com.eventos.eventos.Modelos.Repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eventos.eventos.Modelos.Entidad.Eventos;

@Repository
public interface repositorioEventos extends MongoRepository<Eventos, Long>
{
    List<Eventos> findByIdContains(Long id_evento);

}
