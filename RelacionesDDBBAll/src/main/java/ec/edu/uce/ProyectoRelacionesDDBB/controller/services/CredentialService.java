package ec.edu.uce.ProyectoRelacionesDDBB.controller.services;

import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.StudentCredential;
import ec.edu.uce.ProyectoRelacionesDDBB.repositories.StCredentialRepository;
import ec.edu.uce.ProyectoRelacionesDDBB.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CredentialService {

    @Autowired
    StCredentialRepository credentialRepository;

    public void save(StudentCredential credential) {
        credentialRepository.save(credential);
    }

//    public Optional<Student> retrivebybloodType(String student){
//        Optional<Student> std = Optional.ofNullable(credentialRepository.findByblType(student));
//        System.out.println(std.toString());
//        return std;
//    }

}
