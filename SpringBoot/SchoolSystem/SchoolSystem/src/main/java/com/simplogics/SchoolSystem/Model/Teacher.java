package com.simplogics.SchoolSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
@Table
public class Teacher {
    @Id
//    @Column(name = "teacherId")
    private Integer teacherId;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "Student-Teacher",
            joinColumns = @JoinColumn(name = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "teacherId"))
    private List<Student> students;
}
