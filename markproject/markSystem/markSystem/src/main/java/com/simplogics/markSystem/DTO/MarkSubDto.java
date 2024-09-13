package com.simplogics.markSystem.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class MarkSubDto {
    private Integer marks;
    private String studName;
    private String subName;
}
