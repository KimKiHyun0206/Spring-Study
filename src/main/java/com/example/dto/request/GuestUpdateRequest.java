package com.example.dto.request;


import lombok.Data;

@Data
public class GuestUpdateRequest {
    private final Long id;
    private final String name;
}
