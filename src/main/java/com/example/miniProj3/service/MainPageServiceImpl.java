package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.GetMapper;
import com.example.miniProj3.domain.dto.*;
import com.example.miniProj3.domain.dto.main.*;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Slf4j
public class MainPageServiceImpl implements MainPageService{
    private final GetMapper getMapper;

    @Override
    public StockRecommendationResponseDto getStockRecommendation() {
        return getMapper.getStockRecommendation();
    }

    @Override
    public CarInsuranceResponseDto getCarInsurance() {
        return getMapper.getCarInsurance();
    }

    @Override
    public CertificationCarResponseDto getCertificationCar() {
        return getMapper.getCertificationCar();
    }

    @Override
    public PrivacyProtectionResponseDto getPrivacyProtection() {
        return getMapper.getPrivacyProtection();
    }

    @Override
    public SmartPhishingResponseDto getSmartPhishing() {
        return getMapper.getSmartPhishing();
    }

    @Override
    public TheCheatResponseDto getTheCheat() {
        return getMapper.getTheCheat();
    }

    @Override
    public ServicePageResponseDto initializeServicePage() {
        StockRecommendationResponseDto stockRecommendation = getStockRecommendation();
        CarInsuranceResponseDto carInsurance = getCarInsurance();
        CertificationCarResponseDto certificationCar = getCertificationCar();
        PrivacyProtectionResponseDto privacyProtection = getPrivacyProtection();
        SmartPhishingResponseDto smartPhishing = getSmartPhishing();
        TheCheatResponseDto theCheat = getTheCheat();

        return ServicePageResponseDto.builder()
                .stockRecommendationResponseDto(stockRecommendation)
                .carInsuranceResponseDto(carInsurance)
                .certificationCarResponseDto(certificationCar)
                .privacyProtectionResponseDto(privacyProtection)
                .smartPhishingResponseDto(smartPhishing)
                .theCheatResponseDto(theCheat)
                .build();
    }

    @Override
    public List<String> initializeServiceTitleList() {
        return List.of(
                getStockRecommendation().getHead(),
                getCertificationCar().getHead(),
                getCarInsurance().getHead(),
                getSmartPhishing().getHead(),
                getPrivacyProtection().getHead(),
                getTheCheat().getHead());
    }

}
