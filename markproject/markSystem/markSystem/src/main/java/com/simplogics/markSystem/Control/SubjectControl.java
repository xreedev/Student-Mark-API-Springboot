package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.SubjectDTO;
import com.simplogics.markSystem.Service.ISubjectService;
import com.simplogics.markSystem.Util.ApiRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiRoutes.SUBJECT)
public class SubjectControl {

    @Autowired
    private ISubjectService subjectService;

    @GetMapping(ApiRoutes.ID)
    public SubjectDTO getSubject(@PathVariable Integer id){
        return subjectService.getSubjectById(id);
    }

    @PostMapping()
    public SubjectDTO createSubject(@RequestBody SubjectDTO S){
        return subjectService.createSubject(S);
    }

   @PutMapping()
   public SubjectDTO updateSubject(@RequestBody SubjectDTO S){
       return subjectService.createSubject(S);
   }

   @DeleteMapping(ApiRoutes.ID)
   public String delSub(@PathVariable Integer id){
        return subjectService.deleteSubject(id);
   }

}
