package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.Model.Marks;
import com.simplogics.markSystem.Model.Student;
import com.simplogics.markSystem.Repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    @Autowired
    private MarksRepository marksRepository;

    public Marks createMarks(Marks M){
        return marksRepository.save(M);
    }

    public String deleteMarks(Integer id){
        marksRepository.delete(marksRepository.findById(id).orElse(null));
        return "Mark Deleted";
    }

}
