package com.example.miniProj3.domain.dao;

import com.example.miniProj3.domain.dto.MemberAuthoritiesMappingDto;
import com.example.miniProj3.domain.dto.MemberRequestDto;
import com.example.miniProj3.domain.member.MemberAuthoritiesCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberMapper {
    List<MemberRequestDto> getMemberList(); // User 테이블 가져오기
    void insertMember(MemberRequestDto memberRequestDto); // 회원 가입
    MemberRequestDto findMemberByUserId(String userId); // 회원 정보 가져오기
    List<MemberAuthoritiesMappingDto> findAuthoritiesMappingByUserId(String userId);
    MemberAuthoritiesCode findAuthoritiesCodeByCodeId(Long memberAuthoritiesCodeId);
    MemberRequestDto findMemberById(Long id);
    void updateMember(MemberRequestDto memberRequestDto); // 회원 정보 수정
    void deleteMember(String userId, String phoneNo); // 회원 탈퇴
}