package com.bayu.rest.api.thymeleaf.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record CreateProductRequest(
        String name,
        BigDecimal price
) {
}
