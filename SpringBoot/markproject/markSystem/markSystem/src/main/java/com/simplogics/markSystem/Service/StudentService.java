package com.simplogics.markSystem.Service;

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


    public List<Student> getStudentByName(String name){
        List<Student> studentList=new ArrayList<>();
        studentRepository.findAll().forEach(student -> {
            if (student.name.equals(name)) {

                studentList.add(student);
            }
        });

        return studentList;
    }
    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student createStudent(Student S){
        return studentRepository.save(S);
    }

    public String deleteStudent(Integer id){
        studentRepository.delete(studentRepository.findById(id).orElse(null));
        return "Student Deleted";
    }

}
