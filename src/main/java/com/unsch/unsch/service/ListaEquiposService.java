package com.unsch.unsch.service;

import com.unsch.unsch.model.ListaEquipos;
import com.unsch.unsch.repository.ListaEquiposRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbookair
 */
@Service
public class ListaEquiposService {

    @Autowired
    private ListaEquiposRepository listaEquiposRepository;
    
    // Método para obtener todas las filas de la base de datos
    public List<ListaEquipos> listarTodas() {
        return listaEquiposRepository.findAll();
    }
    
    // Método para guardar un nuevo equipo
    public ListaEquipos guardar(ListaEquipos listaEquipos) {
        return listaEquiposRepository.save(listaEquipos); // Se usa listaEquipos y no persona
    }
    
    // Método para obtener un equipo por su ID
    public ListaEquipos obtenerPorId(Long id) {
        return listaEquiposRepository.findById(id).orElse(null); // Cambio de personaRepository a listaEquiposRepository
    }
    
    // Método para eliminar un equipo por su ID
    public void eliminar(Long id) {
        listaEquiposRepository.deleteById(id); // Cambio de personaRepository a listaEquiposRepository
    }
}
