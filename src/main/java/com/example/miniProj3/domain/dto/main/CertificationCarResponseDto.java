package com.example.miniProj3.domain.dto.main;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CertificationCarResponseDto {
    private String head;
    private String body;
    private String inputText;
    private String footerFirst;
    private String footerSecond;
    private String headImageUrl;
}
