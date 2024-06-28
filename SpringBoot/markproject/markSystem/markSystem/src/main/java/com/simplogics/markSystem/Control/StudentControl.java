package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.StudentDTO;
import com.simplogics.markSystem.Model.Student;
import com.simplogics.markSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/stud")
@RestController
public class StudentControl {

    @Autowired
    private StudentService studentService;

    @GetMapping("/name/{name}")
    public List<StudentDTO> getStudByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public StudentDTO addStudent(@RequestBody StudentDTO student){
        return studentService.createStudent(student);
    }

    @PutMapping("/")
    public StudentDTO updateStudent(@RequestBody StudentDTO student){
        return studentService.createStudent(student);
    }

    @DeleteMapping("/")
    public String delStudent(@RequestBody Integer id){
        return studentService.deleteStudent(id);
    }

}
