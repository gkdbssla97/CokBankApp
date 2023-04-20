package com.example.miniProj3.domain.dto.stock;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StockFooterDto {
    private String head; // 이용약관|개인정보처리방침|투자유의사항
    private String joinInquiry; // 가입/해지 문의 : 114 또는 1800-1637
    private String stockInquiry; // 주식관련 문의 : 02-318-0802
    private String officeHour; // (평일 09:00~18:00, 점심시간 12:00~13:00)
    private String notification; // 스탁서비스가 리뉴얼되어 오픈되었습니다.
    private String info; // 투자전략 전체보기|투자전략 유료가입
}
