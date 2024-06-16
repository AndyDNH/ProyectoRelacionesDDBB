package ec.edu.uce.ProyectoRelacionesDDBB.controller.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Professor;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.repositories.ProfessorRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorServices {

    @Autowired
    ProfessorRepository professorRepository;

    public void save(Professor professor) {
        professorRepository.save(professor);
    }

    public Optional<Professor> retrivebyLastName(String student){
        Optional<Professor> std = Optional.ofNullable(professorRepository.findByLastName(student));
        System.out.println(std.toString());
        return std;
    }




}
