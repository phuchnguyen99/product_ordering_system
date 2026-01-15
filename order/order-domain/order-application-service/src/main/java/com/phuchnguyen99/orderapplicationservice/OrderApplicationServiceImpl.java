package com.phuchnguyen99.orderapplicationservice;

import com.phuchnguyen99.core.Order;
import com.phuchnguyen99.inventoryapplicationservice.output.InventoryRepository;
import com.phuchnguyen99.orderapplicationservice.exceptions.OrderApplicationServiceException;
import com.phuchnguyen99.orderapplicationservice.exceptions.OrderRepositoryException;
import com.phuchnguyen99.orderapplicationservice.input.OrderApplicationService;
import com.phuchnguyen99.orderapplicationservice.output.repository.OrderRepository;
import com.phuchnguyen99.orderdomaincore.dto.create.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public class OrderApplicationServiceImpl implements OrderApplicationService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public void createOrder(final CreateOrderRequest createOrderRequest) {
        /**
         * todo: create an order
         *  - convert createOrderResponse to Order.
         *  - check if the item available???
         *  - handle exception
         */
        try {
            final Order order =  OrderApplicationServiceHelper.covertCreateOrderRequestToOrders(createOrderRequest);
            //boolean isOrderValid = inventoryRepository.validateProducts(order.getProducts());
            boolean isOrderValid = true;
            System.out.println("is order valid");
            if(!isOrderValid){
                throw new OrderApplicationServiceException("The order is invalid");
            }
            orderRepository.saveOrder(order);
        }
        catch (final OrderRepositoryException e){
            System.out.println("Unable to save order: " + e.getMessage());
        }

    }
}
