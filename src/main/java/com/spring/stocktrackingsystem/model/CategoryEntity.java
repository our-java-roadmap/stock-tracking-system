package com.spring.stocktrackingsystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "categories")
public class CategoryEntity extends BaseEntity{

    private static final long serialVersionUID = 4522702885625062785L;

    @Column(name = "name")
    private String name;

    @Column(name = "tax_rate")
    private Integer taxRate;

}
