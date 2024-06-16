package ec.edu.uce.ProyectoRelacionesDDBB.model.objects;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students;


    public Subjects() {
    }

    public Subjects(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
