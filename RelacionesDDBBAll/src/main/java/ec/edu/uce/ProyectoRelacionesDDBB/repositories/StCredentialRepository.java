package ec.edu.uce.ProyectoRelacionesDDBB.repositories;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.StudentCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StCredentialRepository extends JpaRepository<StudentCredential, Long> {

//    @Query("SELECT s FROM StudentCredential s WHERE s.lastName = ?1")
//    Student findByblType(String lastname);

}
