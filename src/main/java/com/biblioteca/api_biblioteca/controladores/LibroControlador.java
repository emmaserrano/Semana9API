package com.biblioteca.api_biblioteca.controladores;

import com.biblioteca.api_biblioteca.modelos.Libro;
import com.biblioteca.api_biblioteca.servicios.LibroServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
@CrossOrigin("*")

public class LibroControlador {

    private final LibroServicio libroServicio;

    // Constructor
    public LibroControlador(LibroServicio libroServicio) {
        this.libroServicio = libroServicio;
    }

    // Obtener todos los libros
    @GetMapping
    public List<Libro> listar() {
        return libroServicio.listar();
    }

    // Guardar libro
    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroServicio.guardar(libro);
    }

    // Obtener libro por ID
    @GetMapping("/{id}")
    public Libro obtener(@PathVariable Long id) {
        return libroServicio.obtener(id);
    }

    // Actualizar libro
    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable Long id,
                            @RequestBody Libro libro) {

        return libroServicio.actualizar(id, libro);
    }

    // Eliminar libro
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroServicio.eliminar(id);
    }
}