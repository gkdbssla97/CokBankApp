package com.example.miniProj3.controller;

import com.example.miniProj3.domain.dto.event.EventResponseDto;
import com.example.miniProj3.service.CommonService;
import com.example.miniProj3.service.CustomerPageService;
import com.example.miniProj3.service.EventPageService;
import com.example.miniProj3.service.MainPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {
    private final CommonService commonService;
    private final MainPageService mainPageService;
    private final EventPageService eventPageService;
    private final CustomerPageService customerPageService;

    @GetMapping("/index_service")
    public String home(HttpServletRequest request, HttpServletResponse response, Model model) {

        System.out.println("request: " + request);
        System.out.println("response: " + response);
        model.addAttribute("mainPage", mainPageService.initializeServicePage());
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("footer", commonService.getFooter());

        RequestCache requestCache = new HttpSessionRequestCache();
        SavedRequest savedRequest = requestCache.getRequest(request, response);

        //로그인 페이지 정보가 없는 경우.
        try {
            request.getSession().setAttribute("loginSuccessPage", savedRequest.getRedirectUrl());
        } catch(NullPointerException e) {
            request.getSession().setAttribute("loginSuccessPage", "/");
        }

        return "main/index_service";
    }

    @GetMapping("/index_event")
    public String event(Model model) {
        System.out.println(eventPageService.getEvent());
        model.addAttribute("event", eventPageService.getEvent());
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("footer", commonService.getFooter());

        List<EventResponseDto> eventList = eventPageService.getEvent();

        model.addAttribute("eventList", eventPageService.classificationEvent(eventList, 0));
        model.addAttribute("onGoingEventList", eventPageService.classificationEvent(eventList, 1));
        model.addAttribute("endedEventList", eventPageService.classificationEvent(eventList, 2));

        return "main/index_event";
    }

    @PostMapping("/index_event")
    @ResponseBody
    public List<EventResponseDto> postEvent(@RequestParam(value = "value") int value) {
        List<EventResponseDto> eventList = eventPageService.getEvent();

        return eventPageService.classificationEvent(eventList, value);
    }

    @GetMapping("/index_customer")
    public String customer(Model model) {
        model.addAttribute("header", commonService.getHeader());
        model.addAttribute("customer", customerPageService.getCustomer());
        model.addAttribute("footer", commonService.getFooter());

        return "main/index_customer";
    }
}
