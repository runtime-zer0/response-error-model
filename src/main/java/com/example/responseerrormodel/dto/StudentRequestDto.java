package com.example.responseerrormodel.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentRequestDto {

    private String name;

    private String grade;

    @Builder
    public StudentRequestDto(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
