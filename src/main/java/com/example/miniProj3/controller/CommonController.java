package com.example.miniProj3.controller;

import com.example.miniProj3.service.CommonService;
import com.example.miniProj3.service.CustomerPageService;
import com.example.miniProj3.service.EventPageService;
import com.example.miniProj3.service.MainPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CommonController {
    private final CommonService commonService;
    private final MainPageService mainPageService;
    private final EventPageService eventPageService;
    private final CustomerPageService customerPageService;

    @GetMapping("/main")
    public String mainHeader(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("footer", commonService.getFooter());

        return "fragment/main";
    }
}
