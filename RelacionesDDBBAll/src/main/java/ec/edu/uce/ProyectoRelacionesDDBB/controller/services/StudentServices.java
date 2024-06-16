package ec.edu.uce.ProyectoRelacionesDDBB.controller.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public Optional<Student> retrivebyLastName(String student){
        Optional<Student> std = Optional.ofNullable(studentRepository.findByLastName(student));
        System.out.println(std.toString());
        return std;
    }




}
