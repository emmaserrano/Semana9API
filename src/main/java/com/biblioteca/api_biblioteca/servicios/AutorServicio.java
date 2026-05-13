package com.biblioteca.api_biblioteca.servicios;

import com.biblioteca.api_biblioteca.modelos.Autor;
import com.biblioteca.api_biblioteca.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServicio {

    private final AutorRepository autorRepository;

    // Constructor
    public AutorServicio(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    // Obtener todos los autores
    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    // Guardar autor
    public Autor guardar(Autor autor) {
        return autorRepository.save(autor);
    }

    // Buscar autor por ID
    public Autor obtener(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    // Actualizar autor
    public Autor actualizar(Long id, Autor autor) {

        Autor autorExistente = obtener(id);

        autorExistente.setNombre(autor.getNombre());
        autorExistente.setNacionalidad(autor.getNacionalidad());

        return autorRepository.save(autorExistente);
    }

    // Eliminar autor
    public void eliminar(Long id) {
        autorRepository.deleteById(id);
    }
}