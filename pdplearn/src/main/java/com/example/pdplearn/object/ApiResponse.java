package com.example.pdplearn.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private boolean result;
    private Object object;
    private long totalElements;

    public ApiResponse(String message, boolean result) {
        this.message = message;
        this.result = result;
    }

    public ApiResponse(String message, boolean result, Object object) {
        this.message = message;
        this.result = result;
        this.object = object;
    }
}
