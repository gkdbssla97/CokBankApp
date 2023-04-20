package com.example.miniProj3.controller;

import com.example.miniProj3.service.CommonService;
import com.example.miniProj3.service.EventPageService;
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
public class EventController {
    private final CommonService commonService;
    private final MainPageService mainPageService;
    private final EventPageService eventPageService;

    @GetMapping("/event_view")
    public String event_view(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("findEvent", eventPageService.findEventById(id));
        model.addAttribute("footer", commonService.getFooter());

        return "event/event_view";
    }
}
