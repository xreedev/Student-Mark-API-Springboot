package com.simplogics.markSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class StdClassModel {

    @Id
    @GeneratedValue
    private String classid;

    private List<Student> student;
    private List<Subject> subject;
    private List<Marks> marksList;
}
