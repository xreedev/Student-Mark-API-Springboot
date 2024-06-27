package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Teacher;
import com.simplogics.SchoolSystem.Repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService {
    @Autowired
    private ITeacherRepository TeacherRepository;

    public Teacher saveTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    public Teacher updateTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    public List<Teacher> getTeachers() {
        return TeacherRepository.findAll();
    }

    public Teacher getTeacherById(Integer id){
        return TeacherRepository.findById(id).orElse(null);
    }

    public String deleteTeacher(Integer id){
        TeacherRepository.deleteById(id);
        return "Teacher DELETED";
    }
}
