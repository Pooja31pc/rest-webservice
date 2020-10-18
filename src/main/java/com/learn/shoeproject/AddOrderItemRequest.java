package com.learn.shoeproject;

public class AddOrderItemRequest {

    private int quantity;
    private int totalPrice;
    private int size;
    private int customerId;
    private int shoeId;

    public AddOrderItemRequest() {
    }

    public AddOrderItemRequest(int quantity, int totalPrice, int size, int customerId, int shoeId) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.size = size;
        this.customerId = customerId;
        this.shoeId = shoeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShoeId() {
        return shoeId;
    }

    public void setShoeId(int shoeId) {
        this.shoeId = shoeId;
    }
}
