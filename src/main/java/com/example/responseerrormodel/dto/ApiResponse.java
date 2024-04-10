package com.example.responseerrormodel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private Status status;
    private Metadata metadata;
    private List<T> results;
    private Map<String, Map<String, String>> data;

    @Builder
    public ApiResponse(Status status, Metadata metadata, List<T> results, Map<String, Map<String, String>> data) {
        this.status = status;
        this.metadata = metadata;
        this.results = results;
        this.data = data;
    }
}
