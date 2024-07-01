package com.simplogics.markSystem.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
public class StdClassDTO {
    private Long studentId;
    private String studentName;
    private Long classId;;
}
