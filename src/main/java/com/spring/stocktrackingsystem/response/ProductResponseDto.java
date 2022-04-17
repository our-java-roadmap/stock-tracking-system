package com.spring.stocktrackingsystem.response;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductResponseDto {

    private Integer id;
    private String name;
    private BigDecimal taxFreePrice;
    private BigDecimal taxedPrice;
    private Integer amount;
    private CategoryResponseDto categoryResponseDto;
}
