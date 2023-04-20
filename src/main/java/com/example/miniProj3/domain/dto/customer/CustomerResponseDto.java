package com.example.miniProj3.domain.dto.customer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomerResponseDto {
    private String headerHead;
    private String headerBody;
    private String headerFooter;
    private String email;
    private String service;
    private String body;
    private String imageUrl;
}
