package com.simplogics.markSystem.Control;

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
    public Subject getSubject(@PathVariable Integer id){
        return subjectService.getSubjectById(id);
    }

    @PostMapping("/")
    public Subject createSubject(@RequestBody Subject S){
        return subjectService.createSubject(S);
    }

   @PutMapping("/")
   public Subject updateSubject(@RequestBody Subject S){
       return subjectService.createSubject(S);
   }

   @DeleteMapping("/{id}")
   public String delSub(@PathVariable Integer id){
        return subjectService.deleteSubject(id);
   }

}
