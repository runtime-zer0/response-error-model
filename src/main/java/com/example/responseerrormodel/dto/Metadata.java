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
public class Metadata {

    private Integer resultCount;

    @Builder
    public Metadata(int resultCount) {
        this.resultCount = resultCount;
    }
}
