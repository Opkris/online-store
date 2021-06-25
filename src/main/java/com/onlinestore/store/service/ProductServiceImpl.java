package com.onlinestore.store.service;

import com.onlinestore.store.entity.ProductEntity;
import com.onlinestore.store.exeption.NotFoundException;
import com.onlinestore.store.repository.ProductEntityRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor // create default constructor
public class ProductServiceImpl implements ProductService {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public List<ProductEntity> findAll() {
        return productEntityRepository.findAll();
    }

    @Override
    @SneakyThrows // so i dont need to mark my method as throw exception
    public ProductEntity findById(Integer id) {
        return productEntityRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found"));
    }
}
