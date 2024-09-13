package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.StdClassDTO;
import com.simplogics.markSystem.DTO.TopperDTO;
import com.simplogics.markSystem.Model.StdClass;

import java.util.List;

public interface IStdClassService {
    StdClassDTO createClass(StdClassDTO classDTO);

    StdClassDTO toDto(StdClass stdClass);

    List<TopperDTO> findTopper();
}
