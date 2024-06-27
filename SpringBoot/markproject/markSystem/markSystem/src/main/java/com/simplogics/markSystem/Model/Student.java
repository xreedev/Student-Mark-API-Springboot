package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Table
@Entity
@RequiredArgsConstructor

public class Student {

    @Id
    @GeneratedValue
    @Column(name = "studId")
    private Integer studId;
    public String name;

}
