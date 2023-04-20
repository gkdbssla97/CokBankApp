package com.example.miniProj3.domain.dto.main;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TheCheatResponseDto {
    private String head;
    private String body;
    private String footer;
    private String imageUrl;
    private String headImageUrl;
}
