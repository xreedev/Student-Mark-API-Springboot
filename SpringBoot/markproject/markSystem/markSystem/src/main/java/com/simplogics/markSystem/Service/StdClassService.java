package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.StdClassDTO;
import com.simplogics.markSystem.DTO.TopperDTO;
import com.simplogics.markSystem.Model.StdClass;
import com.simplogics.markSystem.Model.Student;
import com.simplogics.markSystem.Repository.MarksRepository;
import com.simplogics.markSystem.Repository.StdClassRepository;
import com.simplogics.markSystem.Repository.StudentRepository;
import com.simplogics.markSystem.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StdClassService {

    @Autowired
    private MarksRepository marksRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private StdClassRepository stdClassRepository;

    public StdClassDTO createClass(StdClassDTO classDTO){
        StdClass stdClass=new StdClass();
        stdClass.setz
        StdClassDTO dto = toDto(stdClassRepository.save(stdClass));
        return toDto(studentRepository.save(stdClass));
    }

    public StdClassDTO toDto(StdClass stdClass){
        StdClassDTO stdClassDTO=new StdClassDTO();
        stdClassDTO.setMarkId(stdClass.getMarksList().getLast().getMarkId());
        return stdClassDTO;
    }

    public List<TopperDTO> findTopper(){
        List<TopperDTO> topperDTO=new ArrayList<>();
        List<StdClass> classes= new ArrayList<>();
        Integer highScore=0;
        String topper="";
        for (StdClass class1 : stdClassRepository.findAll()) {
            HashMap<String, Integer> stdMark = new HashMap<>();


            for (Student std : class1.getStudent()) {
                if (stdMark.containsKey(std.getName()) {
                    stdMark.replace(marks.getStudent().getName(), stdMark.get(marks.getStudent().getName() + marks.getMark()));
                } else {
                    stdMark.put(marks.getStudent().getName(), 0);
                }
            }

            for (String student : stdMark.keySet()) {
                if (stdMark.get(student) > highScore) {
                    highScore = stdMark.get(student);
                    topper = student;
                }
                TopperDTO tDto=new TopperDTO();
                tDto.setClassId(class1.getClassid());
                tDto.setName(student);
                topperDTO.add(tDto);
            }
        }


        return topperDTO;
    }

}
