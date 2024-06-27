package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;

    public Student saveStudent(Student Student){
        return studentRepository.save(Student);
    }

    public Student updateStudent(Student Student){
        return studentRepository.save(Student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return "STUDENT DELETED";
    }
}
