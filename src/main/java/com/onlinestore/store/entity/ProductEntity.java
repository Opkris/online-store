package com.onlinestore.store.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "product_table")
@Entity
@Data
public class ProductEntity extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String image; // will store images in Base 64

    @Column
    private BigDecimal price; // BigDecimal is a object in java to store money

}