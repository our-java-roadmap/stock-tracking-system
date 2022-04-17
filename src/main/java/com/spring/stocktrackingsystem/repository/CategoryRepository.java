package com.spring.stocktrackingsystem.repository;

import com.spring.stocktrackingsystem.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    boolean existsByName(String name);
}
