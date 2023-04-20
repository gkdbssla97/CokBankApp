package com.example.miniProj3.domain.dto.main;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StockRecommendationResponseDto {
    private String head;
    private String body;
    private String bodyFirst;
    private String bodySecond;
    private String bodyThird;
    private String footerFirst;
    private String footerSecond;
    private String footerThird;
    private String headImageUrl;
}
