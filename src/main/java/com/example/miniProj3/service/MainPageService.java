package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.*;
import com.example.miniProj3.domain.dto.main.*;

import java.util.List;

public interface MainPageService {
    StockRecommendationResponseDto getStockRecommendation();
    CarInsuranceResponseDto getCarInsurance();
    CertificationCarResponseDto getCertificationCar();
    PrivacyProtectionResponseDto getPrivacyProtection();
    SmartPhishingResponseDto getSmartPhishing();
    TheCheatResponseDto getTheCheat();
    ServicePageResponseDto initializeServicePage();
    List<String> initializeServiceTitleList();
}
