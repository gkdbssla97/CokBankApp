package com.example.miniProj3.controller;

import com.example.miniProj3.domain.dto.customer.BoardViewResponseDto;
import com.example.miniProj3.service.CommonService;
import com.example.miniProj3.service.CustomerPageService;
import com.example.miniProj3.service.MainPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CustomerController {
    private final CommonService commonService;
    private final CustomerPageService customerPageService;
    private final MainPageService mainPageService;

    @GetMapping("/board")
    public String board_list(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("boardList", customerPageService.getBoardList());
        model.addAttribute("footer", commonService.getFooter());

        return "board/board_list";
    }

    @GetMapping("/board_view")
    public String board_view(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("boardList", customerPageService.getBoardList());
        model.addAttribute("id", id);
        model.addAttribute("footer", commonService.getFooter());

        BoardViewResponseDto boardView = customerPageService.findBoardView(id);
        if (id == 3) {
            String content = boardView.getContent();
            String[] split = content.split("#");
            model.addAttribute("content", split);
        } else {
            model.addAttribute("content", boardView.getContent());
        }
        model.addAttribute("newLineChar", '\n');

        return "board/board_view";
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("faqList", customerPageService.getFaqList());
        model.addAttribute("footer", commonService.getFooter());
        model.addAttribute("newLineChar", '\n');

        return "customer/faq";
    }

    @GetMapping("/privacy")
    public String privacy(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("privacyList", customerPageService.getPrivacyList());
        model.addAttribute("footer", commonService.getFooter());
        model.addAttribute("newLineChar", '\n');

        return "customer/privacy";
    }

    @GetMapping("/service")
    public String service(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("serviceTitle", mainPageService.initializeServiceTitleList());
        model.addAttribute("serviceInfoList", customerPageService.getServiceList());
        model.addAttribute("footer", commonService.getFooter());
        model.addAttribute("newLineChar", '\n');

        return "customer/service";
    }
}
