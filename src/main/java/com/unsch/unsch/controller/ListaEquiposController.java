package com.unsch.unsch.controller;

import com.unsch.unsch.service.ListaEquiposService;
import com.unsch.unsch.model.ListaEquipos;  // Importar la entidad ListaEquipos
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lista")
public class ListaEquiposController {

    @Autowired
    private ListaEquiposService listaEquiposService;  // Utilizar listaEquiposService
    
    // Método para listar todos los equipos
    @GetMapping("/index")
    public String index(Model model) {
        return "index";  // Nombre de la vista index.html
    }
    
    @GetMapping
    public String listaEquipos(Model model) {
        model.addAttribute("equipos", listaEquiposService.listarTodas());  // Cambiar personas por equipos
        return "lista-equipos";  // Asegúrate de que la vista sea lista-equipos
    }

    // Método para mostrar el formulario de un nuevo equipo
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoEquipo(Model model) {
        model.addAttribute("equipo", new ListaEquipos());  // Crear un nuevo objeto ListaEquipos
        return "equipo-form";  // Nombre del formulario para crear un equipo
    }

    // Método para guardar un nuevo equipo
    @PostMapping
    public String guardarEquipo(ListaEquipos equipo) {
        listaEquiposService.guardar(equipo);  // Guardar el nuevo equipo
        return "redirect:/lista";  // Redirigir a la lista de equipos
    }

    // Método para editar un equipo existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarEquipo(@PathVariable Long id, Model model) {
        ListaEquipos equipo = listaEquiposService.obtenerPorId(id);
        if (equipo != null) {
            model.addAttribute("equipo", equipo);  // Obtener el equipo por ID
            return "equipo-form";  // El formulario para editar el equipo
        } else {
            return "redirect:/lista";  // Redirigir a la lista de equipos si el equipo no existe
        }
    }

    // Método para eliminar un equipo
    @GetMapping("/eliminar/{id}")
    public String eliminarEquipo(@PathVariable Long id) {
        listaEquiposService.eliminar(id);  // Eliminar el equipo
        return "redirect:/lista";  // Redirigir a la lista de equipos
    }
}