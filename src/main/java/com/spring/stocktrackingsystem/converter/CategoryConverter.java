package com.spring.stocktrackingsystem.converter;

import com.spring.stocktrackingsystem.model.CategoryEntity;
import com.spring.stocktrackingsystem.request.CreateCategoryRequestDto;
import com.spring.stocktrackingsystem.response.CategoryResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {

    public CategoryResponseDto convert(CategoryEntity entity) {
        if (entity == null) {
            return null;
        }

        CategoryResponseDto categoryResponse = new CategoryResponseDto();
        categoryResponse.setId(entity.getId());
        categoryResponse.setName(entity.getName());
        categoryResponse.setTaxRate(entity.getTaxRate());

        return categoryResponse;
    }

    public CategoryEntity convert(CreateCategoryRequestDto request) {
        if (request == null) {
            return null;
        }

        CategoryEntity entity = new CategoryEntity();
        entity.setName(request.getName());
        entity.setTaxRate(request.getTaxRate());

        return entity;
    }
}
