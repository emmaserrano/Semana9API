package com.biblioteca.api_biblioteca.modelos;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Libro {

    // Llave primaria del libro
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long id;

    // Título del libro
    @Column(name = "titulo_libro", nullable = false, length = 150)
    private String titulo;

    // Género literario
    @Column(name = "genero_libro", length = 100)
    private String genero;

    // Precio del libro
    @Column(name = "precio_libro", nullable = false)
    private double precio;

    // Relación muchos libros a un autor
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;
}

