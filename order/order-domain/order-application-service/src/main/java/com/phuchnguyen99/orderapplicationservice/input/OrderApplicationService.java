package com.phuchnguyen99.orderapplicationservice.input;

import com.phuchnguyen99.orderdomaincore.dto.create.CreateOrderRequest;

public interface OrderApplicationService {
    void createOrder(CreateOrderRequest createOrderRequest);
}
