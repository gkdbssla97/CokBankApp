package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.MemberMapper;
import com.example.miniProj3.domain.dto.MemberAuthoritiesMappingDto;
import com.example.miniProj3.domain.dto.MemberRequestDto;
import com.example.miniProj3.domain.member.MemberAuthoritiesCode;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberMapper memberMapper;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public List<MemberRequestDto> getMemberList() {
        return memberMapper.getMemberList();
    }

    @Override
    public MemberRequestDto findMemberById(Long id) {
        return memberMapper.findMemberById(id);
    }

    @Override
    public MemberRequestDto findMemberByUserId(String userId) {
        return memberMapper.findMemberByUserId(userId);
    }

    @Override
    public void signup(MemberRequestDto memberRequestDto) {
        if(!memberRequestDto.getUserId().equals("") && !memberRequestDto.getPhoneNo().equals("")) {
            memberRequestDto.setPassword(passwordEncoder.encode(memberRequestDto.getPassword()));
            memberMapper.insertMember(memberRequestDto);
        }
    }

    @Override
    public void edit(MemberRequestDto memberRequestDto) {
        memberRequestDto.setPassword(passwordEncoder.encode(memberRequestDto.getPassword()));
        memberMapper.updateMember(memberRequestDto);
    }

    @Override
    public void withdraw(String userId, String phoneNo) {
        memberMapper.deleteMember(userId, phoneNo);
    }

    @Override
    public List<MemberAuthoritiesMappingDto> findAuthoritiesMappingByUserId(String userId) {
        return memberMapper.findAuthoritiesMappingByUserId(userId);
    }

    @Override
    public MemberAuthoritiesCode findAuthoritiesCodeByCodeId(Long memberAuthoritiesMappingId) {
        return memberMapper.findAuthoritiesCodeByCodeId(memberAuthoritiesMappingId);
    }

    @Override
    public PasswordEncoder passwordEncoder() {
        return this.passwordEncoder;
    }
}
