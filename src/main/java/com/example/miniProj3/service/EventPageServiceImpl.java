package com.example.miniProj3.service;

import com.example.miniProj3.domain.dao.GetMapper;
import com.example.miniProj3.domain.dto.event.EventResponseDto;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
@Slf4j
public class EventPageServiceImpl implements EventPageService{
    private final GetMapper getMapper;

    @Override
    public List<EventResponseDto> getEvent() {
        return getMapper.getEvent();
    }

    @Override
    public EventResponseDto findEventById(Long id) {
        return getMapper.findEventById(id);
    }

    @Override
    public List<EventResponseDto> classificationEvent(List<EventResponseDto> eventList, int value) {
        List<EventResponseDto> onGoingEvent = new ArrayList<>();
        List<EventResponseDto> endedEvent = new ArrayList<>();

        for (EventResponseDto eventResponseDto : eventList) {
            String eventPeriod = eventResponseDto.getFooter();

            String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            String[] dateTime = eventPeriod.split(" ~ ");

            String startTime = dateTime[0];
            String endTime = dateTime[1];

            if (startTime.compareTo(now) <= 0 && endTime.compareTo(now) >= 0) {
                onGoingEvent.add(eventResponseDto);
            } else {
                endedEvent.add(eventResponseDto);
            }
        }

        // 진행중 이벤트
        if (value == 1) {
            return onGoingEvent;
        } else if (value == 2) {
            // 종료 이벤트
            return endedEvent;
        }
        return eventList;
    }
}
