package com.phuchnguyen99.orderdataaccess.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Table(name = "orders_table", schema = "orders_schema")
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID orderId;

    @OneToMany(mappedBy = "orderEntity")
    private List<OrderedProductEntity> orderedProductEntities;

    public OrderEntity(final UUID orderId, final List<OrderedProductEntity> orderedProductEntities) {
        this.orderId = orderId;
        this.orderedProductEntities = orderedProductEntities;
    }

    public OrderEntity() {
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(final UUID orderId) {
        this.orderId = orderId;
    }

    public List<OrderedProductEntity> getOrderedProductEntities() {
        return orderedProductEntities;
    }

    public void setOrderedProductEntities(final List<OrderedProductEntity> orderedProductEntities) {
        this.orderedProductEntities = orderedProductEntities;
    }
}
