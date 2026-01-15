package com.phuchnguyen99.core;

import java.util.UUID;

public class Product {
    private UUID productUUID;
    private String productName;
    private Integer productQuantity;

    public Product(String productName, Integer productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public Product(UUID productUUID, String productName, Integer productQuantity) {
        this.productUUID = productUUID;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public UUID getProductUUID() {
        return productUUID;
    }

    public void setProductUUID(UUID productUUID) {
        this.productUUID = productUUID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
