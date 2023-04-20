package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.GetMapper;
import com.example.miniProj3.domain.dto.FooterResponseDto;
import com.example.miniProj3.domain.dto.HeaderResponseDto;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Slf4j
public class CommonServiceImpl implements CommonService{
    private final GetMapper getMapper;

    @Override
    public List<HeaderResponseDto> getHeader() {
        return getMapper.getHeader();
    }

    @Override
    public FooterResponseDto getFooter() {
        return getMapper.getFooter();
    }
}
