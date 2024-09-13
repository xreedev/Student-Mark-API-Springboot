package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.StudentDTO;
import com.simplogics.markSystem.Model.Student;
import com.simplogics.markSystem.Repository.StdClassRepository;
import com.simplogics.markSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StdClassRepository stdClassRepository;

    @Override
    public List<StudentDTO> getStudentByName(String name){
        List<StudentDTO> studentList=new ArrayList<>();
        studentRepository.findAll().forEach(student -> {
            if (student.name.equals(name)) {

                studentList.add(toDTO(student));
            }
        });

        return studentList;
    }
    @Override
    public StudentDTO getStudentById(Integer id){
        return toDTO(studentRepository.findById(id).orElse(null));
    }

    @Override
    public StudentDTO createStudent(StudentDTO S){

        Student student=new Student();
        student.setName(S.getName());

        StdClass stdClass=stdClassRepository.findById(S.getCId()).orElseThrow(()-> new RuntimeException("Invalid Class"));
        student.setStd(stdClass);
        //StudentDTO dto = toDTO(studentRepository.save(student));
        return toDTO(studentRepository.save(student));
    }


    @Override
    public StudentDTO toDTO(Student S){
        StudentDTO studentDTO=new StudentDTO();
        studentDTO.setName(S.getName());
        studentDTO.setCId(S.getStd().getClassid());
        return studentDTO;
    }
    @Override
    public String deleteStudent(Integer id){
        studentRepository.delete(studentRepository.findById(id).orElse(null));
        return "Student Deleted";
    }

}
