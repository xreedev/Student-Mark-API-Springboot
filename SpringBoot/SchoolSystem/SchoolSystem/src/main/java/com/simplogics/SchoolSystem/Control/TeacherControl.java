package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Model.Teacher;
import com.simplogics.SchoolSystem.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/")
public class TeacherControl {
    @Autowired
    private TeacherService TeacherService;

    @PostMapping("/createTeacher")
    public Teacher addTeacher(@RequestBody Teacher Teacher){
        return TeacherService.saveTeacher(Teacher);
    }

    @PutMapping("/saveTeacher")
    public Teacher saveTeacher(@RequestBody Teacher Teacher){
        return TeacherService.saveTeacher(Teacher);
    }

    @GetMapping("/getTeacher/{id}")
    public Teacher getTeacher(@PathVariable Integer id){
        return TeacherService.getTeacherById(id);
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getTeachers(){
        return TeacherService.getTeachers();
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable Integer id){
        return TeacherService.deleteTeacher(id);
    }
}
