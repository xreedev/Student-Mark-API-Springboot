package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

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
