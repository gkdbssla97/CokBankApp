package com.example.miniProj3.domain.dto.stock;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StockDto {

    private Long id;
    private String head; // 스탁
    private String body; // 홈|투자전략|추천종목|종목랭킹|계좌
    private String headImageUrl; // stock1
    private String imageUrl; // stock2
    private String rateOfReturn; // 누적 수익률 순|3개월 수익률 순
}
