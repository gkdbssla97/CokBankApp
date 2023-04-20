package com.example.miniProj3.domain.stock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RoboAIPortfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head; // 로보AI 포트폴리오
    @Column(name = "body")
    private String body; // 적극투자형
    @Column(name = "percentage")
    private String percentage;
}
