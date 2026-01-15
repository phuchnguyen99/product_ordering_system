package com.phuchnguyen99.orderdataaccess.adapter;

import com.phuchnguyen99.core.Order;
import com.phuchnguyen99.orderapplicationservice.output.repository.OrderRepository;
import com.phuchnguyen99.orderdataaccess.repository.OrderJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public void saveOrder(final Order order) {

    }
}
