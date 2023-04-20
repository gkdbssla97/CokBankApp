package com.example.miniProj3.domain.dto.event;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EventResponseDto {
    private Long id;
    private String head;
    private String body;
    private String footer;
    private String imageUrl;
    private String headImageUrl;

}
