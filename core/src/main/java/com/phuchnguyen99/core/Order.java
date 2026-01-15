package com.phuchnguyen99.core;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID orderId;
    private List<Product> products;

    public Order(final List<Product> products) {
        this.products = products;
    }

    public Order(final UUID orderId, final List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
