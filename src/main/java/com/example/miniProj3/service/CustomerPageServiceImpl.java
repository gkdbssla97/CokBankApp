package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.GetMapper;
import com.example.miniProj3.domain.dto.customer.*;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Slf4j
public class CustomerPageServiceImpl implements CustomerPageService{
    private final GetMapper getMapper;

    @Override
    public List<CustomerResponseDto> getCustomer() {
        return getMapper.getCustomer();
    }

    @Override
    public List<BoardListResponseDto> getBoardList() {
        return getMapper.getBoardList();
    }

    @Override
    public BoardViewResponseDto findBoardView(Long id) {
        return getMapper.findBoardView(id);
    }

    @Override
    public List<FaqResponseDto> getFaqList() {
        return getMapper.getFaqList();
    }

    @Override
    public List<PrivacyResponseDto> getPrivacyList() {
        return getMapper.getPrivacyList();
    }

    @Override
    public List<ServiceResponseDto> getServiceList() {
        return getMapper.getServiceList();
    }
}
