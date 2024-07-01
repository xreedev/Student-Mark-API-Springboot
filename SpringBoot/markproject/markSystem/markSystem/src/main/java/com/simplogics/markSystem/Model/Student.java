package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Table
@Getter
@Setter
@Entity
@RequiredArgsConstructor

public class Student {

    @Id
    @GeneratedValue
    @Column(name = "studId")
    private Integer studId;
    public String name;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "classid", nullable = false)
    private StdClass Std;

}
