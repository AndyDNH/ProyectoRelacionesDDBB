package ec.edu.uce.ProyectoRelacionesDDBB;

import ec.edu.uce.ProyectoRelacionesDDBB.controller.services.CredentialService;
import ec.edu.uce.ProyectoRelacionesDDBB.controller.services.StudentServices;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.Student;
import ec.edu.uce.ProyectoRelacionesDDBB.model.objects.StudentCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	StudentServices stServices;

	@Autowired
	CredentialService credServices;



	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student std = new Student("Jaime","Jino","jm@gmail.com");
//		StudentCredential stdCred = new StudentCredential("A+","Medicina",std);
//		std.setCredential(stdCred);

//
//		stdCred.setStudent(std);
//		stServices.save(std);
//		credServices.save(stdCred);

//		stServices.saveStudent(new Student("Jhon","Suarez","jn@gmail.com"));
		stServices.retrivebyLastName("Jino");


	}
}
