package com.eventos.eventos.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eventos.eventos.Modelos.Repositorio.repositorioEventos;

@Controller
public class EventosControlador 
{
    @Autowired
    private repositorioEventos RepositorioEventos;

    @GetMapping("/Eventos")
    public String Eventos()
    {
        return "Eventos";
    }

    @GetMapping("/Listar_Eventos")
    public String listar_eventos(Model model)
    {
        model.addAttribute("Titulo", "Lista de Eventos");
        model.addAttribute("evento", RepositorioEventos.findAll());

        return "/Listar_Eventos";
    }
}
