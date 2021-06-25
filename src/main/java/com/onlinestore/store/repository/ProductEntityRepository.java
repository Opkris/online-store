package com.onlinestore.store.repository;

import com.onlinestore.store.entity.OrderEntity;
import com.onlinestore.store.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {
}
