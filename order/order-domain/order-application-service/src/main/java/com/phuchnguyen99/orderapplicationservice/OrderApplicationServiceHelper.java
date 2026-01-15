package com.phuchnguyen99.orderapplicationservice;

import com.phuchnguyen99.core.Order;
import com.phuchnguyen99.core.Product;
import com.phuchnguyen99.orderdomaincore.dto.create.CreateOrderRequest;
import com.phuchnguyen99.orderdomaincore.dto.create.RequestProduct;

import java.util.ArrayList;
import java.util.List;

public class OrderApplicationServiceHelper {
    public static Product convertRequestOrderCommandToProduct(final RequestProduct requestProduct){
        return new Product(requestProduct.getItemName(), requestProduct.getItemQuantity());
    }

    public static Order covertCreateOrderRequestToOrders(final CreateOrderRequest createOrderRequest){
        final List<Product> products = new ArrayList<>();
        createOrderRequest.getRequestProducts().forEach(requestProduct -> {
            final Product order = convertRequestOrderCommandToProduct(requestProduct);
            products.add(order);
        });
        return new Order(products);
    }
}
