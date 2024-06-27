package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.Model.Subject;
import com.simplogics.markSystem.Repository.MarksRepository;
import com.simplogics.markSystem.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject createSubject(Subject S){

        return subjectRepository.save(S);
    }

    public Subject getSubjectById(Integer id){

        return subjectRepository.findById(id).orElse(null);
    }

    public String deleteSubject(Integer id){
        subjectRepository.delete(subjectRepository.findById(id).orElse(null));
        return "Subject Deleted";
    }
}
