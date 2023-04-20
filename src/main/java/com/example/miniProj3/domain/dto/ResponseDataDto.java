package com.example.miniProj3.domain.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseDataDto {
    private String code;
    private String status;
    private String message;
    private Object item;
}
