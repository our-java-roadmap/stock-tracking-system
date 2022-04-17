package com.spring.stocktrackingsystem.request;

import lombok.Data;

@Data
public class CreateCategoryRequestDto {

    private String name;
    private Integer taxRate;
}
