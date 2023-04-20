package com.example.miniProj3.domain.dto;

import com.example.miniProj3.domain.member.Member;
import com.example.miniProj3.domain.member.MemberAuthoritiesMapping;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MemberRequestDto {
    private Long id;
    private String userId;
    private String password;
    private String phoneNo;
    private String telcoTycd; //통신사 구분 코드
    private LocalDateTime registerDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;
    private List<MemberAuthoritiesMapping> memberAuthoritiesMappingList;
    public Member toEntity() {
        return Member.builder()
                .id(id)
                .userId(userId)
                .password(password)
                .phoneNo(phoneNo)
                .telcoTycd(telcoTycd)
                .registerDate(registerDate)
                .updateDate(updateDate)
                .deleteDate(deleteDate)
                .build();
    }
}
