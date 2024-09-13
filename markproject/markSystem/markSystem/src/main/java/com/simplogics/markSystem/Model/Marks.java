package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Table(name="Marks")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Marks {

    @Id
    @GeneratedValue
    private Integer markId;
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "studId", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "subId", nullable = false)
    private Subject subject;

}
