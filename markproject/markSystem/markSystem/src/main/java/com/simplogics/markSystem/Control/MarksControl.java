package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.MarkDTO;
import com.simplogics.markSystem.DTO.MarkSubDto;
import com.simplogics.markSystem.Service.IMarksService;
import com.simplogics.markSystem.Util.ApiRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRoutes.MARK)
public class MarksControl {

    @Autowired
    private IMarksService marksService;

    @GetMapping(ApiRoutes.SUBJECT_ID)
    public List<MarkSubDto> getMarkBySub(@PathVariable Integer id){return marksService.getBySub(id);}
    @GetMapping(ApiRoutes.STUDENT_ID)
    public List<MarkSubDto> getMarkByStud(@PathVariable String id){return marksService.getByName(id);}

    @GetMapping(ApiRoutes.RANGE)
    public List<MarkSubDto> getMarkByStud(@PathVariable Integer id){return marksService.filterByRange(id);}
    @PostMapping()
    public MarkDTO createMarks(@RequestBody MarkDTO M){
        return marksService.createMarks(M);
    }

    @PutMapping()
    public MarkDTO updateMarks(@RequestBody MarkDTO M){
        return marksService.createMarks(M);
    }

    @DeleteMapping(ApiRoutes.ID)
    public String delete(@PathVariable Integer id){
        return marksService.deleteMarks(id);
    }
}
