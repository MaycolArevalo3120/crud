package com.example.crud.entity;

import jakarta.persistence.*; // Importa las anotaciones de JPA (Java Persistence API)
import lombok.Data; // Importa la anotación @Data de Lombok, que genera automáticamente los getters, setters, toString(), equals() y hashCode()

@Data // Anotación de Lombok para generar automáticamente getters, setters, toString(), equals() y hashCode()
@Entity // Indica que esta clase es una entidad JPA y está mapeada a una tabla en la base de datos
@Table(name = "tbl_student") // Especifica el nombre de la tabla en la base de datos a la que está mapeada esta entidad
public class Student {
    @Id // Indica que este campo es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera automáticamente el valor de esta columna (autoincremento en la mayoría de las bases de datos)
    private Long studentId; // Identificador único del estudiante

    private String firstName; // Nombre del estudiante
    private String lastName; // Apellido del estudiante

    @Column(name="email_address", unique = true) // Especifica el nombre de la columna en la base de datos y que debe ser único
    private String email; // Dirección de correo electrónico del estudiante
}
