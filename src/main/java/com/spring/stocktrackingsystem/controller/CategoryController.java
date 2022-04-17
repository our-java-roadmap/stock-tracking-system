package com.spring.stocktrackingsystem.controller;

import com.spring.stocktrackingsystem.request.CreateCategoryRequestDto;
import com.spring.stocktrackingsystem.response.CategoryResponseDto;
import com.spring.stocktrackingsystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping
    public CategoryResponseDto createCategory(@RequestBody @Valid CreateCategoryRequestDto requestDto) {
        return categoryService.createCategory(requestDto);
    }
}
