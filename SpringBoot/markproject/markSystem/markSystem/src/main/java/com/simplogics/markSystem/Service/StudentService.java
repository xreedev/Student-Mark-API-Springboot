package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.MarkDTO;
import com.simplogics.markSystem.DTO.StudentDTO;
import com.simplogics.markSystem.Model.Marks;
import com.simplogics.markSystem.Model.Student;
import com.simplogics.markSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public List<StudentDTO> getStudentByName(String name){
        List<StudentDTO> studentList=new ArrayList<>();
        studentRepository.findAll().forEach(student -> {
            if (student.name.equals(name)) {

                studentList.add(toDTO(student));
            }
        });

        return studentList;
    }
    public StudentDTO getStudentById(Integer id){
        return toDTO(studentRepository.findById(id).orElse(null));
    }

    public StudentDTO createStudent(StudentDTO S){

        Student student=new Student();
        student.setName(S.getName());
        StudentDTO dto = toDTO(studentRepository.save(student));
        return dto;
    }
    public StudentDTO toDTO(Student S){
        StudentDTO studentDTO=new StudentDTO();
        studentDTO.setName(S.getName());

        return studentDTO;
    }
    public String deleteStudent(Integer id){
        studentRepository.delete(studentRepository.findById(id).orElse(null));
        return "Student Deleted";
    }

}
