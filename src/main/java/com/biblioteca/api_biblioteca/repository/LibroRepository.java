package com.biblioteca.api_biblioteca.repository;

import com.biblioteca.api_biblioteca.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository para CRUD de Libro
public interface LibroRepository extends JpaRepository<Libro, Long> {
}