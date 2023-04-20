package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.customer.*;

import java.util.List;

public interface CustomerPageService {
    List<CustomerResponseDto> getCustomer();
    List<BoardListResponseDto> getBoardList();
    BoardViewResponseDto findBoardView(Long id);
    List<FaqResponseDto> getFaqList();
    List<PrivacyResponseDto> getPrivacyList();
    List<ServiceResponseDto> getServiceList();
}
