package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/")
public class StudentControl {
    @Autowired
    private StudentService studentService;
    @PostMapping("/createStudent")
    public Student addStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @PutMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAll")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }
}
