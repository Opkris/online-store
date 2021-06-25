package com.onlinestore.store.repository;

import com.onlinestore.store.entity.OrderEntity;
import com.onlinestore.store.entity.PurchaseItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemEntityRepository extends JpaRepository<PurchaseItemEntity, Integer> {
}
