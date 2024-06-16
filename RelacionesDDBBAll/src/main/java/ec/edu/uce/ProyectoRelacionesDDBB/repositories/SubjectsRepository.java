package ec.edu.uce.ProyectoRelacionesDDBB.repositories;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubjectsRepository extends JpaRepository<Subjects, Long> {


}
