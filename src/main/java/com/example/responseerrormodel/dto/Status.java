package com.example.responseerrormodel.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Status {

    private Integer code;

    private String message;

    @Builder
    public Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
