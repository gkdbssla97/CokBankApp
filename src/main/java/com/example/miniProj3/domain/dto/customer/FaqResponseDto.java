package com.example.miniProj3.domain.dto.customer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FaqResponseDto {
    private String head;
    private String body;
}
