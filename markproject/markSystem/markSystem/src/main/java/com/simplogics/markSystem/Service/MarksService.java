package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.MarkDTO;
import com.simplogics.markSystem.DTO.MarkSubDto;
import com.simplogics.markSystem.Model.Marks;
import com.simplogics.markSystem.Repository.MarksRepository;
import com.simplogics.markSystem.Repository.StdClassRepository;
import com.simplogics.markSystem.Repository.StudentRepository;
import com.simplogics.markSystem.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarksService implements IMarksService {

    @Autowired
    private MarksRepository marksRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StdClassRepository stdClassRepository;

    @Override
    public MarkDTO createMarks(MarkDTO M) {
        Marks marks = new Marks();
        marks.setMark(M.getMarks());

        marks.setStudent(studentRepository.findById(M.getStudId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid student ID: " + M.getStudId())));


        marks.setSubject(subjectRepository.findById(M.getSubId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid subject ID: " + M.getSubId())));


        Marks savedMarks = marksRepository.save(marks);

        return toDTO(savedMarks);
    }

    @Override
    public MarkDTO toDTO(Marks M) {
        MarkDTO mDTO = new MarkDTO();
        mDTO.setMarks(M.getMark());
        mDTO.setSubId(M.getSubject().getSubId());
        mDTO.setStudId(M.getStudent().getStudId());
        return mDTO;
    }

    @Override
    public List<MarkSubDto> getBySub(Integer S){
        List<MarkSubDto> mDTO =new ArrayList<>();
        marksRepository.findAll().forEach(marks -> {
            if (marks.getSubject().getSubId().equals(S)) {
                MarkSubDto markSub=new MarkSubDto();
                markSub.setSubName(marks.getSubject().getSubName());
                markSub.setStudName(marks.getStudent().getName());
                markSub.setMarks(marks.getMark());
                mDTO.add(markSub);
            }
        });

       return mDTO;
    }
    @Override
    public List<MarkSubDto> getByName(String name){
        List<MarkSubDto> mDTO =new ArrayList<>();
        marksRepository.findAll().forEach(marks -> {
            if (marks.getStudent().getName().equals(name)) {
                MarkSubDto markSub=new MarkSubDto();
                markSub.setSubName(marks.getSubject().getSubName());
                markSub.setStudName(marks.getStudent().getName());
                markSub.setMarks(marks.getMark());
                mDTO.add(markSub);
            }
        });



        return mDTO;
    }

    @Override
    public List<MarkSubDto> filterByRange(Integer range) {
        List<MarkSubDto> mDTO = new ArrayList<>();
        marksRepository.findAll().forEach(marks -> {
            if (marks.getMark() >= range) {
                MarkSubDto markSub = new MarkSubDto();
                markSub.setSubName(marks.getSubject().getSubName());
                markSub.setStudName(marks.getStudent().getName());
                markSub.setMarks(marks.getMark());
                mDTO.add(markSub);
            }
        });
        return mDTO;
    }

    @Override
    public String deleteMarks(Integer id) {
        marksRepository.deleteById(id);
        return "Mark Deleted";
    }

//    public void updateClass()
}