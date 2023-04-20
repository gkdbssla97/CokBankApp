package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.MemberAuthoritiesMappingDto;
import com.example.miniProj3.domain.dto.MemberRequestDto;
import com.example.miniProj3.domain.member.MemberAuthoritiesCode;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public interface MemberService {
     public List<MemberRequestDto> getMemberList();
    public MemberRequestDto findMemberById(Long id);
    public MemberRequestDto findMemberByUserId(String userId);
    public void signup(MemberRequestDto memberRequestDto);
    public void edit(MemberRequestDto memberRequestDto);
    public void withdraw(String userId, String phoneNo);
    List<MemberAuthoritiesMappingDto> findAuthoritiesMappingByUserId(String userId);
    MemberAuthoritiesCode findAuthoritiesCodeByCodeId(Long memberAuthoritiesMappingId);
    PasswordEncoder passwordEncoder();
}
