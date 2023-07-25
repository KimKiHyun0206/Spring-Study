package com.example.dto.response;

import com.example.spring.entity.Guest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GuestResponse {
    private Long id;
    private String name;

    public static GuestResponse from(Guest guest) {
        return new GuestResponse(
                guest.getId(),
                guest.getName()
        );
    }
}
