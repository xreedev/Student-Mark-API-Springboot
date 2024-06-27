package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.Model.Marks;
import com.simplogics.markSystem.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mark")
public class MarksControl {

    @Autowired
    private MarksService marksService;

    @PostMapping("/")
    public Marks createMarks(@RequestBody Marks M){
        return marksService.createMarks(M);
    }

    @PutMapping("/")
    public Marks updateMarks(@RequestBody Marks M){
        return marksService.createMarks(M);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        return marksService.deleteMarks(id);
    }
}
