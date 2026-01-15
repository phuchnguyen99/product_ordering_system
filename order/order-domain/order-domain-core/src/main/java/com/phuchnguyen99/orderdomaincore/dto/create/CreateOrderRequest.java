package com.phuchnguyen99.orderdomaincore.dto.create;

import java.util.List;

public class CreateOrderRequest {
    private List<RequestProduct> requestProducts;

    public CreateOrderRequest(List<RequestProduct> requestProducts) {
        this.requestProducts = requestProducts;
    }

    public List<RequestProduct> getRequestProducts() {
        return requestProducts;
    }

    public void setRequestProducts(List<RequestProduct> requestProducts) {
        this.requestProducts = requestProducts;
    }
}
