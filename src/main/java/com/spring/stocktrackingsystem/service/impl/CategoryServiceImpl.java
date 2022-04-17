package com.spring.stocktrackingsystem.service.impl;

import com.spring.stocktrackingsystem.converter.CategoryConverter;
import com.spring.stocktrackingsystem.model.CategoryEntity;
import com.spring.stocktrackingsystem.repository.CategoryRepository;
import com.spring.stocktrackingsystem.request.CreateCategoryRequestDto;
import com.spring.stocktrackingsystem.response.CategoryResponseDto;
import com.spring.stocktrackingsystem.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryConverter categoryConverter;
    private final CategoryRepository categoryRepository;

    @Transactional
    @Override
    public CategoryResponseDto createCategory(CreateCategoryRequestDto requestDto) {
        CategoryEntity convert = categoryConverter.convert(requestDto);
        if (categoryRepository.existsByName(requestDto.getName())) {
            //TODO: hata fırlatmalı
        }
        CategoryEntity save = categoryRepository.save(convert);
        CategoryResponseDto convert1 = categoryConverter.convert(save);
        return convert1;
    }
}
