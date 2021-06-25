package com.onlinestore.store.service;

import com.onlinestore.store.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findById(Integer id);
}
