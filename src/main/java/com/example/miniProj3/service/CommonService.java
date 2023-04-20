package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.FooterResponseDto;
import com.example.miniProj3.domain.dto.HeaderResponseDto;

import java.util.List;

public interface CommonService {
    List<HeaderResponseDto> getHeader();
    FooterResponseDto getFooter();
}
