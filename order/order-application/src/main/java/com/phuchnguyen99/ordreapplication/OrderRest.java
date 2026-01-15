package com.phuchnguyen99.ordreapplication;

import com.phuchnguyen99.orderapplicationservice.input.OrderApplicationService;
import com.phuchnguyen99.orderdomaincore.dto.create.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRest {
    @Autowired
    private OrderApplicationService orderApplicationService;

    @PostMapping
    public void createOrder(@RequestBody CreateOrderRequest createOrderRequest){
        System.out.println("recieve request " + createOrderRequest.getRequestProducts().get(0));
        orderApplicationService.createOrder(createOrderRequest);
    }

}
