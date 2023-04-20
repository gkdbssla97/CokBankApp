package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.stock.InstitutionalPurchaseDto;
import com.example.miniProj3.domain.dto.stock.RoboAIPortfolioDto;
import com.example.miniProj3.domain.dto.stock.StockDto;
import com.example.miniProj3.domain.dto.stock.StockFooterDto;

import java.util.List;

public interface StockService {
    StockDto getStock();
    StockFooterDto getStockFooter();
    List<RoboAIPortfolioDto> getRoboAIPortfolio();
    List<InstitutionalPurchaseDto> getInstitutionalPurchase();
    List<RoboAIPortfolioDto> roboAIListOrderByCumulativeRate();
    List<RoboAIPortfolioDto> roboAIListOrderBy3MonthYield();
}
