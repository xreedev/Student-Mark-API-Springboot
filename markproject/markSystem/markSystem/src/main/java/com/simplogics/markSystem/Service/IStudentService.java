package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.StudentDTO;
import com.simplogics.markSystem.Model.Student;

import java.util.List;

public interface IStudentService {
    List<StudentDTO> getStudentByName(String name);

    StudentDTO getStudentById(Integer id);

    StudentDTO createStudent(StudentDTO S);

    StudentDTO toDTO(Student S);

    String deleteStudent(Integer id);
}
