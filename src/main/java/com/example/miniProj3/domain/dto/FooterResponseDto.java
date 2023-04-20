package com.example.miniProj3.domain.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FooterResponseDto {
    private String head;
    private String body;
    private String footer;
    private String address;
    private String phoneNo;
    private String faxNo;
    private String postNo;
}
