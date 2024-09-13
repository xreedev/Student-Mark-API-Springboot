package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.StdClassDTO;
import com.simplogics.markSystem.Service.StdClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class StdClassControl {

    @Autowired
    private StdClassService classService;

    @PostMapping()
    public StdClassDTO createClass(@RequestBody StdClassDTO classes){

        return classService.createClass(classes);
    }
}
