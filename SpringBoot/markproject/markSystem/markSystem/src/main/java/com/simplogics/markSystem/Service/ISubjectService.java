package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.SubjectDTO;
import com.simplogics.markSystem.Model.Subject;

public interface ISubjectService {
    SubjectDTO createSubject(SubjectDTO S);

    SubjectDTO toDto(Subject S);

    SubjectDTO getSubjectById(Integer id);

    String deleteSubject(Integer id);
}
