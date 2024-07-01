package com.simplogics.markSystem.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Data
@Getter
@Setter
public class TopperDTO {
    private String classId;
    private String name;
}
