package com.onlinestore.store.service;

import com.onlinestore.store.dto.FinishPurchaseRequest;

public interface PurchaseService {

    Integer finishPurchase(FinishPurchaseRequest request);
}
