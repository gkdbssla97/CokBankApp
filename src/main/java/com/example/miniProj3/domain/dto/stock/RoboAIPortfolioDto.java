package com.example.miniProj3.domain.dto.stock;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RoboAIPortfolioDto {
    private String head; // 로보AI 포트폴리오
    private String body; // 적극투자형
    private String percentage;
}
