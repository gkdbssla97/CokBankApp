package com.example.miniProj3.service;

import com.example.miniProj3.domain.dto.event.EventResponseDto;

import java.util.List;

public interface EventPageService {
    List<EventResponseDto> getEvent();
    EventResponseDto findEventById(Long id);
    List<EventResponseDto> classificationEvent(List<EventResponseDto> eventList, int value);
}
