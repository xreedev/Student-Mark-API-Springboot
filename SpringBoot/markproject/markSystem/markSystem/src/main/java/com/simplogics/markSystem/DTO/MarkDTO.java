package com.simplogics.markSystem.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@Data
@Getter
public class MarkDTO {

    private Integer marks;
    private Integer subId;
    private Integer studId;

}
