package ec.edu.uce.ProyectoRelacionesDDBB.model.objects;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String name;
    private String lastName;
    private String department;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Subjects> subjects;



}
