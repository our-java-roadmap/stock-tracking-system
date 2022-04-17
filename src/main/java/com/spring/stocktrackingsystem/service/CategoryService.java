package com.spring.stocktrackingsystem.service;

import com.spring.stocktrackingsystem.request.CreateCategoryRequestDto;
import com.spring.stocktrackingsystem.response.CategoryResponseDto;

public interface CategoryService {

CategoryResponseDto createCategory(CreateCategoryRequestDto requestDto);

}
