package com.example.miniProj3.domain.stock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head; // 스탁
    @Column(name = "body")
    private String body; // 홈|투자전략|추천종목|종목랭킹|계좌
    @Column(name = "footer")
    private String footer;
    @Column(name = "head_image_url")
    private String headImageUrl; // stock1
    @Column(name = "image_url")
    private String imageUrl; // stock2
    @Column(name = "rate_of_return")
    private String rateOfReturn; // 누적 수익률 순|3개월 수익률 순
}
