package ec.edu.uce.ProyectoRelacionesDDBB.repositories;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.lastName = ?1")
    Student findByLastName(String lastname);




}
