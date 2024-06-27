package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table
@RequiredArgsConstructor
public class Subject {
    @Id
    @GeneratedValue
    @Column(name = "subId")
    private Integer subId;
    private String subName;
}
