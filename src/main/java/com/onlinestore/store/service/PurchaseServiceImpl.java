package com.onlinestore.store.service;

import com.onlinestore.store.dto.FinishPurchaseRequest;
import com.onlinestore.store.entity.OrderEntity;
import com.onlinestore.store.entity.ProductEntity;
import com.onlinestore.store.entity.PurchaseItemEntity;
import com.onlinestore.store.repository.OrderEntityRepository;
import com.onlinestore.store.repository.PurchaseItemEntityRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j // if anything goes wrong we are able to trace "failed"
public class PurchaseServiceImpl implements PurchaseService {

    private final ProductService productService;
    private final UserService userService;
    private final OrderEntityRepository orderEntityRepository;
    private final PurchaseItemEntityRepository purchaseItemEntityRepository;


    @Override
    public Integer finishPurchase(FinishPurchaseRequest request) {

        log.info("creating order entity from request: {}", request);
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserEntity(
                // it is important that it is the same order as the parameters in the function
                userService.findOrCreateUser(
                        request.getUserName(),
                        request.getUserSurname(),
                        request.getPhone(),
                        request.getEmail(),
                        request.getAddress()
                ));
        orderEntity.setComment(request.getComment());
        orderEntity = orderEntityRepository.save(orderEntity);

        for (Map.Entry<Integer, Integer> entry : request.getProductIdProductCount().entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            ProductEntity productEntity = productService.findById(key);
            PurchaseItemEntity product = new PurchaseItemEntity();

            product.setProductEntity(productEntity);
            product.setCount(value);
            product.setOrderEntity(orderEntity);

            purchaseItemEntityRepository.save(product);
        }
        return orderEntity.getId();
    }
}
