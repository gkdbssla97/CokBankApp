package com.example.miniProj3.domain.dto.customer;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ServiceResponseDto {
    private String title;
    private String topHead;
    private String topBody;
    private String bottomHead;
    private String bottomBodyFirst;
    private String bottomBodySecond;
}
