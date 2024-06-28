package com.simplogics.markSystem.Service;

import com.simplogics.markSystem.DTO.MarkDTO;
import com.simplogics.markSystem.DTO.MarkSubDto;
import com.simplogics.markSystem.Model.Marks;

import java.util.List;

public interface IMarksService {
    MarkDTO createMarks(MarkDTO M);

    MarkDTO toDTO(Marks M);

    List<MarkSubDto> getBySub(Integer S);

    List<MarkSubDto> getByName(String name);

    List<MarkSubDto> filterByRange(Integer range);

    String deleteMarks(Integer id);
}
