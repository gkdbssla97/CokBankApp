package com.example.miniProj3.domain.stock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StockFooter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(name = "head")
    private String head; // 이용약관|개인정보처리방침|투자유의사항
    @Column(name = "join_inquiry")
    private String joinInquiry; // 가입/해지 문의 : 114 또는 1800-1637
    @Column(name = "stock_inquiry")
    private String stockInquiry; // 주식관련 문의 : 02-318-0802
    @Column(name = "office_hour")
    private String officeHour; // (평일 09:00~18:00, 점심시간 12:00~13:00)
    @Column(name = "notification")
    private String notification; // 스탁서비스가 리뉴얼되어 오픈되었습니다.
    @Column(name = "info")
    private String info; // 투자전략 전체보기|투자전략 유료가입
}
