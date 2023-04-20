package com.example.miniProj3.domain.dto;

import com.example.miniProj3.domain.dto.main.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ServicePageResponseDto {
    StockRecommendationResponseDto stockRecommendationResponseDto;
    CertificationCarResponseDto certificationCarResponseDto;
    CarInsuranceResponseDto carInsuranceResponseDto;
    SmartPhishingResponseDto smartPhishingResponseDto;
    PrivacyProtectionResponseDto privacyProtectionResponseDto;
    TheCheatResponseDto theCheatResponseDto;
}
