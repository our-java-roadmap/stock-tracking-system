package com.spring.stocktrackingsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class ProductEntity extends BaseEntity{

    private static final long serialVersionUID = 7676359856075340758L;

    @Column(name = "name")
    private String name;

    @Column(name = "tax_free_price")
    private BigDecimal taxFreePrice;

    @Column(name = "taxed_price")
    private BigDecimal taxedPrice;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity categoryEntity;
}
