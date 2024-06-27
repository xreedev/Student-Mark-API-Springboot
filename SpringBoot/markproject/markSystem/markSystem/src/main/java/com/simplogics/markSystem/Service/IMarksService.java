package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.Model.Student;

import java.util.List;

public interface IMarksService {
    public String getMark(String studname,String Subject);

    public List<Student> getAllMarks(String studId);

    public List<Student> getFilteredMarks(Integer min);
}
