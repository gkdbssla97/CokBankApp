package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.GetMapper;
import com.example.miniProj3.domain.dto.stock.InstitutionalPurchaseDto;
import com.example.miniProj3.domain.dto.stock.RoboAIPortfolioDto;
import com.example.miniProj3.domain.dto.stock.StockDto;
import com.example.miniProj3.domain.dto.stock.StockFooterDto;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Slf4j
public class StockServiceImpl implements StockService {
    private final GetMapper getMapper;

    @Override
    public StockDto getStock() {
        return getMapper.getStock();
    }

    @Override
    public StockFooterDto getStockFooter() {
        return getMapper.getStockFooter();
    }

    @Override
    public List<RoboAIPortfolioDto> getRoboAIPortfolio() {
        return getMapper.getRoboAIPortfolio();
    }

    @Override
    public List<InstitutionalPurchaseDto> getInstitutionalPurchase() {
        return decimalFormatPurchaseAmount(getMapper.getInstitutionalPurchase());
    }

    @Override
    public List<RoboAIPortfolioDto> roboAIListOrderByCumulativeRate() {
        List<RoboAIPortfolioDto> roboAIPortfolioList = getRoboAIPortfolio();
        Collections.sort(roboAIPortfolioList, (o1, o2) -> o2.getPercentage().compareTo(o1.getPercentage()));

        return roboAIPortfolioList;
    }

    @Override
    public List<RoboAIPortfolioDto> roboAIListOrderBy3MonthYield() {
        List<RoboAIPortfolioDto> roboAIPortfolioList = getRoboAIPortfolio();
        Collections.sort(roboAIPortfolioList, (o1, o2) -> o1.getPercentage().compareTo(o2.getPercentage()));
        return roboAIPortfolioList;
    }

    private List<InstitutionalPurchaseDto> decimalFormatPurchaseAmount(List<InstitutionalPurchaseDto> institutionalPurchaseList) {
        for (InstitutionalPurchaseDto institutionalPurchase : institutionalPurchaseList) {
            String purchaseAmount = institutionalPurchase.getPurchaseAmount();
            DecimalFormat decFormat = new DecimalFormat("###,###");

            institutionalPurchase.setPurchaseAmount(decFormat.format(Integer.parseInt(purchaseAmount)));
        }
        return institutionalPurchaseList;
    }
}
