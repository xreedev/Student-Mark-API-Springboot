package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.SubjectDTO;
import com.simplogics.markSystem.Model.Subject;
import com.simplogics.markSystem.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sub")
public class SubjectControl {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/{id}")
    public SubjectDTO getSubject(@PathVariable Integer id){
        return subjectService.getSubjectById(id);
    }

    @PostMapping("/")
    public SubjectDTO createSubject(@RequestBody SubjectDTO S){
        return subjectService.createSubject(S);
    }

   @PutMapping("/")
   public SubjectDTO updateSubject(@RequestBody SubjectDTO S){
       return subjectService.createSubject(S);
   }

   @DeleteMapping("/{id}")
   public String delSub(@PathVariable Integer id){
        return subjectService.deleteSubject(id);
   }

}
