package com.bayu.rest.api.thymeleaf.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record CreateProductResponse(
        Long id,
        String name,
        BigDecimal price
) {
}
