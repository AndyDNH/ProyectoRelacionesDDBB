package ec.edu.uce.ProyectoRelacionesDDBB.model.objects;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column
    private String name;
    @Column(name="lastname")
    private String lastName;
    @Column
    private String address;


    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
//    @JoinColumn(name = "adress_id", referencedColumnName = "id")
    @PrimaryKeyJoinColumn
    private StudentCredential credential;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_subjects",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subjects> subjects;



    public Student (){

    }

    public Student(Long id, String name, String lastName, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Student(String name, String lastName, String address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentCredential getCredential() {
        return credential;
    }

    public void setCredential(StudentCredential credential) {
        this.credential = credential;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", credential=" + credential +
                ", subjects=" + subjects +
                '}';
    }
}
