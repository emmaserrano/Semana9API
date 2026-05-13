package com.biblioteca.api_biblioteca.repository;

import com.biblioteca.api_biblioteca.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository para CRUD de Autor
public interface AutorRepository extends JpaRepository<Autor, Long> {
}