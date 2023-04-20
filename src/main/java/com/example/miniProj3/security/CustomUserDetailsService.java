package com.example.miniProj3.security;

import com.example.miniProj3.domain.dto.MemberAuthoritiesMappingDto;
import com.example.miniProj3.domain.dto.MemberRequestDto;
import com.example.miniProj3.domain.member.Member;
import com.example.miniProj3.domain.member.MemberAuthoritiesCode;
import com.example.miniProj3.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private MemberService memberService;

    /**
     * 인증 하는 부분
     */
    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        MemberRequestDto findMember = memberService.findMemberByUserId(userId);
        return new User(findMember.getUserId(), findMember.getPassword(),
                getAuthorities(findMember.toEntity()));
    }

    /**
     * 권한 받아오는 부분
     * @param member
     * @return
     */
    private Collection<? extends GrantedAuthority> getAuthorities(Member member) {
        System.out.println("userId: " + member.getUserId());
        System.out.println("member: " + member);
        System.out.println(memberService.findAuthoritiesMappingByUserId(member.getUserId()));
        String[] userRoles = convert(memberService.findAuthoritiesMappingByUserId(member.getUserId()));
        return AuthorityUtils.createAuthorityList(userRoles);
    }

    /**
     * 실제 권한 매핑 함수
     * @param list
     * @return
     */
    public String[] convert(List<MemberAuthoritiesMappingDto> list)
    {
        String[] arrayOfString = new String[list.size()];
        int index = 0;
        for (MemberAuthoritiesMappingDto memberAuthoritiesMapping : list) {
            MemberAuthoritiesCode findAuthoritiesCode = memberService.findAuthoritiesCodeByCodeId(memberAuthoritiesMapping.getMemberAuthoritiesCodeId());
            System.out.println(findAuthoritiesCode);
            arrayOfString[index++] = findAuthoritiesCode.getAuthority();
        }
        return arrayOfString;
    }
}
