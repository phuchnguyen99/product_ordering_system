package com.phuchnguyen99.orderdataaccess.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "order_product_table")
@Entity
public class OrderedProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID orderedProductUUID;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private OrderEntity orderEntity;
    private String orderProductName;
    private Integer orderProductQuantity;

    public OrderedProductEntity(final UUID orderedProductUUID, final OrderEntity orderEntity,
                                final String orderProductName, final Integer orderProductQuantity) {
        this.orderedProductUUID = orderedProductUUID;
        this.orderEntity = orderEntity;
        this.orderProductName = orderProductName;
        this.orderProductQuantity = orderProductQuantity;
    }

    public OrderedProductEntity() {
    }

    public String getOrderProductName() {
        return orderProductName;
    }

    public void setOrderProductName(String orderProductName) {
        this.orderProductName = orderProductName;
    }

    public Integer getOrderProductQuantity() {
        return orderProductQuantity;
    }

    public void setOrderProductQuantity(Integer orderProductQuantity) {
        this.orderProductQuantity = orderProductQuantity;
    }

    public UUID getOrderedProductUUID() {
        return orderedProductUUID;
    }

    public void setOrderedProductUUID(UUID orderedProductUUID) {
        this.orderedProductUUID = orderedProductUUID;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }
}
