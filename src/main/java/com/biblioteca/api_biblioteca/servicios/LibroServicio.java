package com.biblioteca.api_biblioteca.servicios;

import com.biblioteca.api_biblioteca.modelos.Libro;
import com.biblioteca.api_biblioteca.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {

    private final LibroRepository libroRepository;

    // Constructor
    public LibroServicio(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    // Obtener todos los libros
    public List<Libro> listar() {
        return libroRepository.findAll();
    }

    // Guardar libro
    public Libro guardar(Libro libro) {
        return libroRepository.save(libro);
    }

    // Buscar libro por ID
    public Libro obtener(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    // Actualizar libro
    public Libro actualizar(Long id, Libro libro) {

        Libro libroExistente = obtener(id);

        libroExistente.setTitulo(libro.getTitulo());
        libroExistente.setGenero(libro.getGenero());
        libroExistente.setPrecio(libro.getPrecio());

        return libroRepository.save(libroExistente);
    }

    // Eliminar libro
    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }
}