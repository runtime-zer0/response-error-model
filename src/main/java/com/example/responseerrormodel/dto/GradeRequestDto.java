package com.example.responseerrormodel.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GradeRequestDto {

    private Integer grade;

    private Double cost;

    @Builder
    public GradeRequestDto(Integer grade, Double cost) {
        this.grade = grade;
        this.cost = cost;
    }
}
