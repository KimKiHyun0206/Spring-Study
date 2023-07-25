package com.example.spring.service;

import com.example.spring.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepository guestRepository;

    @Transactional
    public
}
