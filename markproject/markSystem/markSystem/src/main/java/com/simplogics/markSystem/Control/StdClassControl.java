package com.simplogics.markSystem.Control;

import com.simplogics.markSystem.DTO.StdClassDTO;
import com.simplogics.markSystem.Service.IStdClassService;
import com.simplogics.markSystem.Util.ApiRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiRoutes.CLASS)
public class StdClassControl {

    @Autowired
    private IStdClassService classService;

    @PostMapping()
    public StdClassDTO createClass(@RequestBody StdClassDTO classes){
        return classService.createClass(classes);
    }
}
