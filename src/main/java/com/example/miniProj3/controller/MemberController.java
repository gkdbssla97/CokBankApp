package com.example.miniProj3.controller;

import com.example.miniProj3.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String loginRegister() {

        return "fragment/security";
    }

    @GetMapping("/admin/index")
    public String enterAdmin() {

        return "member/admin/index";
    }

    @GetMapping("/management/index")
    public String enterManagement() {

        return "member/management/index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
