package com.example.miniProj3.domain.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class HeaderResponseDto {
    private String head;
    private String body;
    private String footer;
    private String imageUrl;
}
