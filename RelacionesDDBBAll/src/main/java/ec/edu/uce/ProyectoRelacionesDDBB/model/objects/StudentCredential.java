package ec.edu.uce.ProyectoRelacionesDDBB.model.objects;

import jakarta.persistence.*;

@Entity
public class StudentCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String  bloodType;
    private String faculty;


    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    Student student;

    public StudentCredential() {
    }

    public StudentCredential(Long id, String bloodType, String faculty) {
        this.id = id;
        this.bloodType = bloodType;
        this.faculty = faculty;
    }

    public StudentCredential(String bloodType, String faculty, Student student) {
        this.bloodType = bloodType;
        this.faculty = faculty;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentCredential{" +
                ", bloodType='" + bloodType + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
