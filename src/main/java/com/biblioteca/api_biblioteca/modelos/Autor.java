package com.biblioteca.api_biblioteca.modelos;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "autores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Autor {

    // Llave primaria del autor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Long id;

    // Nombre del autor
    @Column(name = "nombre_autor", nullable = false, length = 100)
    private String nombre;

    // Nacionalidad del autor
    @Column(name = "nacionalidad_autor", length = 100)
    private String nacionalidad;
}