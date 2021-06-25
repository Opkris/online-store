package com.onlinestore.store.controller;

import com.onlinestore.store.entity.ProductEntity;
import com.onlinestore.store.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){
        log.info("Handling get all products request");
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public ProductEntity findById(@PathVariable Integer id){
        log.info("Handling get product by id: {}", id);
        return productService.findById(id);
    }
}
