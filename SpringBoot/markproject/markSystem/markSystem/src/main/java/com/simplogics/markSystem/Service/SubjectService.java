package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.SubjectDTO;
import com.simplogics.markSystem.Model.Subject;
import com.simplogics.markSystem.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService implements  ISubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public SubjectDTO createSubject(SubjectDTO S){

        Subject sub=new Subject();
        sub.setSubName(S.getSubName());
        return toDto(subjectRepository.save(sub));
    }
    @Override
    public SubjectDTO toDto(Subject S){
        SubjectDTO sDto=new SubjectDTO();
        sDto.setSubName(S.getSubName());
        return sDto;
    }

    @Override
    public SubjectDTO getSubjectById(Integer id){

       SubjectDTO subjectDTO=new SubjectDTO();
       subjectDTO.setSubName(subjectRepository.findById(id).orElse(null).getSubName());
       return subjectDTO;
    }

    @Override
    public String deleteSubject(Integer id){
        subjectRepository.delete(subjectRepository.findById(id).orElse(null));
        return "Subject Deleted";
    }
}
