package com.gabezy.payrollapi.domain.entities.dtos;

public record UserClientDTO (
        Long id,
        String username,
        String email,
        Double hourlyPrice
) {
}
