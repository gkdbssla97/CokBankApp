package com.example.miniProj3.domain.dto.stock;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InstitutionalPurchaseDto {
    private String head; // 기간 외국인 매수 상위
    private String buyer; //
    private String purchaseAmount;
    private String unit; // 억원
}
