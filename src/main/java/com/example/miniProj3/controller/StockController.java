package com.example.miniProj3.controller;

import com.example.miniProj3.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequiredArgsConstructor
@Slf4j
public class StockController {
    private final StockService stockService;

    @GetMapping("/stock_new_2021")
    public String home(Model model) {
        model.addAttribute("stock", stockService.getStock());
        model.addAttribute("stockFooter", stockService.getStockFooter());
        model.addAttribute("institutionalPurchaseList", stockService.getInstitutionalPurchase());
        model.addAttribute("now", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        model.addAttribute("roboAIPortfolioList", stockService.getRoboAIPortfolio());
        model.addAttribute("roboAIListOrderByCumulativeRate", stockService.roboAIListOrderByCumulativeRate());
        model.addAttribute("roboAIListOrderBy3MonthYield", stockService.roboAIListOrderBy3MonthYield());
        model.addAttribute("roboDate", LocalDateTime.now().minusMonths(3).format(DateTimeFormatter.ofPattern("yyyy년 MM월")));

        return "cp/stock_new_2021";
    }
}
