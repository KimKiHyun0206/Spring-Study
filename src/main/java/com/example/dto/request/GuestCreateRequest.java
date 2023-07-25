package com.example.dto.request;

import lombok.Data;

@Data
public class GuestCreateRequest {
    private final Long id;
    private final String name;
}
