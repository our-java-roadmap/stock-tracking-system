package com.spring.stocktrackingsystem.request;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateProductRequestDto {

    private String name;
    private BigDecimal taxFreePrice;
    private BigDecimal taxedPrice;
    private Integer amount;
    private Integer categoryId;
}
