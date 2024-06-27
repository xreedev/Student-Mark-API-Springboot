package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Table(name="Marks")
@Entity
@RequiredArgsConstructor
public class Marks {

    @Id
    @GeneratedValue
    private Integer markId;
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studId", referencedColumnName = "studId", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subId", referencedColumnName = "subId", nullable = false)
    private Subject subject;

}
