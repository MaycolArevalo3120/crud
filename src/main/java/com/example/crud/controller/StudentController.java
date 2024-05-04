package com.example.crud.controller;

import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController // Esta anotación indica que esta clase es un controlador REST
@RequestMapping(path= "api/v1/students") // Este es el prefijo de la URL para todas las solicitudes en este controlador
public class StudentController {

    @Autowired // Anotación para la inyección de dependencias, que automáticamente inyecta una instancia de StudentService
    private  StudentService studentService;

    @GetMapping // Maneja las solicitudes GET a la ruta base ("/api/v1/students") y devuelve todos los estudiantes
    public List<Student> getAll(){
        return studentService.getStudents(); // Llama al método getStudents() del servicio para obtener todos los estudiantes
    }

    @GetMapping("/{studentId}") // Maneja las solicitudes GET a una ruta con el formato "/api/v1/students/{studentId}"
    public Optional<Student> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudent(studentId); // Llama al método getStudent() del servicio para obtener un estudiante por su ID
    }

    @PostMapping // Maneja las solicitudes POST a la ruta base ("/api/v1/students") para guardar o actualizar un estudiante
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student); // Llama al método saveOrUpdate() del servicio para guardar o actualizar un estudiante
    }

    @DeleteMapping("/{studentId}") // Maneja las solicitudes DELETE a una ruta con el formato "/api/v1/students/{studentId}"
    public void saveUpdate(@PathVariable("studentId") Long studentId){
        studentService.delete(studentId); // Llama al método delete() del servicio para eliminar un estudiante por su ID
    }
}
