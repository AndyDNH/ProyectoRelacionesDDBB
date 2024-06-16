package ec.edu.uce.ProyectoRelacionesDDBB.Main;

import ec.edu.uce.ProyectoRelacionesDDBB.ProyectoRelacionesDdbbApplication;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
//        Professor professor = new Professor();
//        professor.setName("John");
//        professor.setLastName("Doe");
//        professor.setDepartment("Computer Science");
//
//// Crear una nueva materia
//        Subjects subject = new Subjects();
//        subject.setName("Mathematics");
//        subject.setDescription("Basic Mathematics");
//
//// Asignar el profesor a la materia
//        subject.setProfessor(professor);
//
//// Agregar la materia a la lista de materias del profesor
//        List<Subjects> subjects = new ArrayList<>();
//        subjects.add(subject);
//        professor.setSubjects(subjects);
//
//// Guardar el profesor y la materia en la base de datos
//        professorRepository.save(professor);



    }

}
