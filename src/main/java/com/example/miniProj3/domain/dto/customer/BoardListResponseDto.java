package com.example.miniProj3.domain.dto.customer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardListResponseDto {
    private Long id;
    private String head;
    private String body;
    private String footer;
}
