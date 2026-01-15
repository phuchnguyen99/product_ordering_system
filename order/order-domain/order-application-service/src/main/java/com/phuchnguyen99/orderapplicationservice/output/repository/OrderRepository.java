package com.phuchnguyen99.orderapplicationservice.output.repository;


import com.phuchnguyen99.core.Order;
import com.phuchnguyen99.orderapplicationservice.exceptions.OrderRepositoryException;


public interface OrderRepository {
    void saveOrder(Order order) throws OrderRepositoryException;
}
