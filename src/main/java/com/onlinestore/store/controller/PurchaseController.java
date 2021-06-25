package com.onlinestore.store.controller;


import com.onlinestore.store.dto.FinishPurchaseRequest;
import com.onlinestore.store.dto.FinishPurchaseResponse;
import com.onlinestore.store.service.PurchaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@AllArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;


    //TODO return usernumber, order..

    @PostMapping("/finishPurchase")
    public ResponseEntity finishPurchase(@Valid @RequestBody FinishPurchaseRequest request){
        log.info("Handling finish purchase request: {}", request);
        Integer orderId = purchaseService.finishPurchase(request);
        return ResponseEntity.ok(new FinishPurchaseResponse(orderId));

    }


}
