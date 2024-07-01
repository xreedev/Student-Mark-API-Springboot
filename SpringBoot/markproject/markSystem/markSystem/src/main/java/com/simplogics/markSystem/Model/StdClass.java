package com.simplogics.markSystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table
@Entity
@Data
@RequiredArgsConstructor
@Getter
@Setter
public class StdClass {

   @Id
   @GeneratedValue
   private Long studentId;
   private String studentName;

   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn(name = "class_id")
   private StdClass classes;
}
