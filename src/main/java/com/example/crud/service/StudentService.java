package com.example.crud.service;

import com.example.crud.entity.Student;
import com.example.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica que esta clase es un componente de servicio de Spring
public class StudentService {
    @Autowired // Anotación para la inyección de dependencias, que automáticamente inyecta una instancia de StudentRepository
    StudentRepository studentRepository; // Repositorio para acceder a los datos de los estudiantes en la base de datos

    // Método para obtener todos los estudiantes
    public List<Student> getStudents(){
        return studentRepository.findAll(); // Utiliza el método findAll() del repositorio para obtener todos los estudiantes
    }

    // Método para obtener un estudiante por su ID
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id); // Utiliza el método findById() del repositorio para obtener un estudiante por su ID
    }

    // Método para guardar o actualizar un estudiante
    public void saveOrUpdate(Student student){
        studentRepository.save(student); // Utiliza el método save() del repositorio para guardar o actualizar un estudiante
    }

    // Método para eliminar un estudiante por su ID
    public void delete(Long id){
        studentRepository.deleteById(id); // Utiliza el método deleteById() del repositorio para eliminar un estudiante por su ID
    }
}
