package com.gabezy.userapi.domain.entities.dtos;

public record UserDTO (
        Long id,
        String username,
        String email,
        Double hourlyPrice
) {
}
