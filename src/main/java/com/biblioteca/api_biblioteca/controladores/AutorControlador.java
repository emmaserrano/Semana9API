package com.biblioteca.api_biblioteca.controladores;

import com.biblioteca.api_biblioteca.modelos.Autor;
import com.biblioteca.api_biblioteca.servicios.AutorServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
@CrossOrigin("*")

public class AutorControlador {

    private final AutorServicio autorServicio;

    // Constructor
    public AutorControlador(AutorServicio autorServicio) {
        this.autorServicio = autorServicio;
    }

    // Obtener todos los autores
    @GetMapping
    public List<Autor> listar() {
        return autorServicio.listar();
    }

    // Guardar autor
    @PostMapping
    public Autor guardar(@RequestBody Autor autor) {
        return autorServicio.guardar(autor);
    }

    // Obtener autor por ID
    @GetMapping("/{id}")
    public Autor obtener(@PathVariable Long id) {
        return autorServicio.obtener(id);
    }

    // Actualizar autor
    @PutMapping("/{id}")
    public Autor actualizar(@PathVariable Long id,
                            @RequestBody Autor autor) {

        return autorServicio.actualizar(id, autor);
    }

    // Eliminar autor
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        autorServicio.eliminar(id);
    }
}