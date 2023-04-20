package com.example.miniProj3.domain.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MemberAuthoritiesMappingDto {

    private Long memberAuthoritiesMappingId;
    private Long memberId;
    private Long memberAuthoritiesCodeId;
}
