package com.example.miniProj3.domain.dao;

import com.example.miniProj3.domain.dto.*;
import com.example.miniProj3.domain.dto.customer.*;
import com.example.miniProj3.domain.dto.event.EventResponseDto;
import com.example.miniProj3.domain.dto.main.*;
import com.example.miniProj3.domain.dto.stock.InstitutionalPurchaseDto;
import com.example.miniProj3.domain.dto.stock.RoboAIPortfolioDto;
import com.example.miniProj3.domain.dto.stock.StockDto;
import com.example.miniProj3.domain.dto.stock.StockFooterDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GetMapper {
    StockRecommendationResponseDto getStockRecommendation();
    CarInsuranceResponseDto getCarInsurance();
    CertificationCarResponseDto getCertificationCar();
    PrivacyProtectionResponseDto getPrivacyProtection();
    SmartPhishingResponseDto getSmartPhishing();
    TheCheatResponseDto getTheCheat();
    List<EventResponseDto> getEvent();
    List<HeaderResponseDto> getHeader();
    FooterResponseDto getFooter();
    List<CustomerResponseDto> getCustomer();
    List<BoardListResponseDto> getBoardList();
    List<FaqResponseDto> getFaqList();
    List<PrivacyResponseDto> getPrivacyList();
    List<ServiceResponseDto> getServiceList();
    BoardViewResponseDto findBoardView(@Param("id") Long id);
    EventResponseDto findEventById(@Param("id") Long id);
    StockDto getStock();
    StockFooterDto getStockFooter();
    List<RoboAIPortfolioDto> getRoboAIPortfolio();
    List<InstitutionalPurchaseDto> getInstitutionalPurchase();
}
