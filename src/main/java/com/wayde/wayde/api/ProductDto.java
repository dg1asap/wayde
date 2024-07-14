package com.wayde.wayde.api;

import java.math.BigDecimal;

public record ProductDto(Long id, String name, BigDecimal money) {
}
